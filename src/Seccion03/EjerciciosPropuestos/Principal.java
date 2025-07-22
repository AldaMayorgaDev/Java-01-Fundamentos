package Seccion03.EjerciciosPropuestos;

public class Principal {
    public static void main(String[] args) {

        Laptop lap = new Laptop("apple", "macbook air", 12, 15);
        ComputadoraEscritorio macMini = new ComputadoraEscritorio("Apple", "Mac Mini", 8, 30);

        lap.encender();
        lap.encenderTrackpad();
        lap.mostrarInfo();
        boolean enStock = lap.enStock();
        System.out.println("lap enStock = " + enStock);

        macMini.encender();
        macMini.mostrarInfo();
        macMini.encenderVentiladorInterno();
    }
}
