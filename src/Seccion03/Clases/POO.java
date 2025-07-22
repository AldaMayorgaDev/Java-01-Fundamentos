package Seccion03.Clases;

public class POO {
    public static void main(String[] args) {

        //Creacion de instancias  / Creacion de objetos de la clase Persona
        Persona objeto1 = new Persona();
        Persona objeto2 = new Persona();
        Persona objeto3 =  new Persona("Tomas", 23, 'M');
        Persona objeto4 = new Persona();

        //ASignacion de valores
        objeto1.nombre= "Aldahir";
        objeto1.edad= 23;
        objeto1.genero='M';

        objeto2.nombre="Martha";
        objeto2.edad=23;
        objeto2.genero='F';

        objeto4.nombre="Karla";
        objeto4.edad=22;
        objeto4.genero='F';


        objeto1.imprimirInformacion();
        objeto2.imprimirInformacion();
        objeto3.imprimirInformacion();
        objeto4.imprimirInformacion();

        objeto1.jugarVideojuegos(objeto2);
    }
}

//Definición de la clase
class Persona{
    //Atributos
    String nombre;
    int edad;
    char genero;

    //Metodo constructor
    Persona(){
        System.out.println("Metodo contructor por defecto que da java");
    }

    Persona(String nom, int ed, char gen){
        this(); //Invocar contructor por defecto en otro constructor
        System.out.println("Metodo constructor perzonalizado");
        this.nombre = nom;
        this.edad= ed;
        this.genero= gen;
    }
    //Metodos o comportamientos
    void imprimirInformacion(){
        System.out.println("-------Persona---------");
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
        System.out.println("genero = " + genero);
        System.out.println("-----------------------");
    }

    void jugarVideojuegos(Persona persona){
        System.out.println(nombre + " está jugando con  " + persona.nombre);
    }
}

