package Seccion04.Modificadores.EjDefault.paquete2;

import Seccion04.Modificadores.EjDefault.paquete1.EjemploDefault;

public class PruebaEjemploDefaultDiferentePaquete {

        public static void main(String[] args) {
            EjemploDefault ejemploDefault = new EjemploDefault();
            //ejemploDefault.foo(); //no funciona por que Default solo es accesible en el mismo paquete
        }

}
