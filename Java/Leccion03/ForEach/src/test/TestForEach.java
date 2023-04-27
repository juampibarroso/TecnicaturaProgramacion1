
package test;

import domain.Persona;


public class TestForEach {
    public static void main(String[] args) {
        int edades [] ={5,6,8,9};
        for (int edad: edades) { //sintaxis del ForEach
            System.out.println("edad = " + edad);
            
        }
        
        Persona personas[] = {new Persona("Juan"),new Persona("Angel"),new Persona("Hugo")};
        //ForEach
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
    
}
