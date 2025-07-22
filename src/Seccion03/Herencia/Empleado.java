package Seccion03.Herencia;

public class Empleado extends Persona{
    float sueldo;

    public Empleado(String nombre, String fechaDeNacimiento, float sueldo) {
        super(nombre, fechaDeNacimiento);
        this.sueldo= sueldo;
    }

    void trabajar(){
        System.out.println("Soy " +nombre + " y trabajo");
    }

    void cobrar(){
        System.out.println("Soy " +nombre + " y estoy cobrando " +sueldo);
    }
}
