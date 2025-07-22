package Seccion03.Herencia;

public class EjemploPersonasHerencia {
    public static void main(String[] args) {
        Estudiente e = new Estudiente(20343021, "Alda", "25/09/1994");
        e.dormir();
        e.aprobar();
        e.reprobar();
        e.respirar();

        Empleado em = new Empleado("Francisco", "31-12-1994", 34000.43f);
        em.dormir();
        em.cobrar();
        em.trabajar();
        em.respirar();
    }
}
