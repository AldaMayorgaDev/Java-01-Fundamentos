package Seccion03.EjerciciosPropuestos;

public class ComputadoraEscritorio extends Computadora{
    int tamanioCPU;

    ComputadoraEscritorio(String marca, String modelo, int memoriaRam){
        super(marca, modelo, memoriaRam);
    }

    ComputadoraEscritorio(String marca, String modelo, int memoriaRam, int tamanioCPU){
        super(marca, modelo, memoriaRam);
        this.tamanioCPU = tamanioCPU;
    }

    void encenderVentiladorInterno (){
        System.out.println("Estoy encendiendo el Ventilador Interno");
    }
    @Override
    void encender(){
        super.encender();
        System.out.println("Comenzando encendido de " + marca + " "+modelo);
    }
}
