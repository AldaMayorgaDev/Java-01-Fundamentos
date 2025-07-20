package Seccion02;

public class EjemploIf {
    public static void main(String[] args) {
        int edad =18;

        if (edad >= 18){
            System.out.println("Puede ingresar");
        }else if(edad == 17){
            System.out.println("Pude entrar pero en compañia de un adulto");
        }else{
            System.out.println("Solo se permiten mayores de edad");
        }
    }
}
