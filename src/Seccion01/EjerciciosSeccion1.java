package Seccion01;

import java.util.Scanner;
public class EjerciciosSeccion1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese altura: ");
        double altura = teclado.nextDouble();
        System.out.println("Ingrese Base: ");
        double base = teclado.nextDouble();

        System.out.println("Ingrese radio: ");
        double radio = teclado.nextDouble();

        System.out.println("Ingrese lado: ");
        double lado = teclado.nextDouble();

        double areaCuadrado = lado*lado;
        double areaCirculo = Math.PI * radio;
        double areaRectangulo = base * altura;
        double areaTriangulo = (base * altura)/2;

        System.out.println("areaCuadrado = " + areaCuadrado);
        System.out.println("areaTriangulo = " + areaTriangulo);
        System.out.println("areaCirculo = " + areaCirculo);
        System.out.println("areaRectangulo = " + areaRectangulo);

        teclado.close();
    }
}
