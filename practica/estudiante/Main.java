package practica.estudiante;

/**
 * @author Erika R.
 */
public class Main {

    public static void main(String[] args) {

        Estudiante e = new Estudiante("Amparo Navarro", 15);

        System.out.println(e.getNombre() + ", " + "edad: " + e.getEdad() + " años" + ", tiene " + e.getCreditos() + " creditos");
    }
}
