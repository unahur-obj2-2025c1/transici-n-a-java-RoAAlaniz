package ar.edu.obj2;

public class Espadon implements Arma{
    private Integer peso;

    public Integer potencia(Soldado s){
        return s.getEdad() < 40 ? peso / 2 : 6;
    }  

    @Override
    public String marca(){
        throw new UndupportOperationException(message:"Unimplemented method 'marca'");
    }
}