package Seccion03.Herencia;

class Animal {
    //Attributes
    String nombre;
    //Methods
    public void respirar(){
        System.out.println("Animal Respirando...");
    }
}

class Perro extends Animal{

}

class  Gato extends Animal{
}


public class EjemploHerencia {
    public static void main(String[] args) {

        Gato obGatito = new Gato();
        obGatito.nombre="Atenea";
        obGatito.respirar();

        System.out.println("obGatito = " + obGatito.nombre);
    }
}