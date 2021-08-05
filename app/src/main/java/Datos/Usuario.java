package Datos;

public class Usuario {
    public String nombre;
    public String contraseña;
    public String correo;
    public int edad;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Usuario(String nombre, String contraseña, String correo, int edad) {
        super();
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.correo = correo;
        this.edad = edad;
    }
    public Usuario() {

    }
    @Override
    public String toString() {
        return  nombre;
    }






}
