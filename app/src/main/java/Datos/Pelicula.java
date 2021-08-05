package Datos;

import java.io.Serializable;

public class Pelicula  {
    public int imagen;
    public String nombre;
    public String fecha;
    public String director;
    public double rating;
    public String genero;

    public Pelicula() {
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public Pelicula(int imagen,String nombre, String fecha, String director, double rating, String genero) {
        super();
        this.imagen = imagen;
        this.nombre = nombre;
        this.fecha = fecha;
        this.director = director;
        this.rating = rating;
        this.genero = genero;

    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public String toString() {
        return "Pelicula [imagen=" + imagen + ",nombre=" + nombre + ", fecha=" + fecha + ", director=" + director + ", rating=" + rating
                + "]";
    }


    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
