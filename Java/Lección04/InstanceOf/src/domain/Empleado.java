
package domain;


public class Empleado {
    protected String nombre;
    protected Double sueldo;
    
    public Empleado(String nombre, Double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;        
    }
    
    // Método para la sobreescritura
    public String ObtenerDetalles(){
        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
    
