package ar.edu.obj2;

import org.junit.jupiter.api.Test;

public class PersonaTest{
    private Persona julieta = new Persona(edad:42);

    @Test
    public void creacionPersonaGenerica(){
        assertEquals(expected:Persona.class, julieta.getClass());
    }

    @Test
    public void creacionPersonaGenericaDe42Años(){
        assertEquals(expected:42, julieta.getEdad());
    }

    @Test
    public void potenciaJulieta(){
        assertEquals(expected:20, julieta.potencia());
    }

}