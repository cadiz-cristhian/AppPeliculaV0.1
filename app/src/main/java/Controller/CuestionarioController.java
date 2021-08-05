package Controller;

import com.cris.apppeliculav01.CuestionarioView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import Datos.Cuestionario;
import Datos.Pregunta;


public class CuestionarioController
{
    Cuestionario cues = new Cuestionario();
    CuestionarioView cvista = new CuestionarioView();
    PeliculaController pc = new PeliculaController();
    public Pregunta ArrayPregunta[] = { new Pregunta(0,"De los siguientes generos ¿cuál prefieres?",  "Terror",  "Comedia", "Drama",  "Acción" ),
            new Pregunta(1,"Si te persigue un monstruo, ¿ Qué harías?","¿Te escondes y esperas? " ,  "¿Lo enfrentas porque crees que todo es una broma?" , "¿Tratas de hablar con el para entender sus motivaciones?",  "¿Lo enfrentas y peleas con él?"),
            new Pregunta(2,"Encuentras a tu mejor amigue con tu novie. ¿Qué harías?","Planeas una venganza " ,"Te ríes de la situación y te unes","Das un portazo y te pones a llorar ", "Haces el viaje que siempre planeaste"),
            new Pregunta(3,"Si tuvieras superpoderes ¿Cuál de estos elegirías?","Ser Invisible ","Ser multimillonario ","Leer la mente de las personas " , "Tener Superfuerza "),
            new Pregunta(4,"¿Cuál de las siguientes citas elegirías?","Una visita guiada al cementerio " , "Ir a una Disco ","Cenar en un restaurant ",  "Hacer trekking " )};



    HashMap<Integer,Integer> resp = new HashMap<Integer,Integer>(); //Hashmap que almacena las respuestas a las preguntas
    int total;
    String generoElegido;





}
