package teoria.interfaz_default_method;

public class Figura {
    private final String nombre;

    public Figura(String nombreFigura) {
        this.nombre = nombreFigura;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
