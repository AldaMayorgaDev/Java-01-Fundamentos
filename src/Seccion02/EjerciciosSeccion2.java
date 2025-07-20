package Seccion02;

public class EjerciciosSeccion2 {
    public static void main(String[] args) {
        //factorial

        int factorial=1;
        int numero = 3;

        for (int i=1; i<=numero; i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial  = " + factorial);
    }
}
