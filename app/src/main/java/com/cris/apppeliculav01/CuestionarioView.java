package com.cris.apppeliculav01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.CuestionarioController;

public class CuestionarioView extends AppCompatActivity {

    private TextView pregunta;
    private RadioButton respuestaA, respuestaB, respuestaC, respuestaD;
    private RadioGroup respuestas;
    private int contador = 0;
    private Button siguiente;
    private Button finalizar;
    private boolean ischeck = false;
    public int contadorTerror = 0;
    public int contadorAccion = 0;
    public int contadorDrama = 0;
    public int contadorComedia = 0;
    String generoElegido = null;
    HashMap<Integer,Integer> resp = new HashMap<Integer,Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario);
        pregunta = findViewById(R.id.txtPregunta);
        respuestaA = findViewById(R.id.rbRespuestaA);
        respuestaB = findViewById(R.id.rbRespuestaB);
        respuestaC = findViewById(R.id.rbRespuestaC);
        respuestaD = findViewById(R.id.rbRespuestaD);
        siguiente = findViewById(R.id.btnSiguientePregunta);
        finalizar = findViewById(R.id.btnFinalizar);
        respuestas = findViewById(R.id.rgRespuestas);
        rellenarDatos(contador);

        //Metodo para el boton, checkea si está seleccionada alguna opción
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(respuestaA.isChecked())
                {
                    ischeck = true;
                    contadorTerror = contadorTerror + 1;

                } else if (respuestaB.isChecked())
                {
                    ischeck = true;
                    contadorComedia = contadorComedia + 1;

                }else if(respuestaC.isChecked())
                {
                    ischeck = true;
                    contadorDrama = contadorDrama + 1;

                }else if (respuestaD.isChecked())
                {
                    ischeck = true;
                    contadorAccion = contadorAccion + 1;

                }
                else
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Debe seleccionar una respuesta",Toast.LENGTH_SHORT);
                    toast.show();
                }
                if(ischeck = true)
                {
                    if(contador < 4) // si ya respondió las preguntas se pasa a mostrar el resultado
                    {
                        respuestas.clearCheck();
                        contador = contador + 1;
                        rellenarDatos(contador);

                    }else {
                        resultado();
                        siguiente.setVisibility(View.INVISIBLE);
                        finalizar.setEnabled(true);

                    }
                }
            }
        });

    }
    public void rellenarDatos(int numP)
    {
        CuestionarioController cc = new CuestionarioController();
        for(int i=0;i<cc.ArrayPregunta.length;i++)
        {
            int idPregunta = cc.ArrayPregunta[i].idPregunta;

            if(idPregunta == numP)
            {
                String p = cc.ArrayPregunta[i].pregunta;
                String a = cc.ArrayPregunta[i].a;
                String b = cc.ArrayPregunta[i].b;
                String c = cc.ArrayPregunta[i].c;
                String d = cc.ArrayPregunta[i].d;

                pregunta.setText(p);
                respuestaA.setText("A: " +a);
                respuestaB.setText("B: " +b);
                respuestaC.setText("C: " +c);
                respuestaD.setText("D: " +d);
            }


        }
    }

    public void resultado() {

        int[] numeros = new int[]{contadorTerror, contadorComedia, contadorDrama, contadorAccion};
        // Asumir que el mayor es el primero
        int mayor = numeros[0];
        // Recorrer arreglo y ver si no es así
        // (comenzar desde el 1 porque el 0 ya lo tenemos contemplado arriba)
        for (int x = 1; x < numeros.length; x++) {
            if (numeros[x] > mayor) {
                mayor = numeros[x];
            }
        if(mayor == contadorTerror)
        { generoElegido = "Terror";
        }else if(mayor == contadorComedia) {
            generoElegido = "Comedia";
        }else if(mayor == contadorDrama){
            generoElegido = "Drama";
        }else if(mayor == contadorAccion){
            generoElegido = "Accion";
        }
        }
    }
    public void pasarResultado(View view)
    {

        Intent intent = new Intent(CuestionarioView.this,Resultado.class);
        intent.putExtra("Genero", generoElegido);
        startActivity(intent);


    }

}



