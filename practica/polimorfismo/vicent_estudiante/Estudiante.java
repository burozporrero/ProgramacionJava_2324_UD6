package practica.polimorfismo.vicent_estudiante;

/**
 * @author Vicent P.
 */
public class Estudiante extends Persona{
    private String asignaturaFav;
    private boolean vestimenta;
    public Estudiante (String nombre, String edad, String aficion, String asignaturaFav, boolean vestimenta){
        super(nombre, edad, aficion);
        this.asignaturaFav = asignaturaFav;
        this.vestimenta = vestimenta;
    }
    public void setAsignaturaFav(String asignaturaFav) {
        this.asignaturaFav = asignaturaFav;
    }
    public void setVestimenta(boolean vestimenta) {
        this.vestimenta = vestimenta;
    }
    public void mostrarInformacion(){
        super.mostrarInformacion();
        if (this.vestimenta) {
            System.out.print(", su asignatura favorita es " + this.asignaturaFav + " y tiene codigo de vestimenta");
        } else {
            System.out.print(", su asignatura favorita es " + this.asignaturaFav + " y no tiene codigo de vestimenta");
        }
    }
}
