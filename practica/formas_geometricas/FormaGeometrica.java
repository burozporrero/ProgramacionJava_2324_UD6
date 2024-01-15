package practica.formas_geometricas;

/**
 * @author Dayanara M.
 */
public abstract class FormaGeometrica {
    protected String tipo;
    public FormaGeometrica(String tipo) {
        this.tipo = tipo;
    }

    public abstract double calcularArea();

    public String mostrarDatos() {
        return "Forma geometrica: " + tipo + "\nArea: " + calcularArea();
    }
}
