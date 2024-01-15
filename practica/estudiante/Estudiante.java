package practica.estudiante;

/**
 * @author Erika R.
 */
public class Estudiante extends Persona {

    private int creditos;

    public Estudiante(String nombre, int edad) {
        super(nombre,edad);
        this.creditos = 60;
    }

    public int getCreditos() {
        return this.creditos;
    }
}
