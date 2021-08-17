package com.cris.apppeliculav01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import Controller.PeliculaController;
import Datos.Pelicula;

public class DetalleView extends AppCompatActivity {

    TextView titulo;
    ImageView portada;
    String t = null;
    String g = null;
    String nombre = null;
    int imagen = 0;
    PeliculaController p = new PeliculaController();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_view);

        titulo = (TextView) findViewById(R.id.txtTituloDetalle);
        portada = (ImageView) findViewById(R.id.ivPortada);
        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            t = extras.getString("nombre");
            g = extras.getString("eleccion");

        }

        if(g.equals("Terror"))
        {
            p.generarTerror();
            for(int i=0;i<p.pelicula.size();i++)
            {
                nombre = p.pelicula.get(i).nombre;
                imagen = p.pelicula.get(i).imagen;

                if(nombre.equals(t))
                {

                    cargarInfo();
                }
            }
        }
        if(g.equals("Comedia"))
        {
            p.generarComedia();
            for(int i=0;i<p.pelicula.size();i++)
            {
                nombre = p.pelicula.get(i).nombre;
                imagen = p.pelicula.get(i).imagen;
                if(nombre.equals(t))
                {


                }
            }
        }
        if(g.equals("Drama"))
        {
            p.generarDrama();
            for(int i=0;i<p.pelicula.size();i++)
            {
                nombre = p.pelicula.get(i).nombre;
                if(nombre.equals(t))
                {
                    cargarInfo();
                }
            }
        }
        if(g.equals("Accion"))
        {
            p.generarAccion();
            for(int i=0;i<p.pelicula.size();i++)
            {
                nombre = p.pelicula.get(i).nombre;
                if(nombre.equals(t))
                {
                    cargarInfo();
                }
            }
        }







    }
    public void cargarInfo()
    {
        titulo.setText(nombre);
        portada.setImageResource(imagen);




    }
}