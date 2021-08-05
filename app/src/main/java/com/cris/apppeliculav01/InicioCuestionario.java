package com.cris.apppeliculav01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InicioCuestionario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_cuestionario);
    }
    public void pasarCuestionario (View view) {
        Intent siguiente = new Intent(this, CuestionarioView.class);
        startActivity(siguiente);
    }
}