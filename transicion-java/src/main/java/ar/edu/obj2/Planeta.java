package ar.edu.unahur.obj2;

import java.until.List;

public class Planeta {
    private List <Persona> habitantes;
    private Integer cantMuseos;

    public List <Persona> delegacionDiplomatica(){
        return personas.stream().filter(persona -> persona.esDestacado()).toList();
    }

    public Integer valorInicial(){
        return personas.stream().filter(persona -> persona.potencia() > 30).toList().size();
    }

    public Boolean esCulto(){
        return cantMuseos >= 2 && personas.stream().allMatch(persona -> persona.inteligencia() >= 10);
    }

    public Integer potenciaReal(){
        return personas.stream().mapToInt(persona -> persona.potencia()).sum();
    }

}