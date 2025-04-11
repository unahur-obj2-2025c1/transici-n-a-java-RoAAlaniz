package ar.edu.obj2;

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

    public void construirMurallas(Integer km){
        this.lasMurallas += km;
    }

    public void construirMuseo(){
        this.cantMuseos += 3;
    }

    public Integer potenciaAparente(){
        return personas.stream().mapToInt(persona -> persona.potencia()).max().orElse(other:0) * personas.size();
    }

    public Boolean necesitaRefozarse(){
        return potenciaAparente() > potenciaReal * 2;
    }

    public void recibirTributos(){
        personas.stream().forEach(persona -> persona.ofrecerTributo(this))
    }
}