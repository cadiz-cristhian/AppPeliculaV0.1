package com.cris.apppeliculav01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // metodo para el boton
    public void siguienteAc (View view) {
        Intent siguiente = new Intent(this, InicioUsuario.class);
        startActivity(siguiente);
    }
}