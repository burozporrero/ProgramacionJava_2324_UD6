package practica.abstraccion;

/**
 * @author Sergi E.
 */
public class Casa {
    // Atributos
    private int metrosCuadrados;
    private String color;
    private int anyoConstruccion;
    private int numeroHabitaciones;
    private String provincia;

    public Casa(int metrosCuadrados, String color, int anyoConstruccion, int numeroHabitaciones, String provincia) {
        this.metrosCuadrados = metrosCuadrados;
        this.color = color;
        this.anyoConstruccion = anyoConstruccion;
        this.numeroHabitaciones = numeroHabitaciones;
        this.provincia = provincia;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnyoConstruccion() {
        return anyoConstruccion;
    }

    public void setAnyoConstruccion(int anyoConstruccion) {
        this.anyoConstruccion = anyoConstruccion;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "metrosCuadrados=" + metrosCuadrados +
                ", color='" + color + '\'' +
                ", anyoConstruccion=" + anyoConstruccion +
                ", numeroHabitaciones=" + numeroHabitaciones +
                ", provincia='" + provincia + '\'' +
                '}';
    }
}
