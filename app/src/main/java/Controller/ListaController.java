package Controller;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.cris.apppeliculav01.DetalleView;
import com.cris.apppeliculav01.R;
import com.cris.apppeliculav01.Resultado;

import java.util.ArrayList;
import java.util.List;

import Datos.Pelicula;

public class ListaController extends RecyclerView.Adapter<ListaController.ViewHolder> {
    private List<Pelicula> peliculaList;
    private LayoutInflater inflater;
    private Context context;
    private String genero;

    public ListaController(List<Pelicula> itemList, Context context, String genero)
    {
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        this.peliculaList = itemList;
        this.genero = genero;

    }
    @Override
    public int getItemCount()
    {
        return peliculaList.size();
    }
    @Override
    public ListaController.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = inflater.inflate(R.layout.lista_peliculas, null);
        return new ListaController.ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final ListaController.ViewHolder holder, final int position)
    {
        holder.bindData(peliculaList.get(position));
        holder.setOnClickListener();
    }
    public void setItems(List<Pelicula> items)
    {
        peliculaList = items;
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView poster;
        TextView nombre,director,detalle;
        Context context;
        Resultado r;

        ViewHolder(View view)
        {
            super(view);
            context = view.getContext();
            poster = itemView.findViewById(R.id.ivPoster);
            nombre = itemView.findViewById(R.id.txtNombrePelicula);
            director = itemView.findViewById(R.id.txtNombreDirector);
            detalle = itemView.findViewById(R.id.txtRevisar);
        }
        void setOnClickListener()
        {
            detalle.setOnClickListener(this);
        }


        void bindData(final Pelicula item)
        {
            nombre.setText(item.getNombre());
            director.setText(item.getDirector());
            detalle.setText("Detalle");
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, DetalleView.class);
            intent.putExtra("nombre",nombre.getText());
            intent.putExtra("eleccion",genero);
            context.startActivity(intent);

        }
    }
}
