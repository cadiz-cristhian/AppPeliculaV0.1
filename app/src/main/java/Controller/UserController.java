package Controller;

import java.util.HashMap;

import Datos.Usuario;

public class UserController {

    HashMap<String, Usuario> u = new HashMap<String,Usuario>();


    // Metodo para agregar usuarios una vez que se registran
    public String AgregarUsuario(String nombre,String contrasena, String correo,int edad)
    {

        u.put(nombre, new Usuario(nombre,contrasena,correo,edad));
        //System.out.println("Hola " + u.get(nombre));
        return "Usuario registrado";

    }




}
