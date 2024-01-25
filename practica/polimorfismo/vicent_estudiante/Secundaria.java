package practica.polimorfismo.vicent_estudiante;

/**
 * @author Vicent P.
 */
public class Secundaria extends Estudiante {
    private String optativa;
    public Secundaria (String nombre, String edad, String aficion, String asignaturaFav, boolean vestimenta, String optativa){
        super(nombre, edad, aficion, asignaturaFav, vestimenta);
        this.optativa = optativa;
    }
    public String getOptativa() {
        return optativa;
    }
    public void setOptativa(String optativa) {
        this.optativa = optativa;
    }
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(". Por ultimo, su optativa es " + this.optativa);
    }
}
