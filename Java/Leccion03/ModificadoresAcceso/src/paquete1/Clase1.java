
package paquete1;

public class Clase1 {
   public String atributoPublic = "valor atributo publico";
   protected String atributoProtected = "Ariel";
   
   
   
   //constructot
   public Clase1(){
       System.out.println("Constructor public");
   }
   
   protected Clase1(String atributoPublic){
       System.out.println("Constructor protected");
   }
   
   
   
   //metodo public
   public void metodoPublico(){
       System.out.println("Metodo public");
   }
   
   protected void metodoProtected(){
       System.out.println("Metodo protected ");
   }
   
}
