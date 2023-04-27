package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    static{//bloque de inicializacion estatico
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
        //idPersona =10; No es un atributo estatico por eso tenemos un error
    }
    
    {//Bloque de inicializacion No estatico(Contexto dinamico)
        System.out.println("Ejecucion del bloque NO estatico");
        this.idPersona = Persona.contadorPersona++; //Incrementamos el atributo
    }
    
    
    //Los bloques de inicializacion se ejecutan antes del constructor
    
    
    //Constructor 
    public Persona(){
        System.out.println("Ejecucion del constructor");
        
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
