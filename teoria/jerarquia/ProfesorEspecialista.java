package teoria.jerarquia;

public class ProfesorEspecialista extends Profesor {
    private String puestoAdicional;

    /**
     * Constructor con parámetro
     * @param puestoAdicional Puesto que ocupa en la empresa el profesor
     */
    public ProfesorEspecialista(String puestoAdicional) {
        this.puestoAdicional = puestoAdicional;
    }

    public String getPuestoAdicional() {
        return puestoAdicional;
    }

    public void setPuestoAdicional(String puestoAdicional) {
        this.puestoAdicional = puestoAdicional;
    }
}
