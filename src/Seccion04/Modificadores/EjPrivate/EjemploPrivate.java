package Seccion04.Modificadores.EjPrivate;

/*
* private
*   Todo lo que sea private solo es accesible dentro de la misma clase.
*
* */
class Prueba {
    private String nombre;
    //Esto se utiliza cuando se quiere que no se puedan crear objetos de esta clase sin un control
    private Prueba(){
    }
    public  Prueba(String nombre){
        this.nombre = nombre;
    };

    private void foo(){}

/*
    public static void main(String[] args) {
        Prueba p = new Prueba();
        p.nombre = "Aldahir"; //Dentro de la misma clase si es posible acceder a algo private
    }
*/

}
public class EjemploPrivate {
    public static void main(String[] args) {
        // Prueba p = new Prueba();//Esto no es posible porque el constructor es privado y esta en otra clase
       // p.nombre = "Aldahir"; //Esto no es posible
            Prueba p = new Prueba("Marco");

    }
}
