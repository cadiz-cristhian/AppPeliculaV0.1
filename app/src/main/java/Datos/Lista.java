package Datos;

import java.util.*;

public class Lista {
    public int idUsuario;
    public int idLista;
    public HashMap<Integer, Pelicula> contenido = new HashMap<Integer, Pelicula>();

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLista() {
        return idLista;
    }

    public void setIdLista(int idLista) {
        this.idLista = idLista;
    }

    public HashMap<Integer, Pelicula> getContenido() {
        return contenido;
    }

    public void setContenido(HashMap<Integer, Pelicula> contenido) {
        this.contenido = contenido;
    }

    public Lista() {
        super();
    }

    public Lista(int idUsuario, int idLista, HashMap<Integer, Pelicula> contenido) {
        super();
        this.idUsuario = idUsuario;
        this.idLista = idLista;
        this.contenido = contenido;
    }

}
