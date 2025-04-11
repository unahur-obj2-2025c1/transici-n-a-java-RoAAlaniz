package ar.edu.obj2;

public class Docente extends Persona{
    
    private Integer cantCursos = 0;

    public Docente(Integer edad){
        super.edad();
    }

    @Override 
    public Integer inteligencia(){
        return super.inteligencia() + (2 * cantCursos)
    }

    @Override 
    public Integer esDestacado(){
        return cantCursos > 3;
    }

    @Override
    public void ofrecerTributo(Planeta planeta){
        planeta.construirMuseo();
    }
}