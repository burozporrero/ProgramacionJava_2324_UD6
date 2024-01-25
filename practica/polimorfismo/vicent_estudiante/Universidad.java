package practica.polimorfismo.vicent_estudiante;

/**
 * @author Vicent P.
 */
public class Universidad extends Estudiante{
    private int creditos;
    public Universidad (String nombre, String edad, String aficion, String asignaturaFav, boolean vestimenta, int creditos) {
        super(nombre, edad, aficion, asignaturaFav, vestimenta);
        this.creditos = creditos;
    }
    public int getCreditos() {
        return creditos;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.print(". Por ultimo, tiene " + this.creditos + " creditos.");
    }
}
