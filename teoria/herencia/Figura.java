package teoria.herencia;

public class Figura {
    private final String nombre;

    public Figura(String nombreFigura) {
        this.nombre = nombreFigura;
    }

    final public String toString() {
        return this.nombre;
    }
}
