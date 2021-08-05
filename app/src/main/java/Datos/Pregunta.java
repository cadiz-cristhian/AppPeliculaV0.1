package Datos;

public class Pregunta {
    public int idPregunta;
    public String pregunta;
    public String a;
    public String b;
    public String c;
    public String d;


    public int getIdPregunta(){ return idPregunta;}
    public void setIdPregunta(int idPregunta)
    {
        this.idPregunta = idPregunta;
    }
    public String getPregunta() {
        return pregunta;
    }
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    public String getA() {
        return a;
    }
    public void setA(String a) {
        this.a = a;
    }
    public String getB() {
        return b;
    }
    public void setB(String b) {
        this.b = b;
    }
    public String getC() {
        return c;
    }
    public void setC(String c) {
        this.c = c;
    }
    public String getD() {
        return d;
    }
    public void setD(String d) {
        this.d = d;
    }
    public Pregunta(int idPregunta,String pregunta, String a, String b, String c, String d) {
        super();
        this.idPregunta = idPregunta;
        this.pregunta = pregunta;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public Pregunta() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return idPregunta+","+pregunta+","+a+","+b+","+c+","+d;
    }



}
