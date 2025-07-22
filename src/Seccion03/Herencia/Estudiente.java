package Seccion03.Herencia;

public class Estudiente extends Persona {
    int numeroDeCuenta;

    Estudiente(int numeroDeCuenta, String nombre, String FechaNaci){
        super(nombre, FechaNaci);
        this.numeroDeCuenta = numeroDeCuenta;
    }
    @Override //Anotacion que debe ir en los metodos sobreescritos
    void dormir(){
        super.dormir(); //mandando llamar al metodor dormir de la clase padre
        System.out.println("Soy " +nombre + " soy estudiante, yo no duermo");
    }
    void aprobar(){
        System.out.println("Soy "+nombre + " y aprobe mi examen");
    }

    void reprobar(){
        System.out.println("Soy "+nombre + " y reprobe mi examen");
    }



}
