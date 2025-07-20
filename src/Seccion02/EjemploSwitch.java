package Seccion02;

public class EjemploSwitch {
    public static void main(String[] args) {
        int opcion = 4;

        switch (opcion){
            case 0:
                System.out.println("Es cero");
            break;
            case 1:
                System.out.println("Es uno");
                break;
            case 2:
                System.out.println("Es dos");
                break;
            case 3:
                System.out.println("Es tres");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Es Cuatro o 5 o seis");
                break;
            default:
                System.out.println("es otro numero");
                break;
        }
    }
}
