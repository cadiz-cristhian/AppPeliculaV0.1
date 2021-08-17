package com.cris.apppeliculav01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import Controller.ListaController;
import Datos.Pelicula;

public class Resultado extends AppCompatActivity implements Serializable{

    public ArrayList<Pelicula> pelicula;
    String genero;
    TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        resultado = findViewById(R.id.txtTituloPelicula);

        recibirDatos();
        init();

    }
    public void recibirDatos()
    {
        Bundle extras = getIntent().getExtras();
        genero = extras.getString("Genero");
        resultado.setText(genero);

    }
    public void init() {

        if(genero.equals("Terror"))
        {
            pelicula = new ArrayList<>();
            pelicula.add(new Pelicula(R.drawable.psicosis,"Psicosis","1960","Alfred Hitchcock",8.5,"Terror"));
            pelicula.add(new Pelicula(R.drawable.alien_poster,"Alien, el octavo pasajero","1979","Ridley Scott",8.4,"Terror"));
            pelicula.add(new Pelicula(R.drawable.tumbbad,"Tumbbad","2018","Rahi Anil Barve",8.3,"Terror"));
            pelicula.add(new Pelicula(R.drawable.isawthedevil,"I saw the devil","2010","Jee-woon Kim",7.8,"Terror"));
            pelicula.add(new Pelicula(R.drawable.get_out,"Get Out","2017","Jordan Peele ",7.7,"Terror"));
            pelicula.add(new Pelicula(R.drawable.pesadilla,"A nightmare on elm street","1984","Wes Craven",7.5,"Terror"));
            pelicula.add(new Pelicula(R.drawable.texascm,"Texas Chainsaw Massacre","1974","Tobe Hooper",7.5,"Terror"));
            pelicula.add(new Pelicula(R.drawable.eraserhead,"EraserHead","1977","David Lynch",7.4,"Terror"));
            pelicula.add(new Pelicula(R.drawable.hereditary,"Hereditary","2018","Ari Aster",7.3,"Terror"));
            pelicula.add(new Pelicula(R.drawable.midsommar,"Midsommar","2019","Ari Aster",7.1,"Terror"));

        }
        if(genero.equals("Comedia"))
        {
            pelicula = new ArrayList<>();
            pelicula.add( new Pelicula(1,"El Grinch","2000","Ron Howard",6.2,"Comedia"));
            pelicula.add( new Pelicula(2,"Mean Girls","2003","Mark Waters",7.0,"Comedia"));
            pelicula.add( new Pelicula(3,"Bride Wars","2009","JGary Winick",5.5,"Comedia"));
            pelicula.add( new Pelicula(4,"Miss Congeniality","2000","Donald Petrie",6.3,"Comedia"));
            pelicula.add( new Pelicula(5,"Toy Story","1995","John Lasseter",8.3,"Comedia"));
            pelicula.add( new Pelicula(6,"The Grand Budapest Hotel","2014","Wes Anderson",8.1,"Comedia"));
            pelicula.add( new Pelicula(7,"The Truman Show","1998","Peter Weir",8.1,"Comedia"));
            pelicula.add( new Pelicula(8,"Easy A","2010","Will Gluck",7.0,"Comedia"));
            pelicula.add( new Pelicula(9,"Jojo Rabbit","2019","Taika Waititi",7.9,"Comedia"));
            pelicula.add( new Pelicula(10, "Shrek","2001","Andrew Adamson",7.9,"Comedia"));
        }
        if(genero.equals("Drama"))
        {
            pelicula = new ArrayList<>();
            pelicula.add( new Pelicula(1,"Parasite","2019","Bong Joon Ho",8.6,"Drama"));
            pelicula.add( new Pelicula(1,"Gone Girl","2014","David Fincher",8.1,"Drama"));
            pelicula.add( new Pelicula(1,"Portrait de la jeune fille en feu","2019","Céline Sciamma",8.1,"Drama"));
            pelicula.add( new Pelicula(1,"Arrival","2016","David Villeneuve",7.9,"Drama"));
            pelicula.add( new Pelicula(1,"The Danish Girl","2015","Tom Hooper",7.1,"Drama"));
            pelicula.add( new Pelicula(1,"Laurance Anyways","2012","Xavier Dolan",7.7,"Drama"));
            pelicula.add( new Pelicula(1,"The Room","2015","Lenny Abrahamson",8.1,"Drama"));
            pelicula.add( new Pelicula(1,"Lady Bird","2017","Greta Gerwig",7.4,"Drama"));
            pelicula.add( new Pelicula(1,"Edward Scissorhands","1990","Tim Burton",7.9,"Drama"));
            pelicula.add( new Pelicula(1,"Becoming Jane","2007","Julian Jarrold",7.0,"Drama"));
        }
        if(genero.equals("Accion"))
        {
            pelicula = new ArrayList<>();
            pelicula.add(new Pelicula(1,"Inception","2010","Chistopher Nolan",8.8,"Acción"));
            pelicula.add(new Pelicula(1,"Matrix","1999","Lana & Lily Wachowski",8.7,"Acción"));
            pelicula.add(new Pelicula(1,"Predator","1987","John McTiernan",7.8,"Acción"));
            pelicula.add(new Pelicula(1,"Kill Bill: Volume 1","2003","Quentin Tarantino",8.1,"Acción"));
            pelicula.add(new Pelicula(1,"Mad Max","2015","George Miller",8.1,"Acción"));
            pelicula.add(new Pelicula(1,"Lucy","2014","Luc Besson",6.4,"Acción"));
            pelicula.add(new Pelicula(1,"The Hunger Games","2012","Gary Ross",7.2,"Acción"));
            pelicula.add(new Pelicula(1,"Jurassic Park","1993","Stephen Spielberg",8.1,"Acción"));
            pelicula.add(new Pelicula(1,"Harry Potter and the Sorcerer's Stone","2001","Chris Columbus",7.6,"Acción"));
            pelicula.add(new Pelicula(1,"The Dark Knight","2008","Christopher Nolan",9.0,"Acción"));


        }
        ListaController listaController = new ListaController(pelicula, this,genero);
        RecyclerView recyclerView = findViewById(R.id.lstPeliculas);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listaController);

    }
}