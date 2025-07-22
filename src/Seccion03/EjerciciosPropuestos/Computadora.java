package Seccion03.EjerciciosPropuestos;

public class Computadora {
    String marca;
    String modelo;
    int memoriaRam;

    Computadora( String marca,String modelo, int memoriaRam){
        this.marca= marca;
        this.memoriaRam= memoriaRam;
        this.modelo= modelo;
    }


    void encender(){
        System.out.println("Soy "+marca+ " Estoy encenndiendo");
    }

    void mostrarInfo(){
        System.out.println("Soy una computadora "+marca  +" Modelo: "+ modelo +  " con memoria Ram: " +memoriaRam);
    }

    boolean enStock (){
        System.out.println(" en stock");
        return true;
    }
}
