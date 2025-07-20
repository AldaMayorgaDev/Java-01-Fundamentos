package Seccion02;

public class EjemploSwitchStrings {
    public static void main(String[] args) {
        String opcion = "seis";

        switch (opcion){
            case "uno":
                System.out.println("es 1");
                break;
            case "dos":
                System.out.println("es 2");
                break;
            case "tres":
            case "cuatro":
                System.out.println("es 3 o 4");
                break;
            default:
                System.out.println("es otra cosa");
                break;
        }

    }
}
