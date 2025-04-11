package ar.edu.obj2;

public class Pistolete implements Arma{
    private Integer largo;

    public Integer potencia(Soldado s){
    return s.getEdad()> 30 ? 3 * largo : 2 * largo;
    } 
    
    @Override
    public String marca(){
        throw new UndupportOperationException(message:"Unimplemented method 'marca'");
        }
}