
package Test;

import domain.*;

public class Testsobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 1000.0);
        imprimir(empleado1);
        //System.out.println("Empleado: " + empleado1.ObtenerDetalles());
        empleado1 = new Gerente("Carlos Calvo", 9.000000, "Ingeniería");
        imprimir(empleado1);
        //System.out.println("gerente1: "+ gerente1.ObtenerDetalles());
               
    }
    
    public static void imprimir(Empleado empleado){
        String detalles = empleado.ObtenerDetalles();
        System.out.println("detalles = " + detalles);
    }
}


