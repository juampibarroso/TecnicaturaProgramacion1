package mundopc;

import ar.com.system2023.mundo.pc.*;




public class mundoPc {
    public static void main(String[] args) {
        Monitor monitorHp = new Monitor("HP",13);//importar la clase
        Teclado tecladoHp = new Teclado("Bluetooth","HP");
        Raton ratonHp = new Raton("Bluetooth","Hp");
        Computadora computadoraHp = new Computadora("Computadora HP",monitorHp,tecladoHp,ratonHp);
        
        //Creamos objetos de diferentes marcas
        Monitor monitorGamer = new Monitor("Gamer",32);
        Teclado tecladoGamer = new Teclado("Bluetooth","Gamer");
        Raton ratonGamer = new Raton("Bluetooth","Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer",monitorGamer,tecladoGamer,ratonGamer);
        
        Monitor monitorSamsung = new Monitor("Samsung",38);
        Teclado tecladoSamsung = new Teclado("Bluetooth","Samsung");
        Raton ratonSamsung = new Raton("Bluetooth","Samsung");
        Computadora computadoraSamsung = new Computadora("Computadora Samsung",monitorSamsung,tecladoSamsung,ratonSamsung);
        
        Monitor monitorMsi = new Monitor("Msi",30);
        Teclado tecladoMsi = new Teclado("Bluetooth","Msi");
        Raton ratonMsi = new Raton("Bluetooth","Msi");
        Computadora computadoraMsi = new Computadora("Computadora Msi",monitorMsi,tecladoMsi,ratonMsi);
        
        Orden orden1 = new Orden();//Inicializamos el arreglo vacio
        Orden orden2 = new Orden(); //una nueva lista
        Orden orden3 = new Orden();
        
        Computadora computadorasVarias = new Computadora("Computadoras de diferentes marcas",monitorHp,tecladoMsi,ratonGamer);
        
        
        orden1.agregarComputadora(computadoraHp);
        orden1.agregarComputadora(computadoraGamer);
        orden1.agregarComputadora(computadoraMsi);
        orden1.agregarComputadora(computadoraMsi);
        orden1.agregarComputadora(computadoraSamsung);
        orden1.agregarComputadora(computadoraMsi);
        orden1.agregarComputadora(computadoraHp);
        orden1.agregarComputadora(computadoraSamsung);
        orden1.agregarComputadora(computadoraMsi);
        orden1.agregarComputadora(computadoraSamsung);
 
        
        orden2.agregarComputadora(computadoraMsi);
        
        orden3.agregarComputadora(computadorasVarias);
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();
        
        
    }
}
