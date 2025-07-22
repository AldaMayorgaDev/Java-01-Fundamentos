package Seccion04.Modificadores.EjProtected.paquete2;

import Seccion04.Modificadores.EjProtected.paquete1.EjemploProtected;

public class PruebaEjemploProtected  extends EjemploProtected{

    void bar(){
        foo();
    }
    public static void main(String[] args) {
        PruebaEjemploProtected ejemplo = new PruebaEjemploProtected();
        ejemplo.foo();
        ejemplo.bar();
    }
}
