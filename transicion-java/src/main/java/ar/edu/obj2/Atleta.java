package ar.edu.obj2;

public class Atleta extends Persona{

    private Integer masaMuscular = 4;

    private Integer cantTecnicas = 2;

    public Atleta(Integer edad){
        super.edad();
    }

    @Override
    public Integer potencia(){
        return super.potencia() + (masaMuscular * cantTecnicas);
    }

    @Override 
    public Integer esDestacado(){
        return super.esDestacado() || cantTecnicas > 5
    }

    public void entrenar(Integer dias){
        masaMuscular += dias / 5 
    }

    public void aprender(){
        cantTecnicas += 1
    }

    @Override
    public void ofrecerTributo(Planeta planeta){
        planeta.construirMurallas(km:2);
    }

}