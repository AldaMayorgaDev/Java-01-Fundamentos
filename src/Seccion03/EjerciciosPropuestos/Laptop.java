package Seccion03.EjerciciosPropuestos;

public class Laptop extends Computadora{
    int display;

     Laptop(String marca, String modelo, int memoriaRam, int display){
         super(marca, modelo, memoriaRam);
         this.display = display;
     }

    void encenderTrackpad (){
        System.out.println("Trackpad encendido");
    }

    @Override
    void mostrarInfo(){
        System.out.println("Soy una Laptop "+marca  +" Modelo: "+ modelo +  " con memoria Ram: " +memoriaRam + " Display:" +display);
    }
}
