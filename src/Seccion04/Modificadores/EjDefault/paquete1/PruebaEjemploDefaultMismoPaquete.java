package Seccion04.Modificadores.EjDefault.paquete1;

public class PruebaEjemploDefaultMismoPaquete {
        public static void main(String[] args) {
            EjemploDefault ejemploDefault = new EjemploDefault();
            ejemploDefault.foo(); //nsi funciona porque está en el mismo paquete
        }
}
