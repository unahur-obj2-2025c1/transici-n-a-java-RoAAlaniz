package ar.edu.unahur.obj2;

public class Persona{

    private Integer edad;

    public Integer potencia(){
        return 20;
    }

    public Integer inteligencia(){
        return edad >= 20 && edad <= 40 ? 12 : 8;
    }

    public Boolean esDestacado(){
        return edad == 25 || edad == 35;
    }
}