package ar.edu.obj2;

public class Soldado extends Persona{

    private List<Arma> armas;

    @Override
    public Integer potencia(){
        return super.potencia() + armas.stream().mapToInt(arma -> arma.potencia())sum();
    }

    @Override 
    public void ofrecerTributo(Paneta planeta){
        planeta.construirMurallas(km:5);
    }
}