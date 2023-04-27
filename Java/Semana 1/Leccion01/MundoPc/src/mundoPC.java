public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluethooth", "HP");
        Computadora computadoraHP = new Computadora ("Computadora HP", monitorHP ,tecladoHP, ratonHP)

        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluethooth", "Gamer");
        Computadora computadoraGamer = new Computadora ("Computadora Gamer", monitorGamer ,tecladoGamer, ratonGamer)

        Orden orden1 = new Orden();
        orden1.agregarComputadroa(computadoraGamer);
        orden1.agregarComputadroa(computadoraHP);
        orden1.mostrarOden();
        
    }
}
