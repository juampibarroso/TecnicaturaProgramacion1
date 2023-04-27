
package test;

import enumeraciones.Contiinentes;
import enumeraciones.Dias;


public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Dia 1: "+Dias.LUNES);
        //indicarDiaSemana(Dias.LUNES);//Las enumeraciones se tratan como cadenas
        //Ahora no se deben utilizar comillas, se accede a travez del operador de punto
        
        System.out.println("Continente No. 1: "+Contiinentes.AFRICA);
        System.out.println("No. de paises en el 4to. continente: "+Contiinentes.AFRICA.getPaises());
        System.out.println("No. de habitantes en el 4to continente: "+Contiinentes.AFRICA.getHabitantes());
        System.out.println("\n");
        System.out.println("Continente No. 2: "+Contiinentes.EUROPA);
        System.out.println("No. de paises en el 4to. continente: "+Contiinentes.EUROPA.getPaises());
        System.out.println("No. de habitantes en el 4to continente: "+Contiinentes.EUROPA.getHabitantes());
        System.out.println("\n");
        System.out.println("Continente No. 3: "+Contiinentes.ASIA);
        System.out.println("No. de paises en el 4to. continente: "+Contiinentes.ASIA.getPaises());
        System.out.println("No. de habitantes en el 4to continente: "+Contiinentes.ASIA.getHabitantes());
        System.out.println("\n");
        System.out.println("Continente No. 4: "+Contiinentes.AMERICA);
        System.out.println("No. de paises en el 4to. continente: "+Contiinentes.AMERICA.getPaises());
        System.out.println("No. de habitantes en el 4to continente: "+Contiinentes.AMERICA.getHabitantes());
        System.out.println("\n");
        System.out.println("Continente No. 5: "+Contiinentes.OSEANIA);
        System.out.println("No. de paises en el 4to. continente: "+Contiinentes.OSEANIA.getPaises());
        System.out.println("No. de habitantes en el 4to continente: "+Contiinentes.OSEANIA.getHabitantes());
        
        
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("Dia incorrecto");
                break; 
        }
    }

}