package com.cris.apppeliculav01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InicioUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_usuario);
    }
    // metodo para el boton
    public void pasarOpciones (View view) {
        Intent siguiente = new Intent(this, Opciones.class);
        startActivity(siguiente);
    }
    public void pasarCuestionario (View view) {
        Intent siguiente = new Intent(this, InicioCuestionario.class);
        startActivity(siguiente);
    }
    public void pasarRevisar (View view) {
        Intent siguiente = new Intent(this, ListasGuardadas.class);
        startActivity(siguiente);
    }
}