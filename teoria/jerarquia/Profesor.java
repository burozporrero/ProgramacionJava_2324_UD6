package teoria.jerarquia;

/**
 * Se llama SUBCLASE de PERSONA, pero SUPERCLASE de ProfesorEspecialista
 */
public class Profesor extends Persona{
    private String especialidad;
    private String centro;

    /**
     * Constructor vacío que invoca a la superclase
     */
    public Profesor() {
        super();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    /**
     * Método que sirve para visualizar un ejemplo de metodo final en una superclase
     */
    public final void demoFinal(){
        System.out.println("Probando el modificador final sobre un método");
    }
}
