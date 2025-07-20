package Seccion02;

public class EjemploFor {
    public static void main(String[] args) {
/*
        int tabla =2;
        for (int i=1; i <=10; i++ ){
            if (i%2 ==0){
                System.out.println("Es par");
                continue;
            }
            System.out.println(tabla+" x "+ i+ " = " + (tabla*i));
        }
*/
       int tabla;
       for (tabla=1; tabla<=10; tabla++){
           System.out.println("------Tabla del " + tabla + " " + "-------");
           for (int i=1; i <=10; i++){
               System.out.println(tabla+" x "+ i+ " = " + (tabla*i));
           }
       }
    }
}
