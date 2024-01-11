package teoria.herencia;

public abstract class FiguraAbstracta {
    private final String nombre;

    public FiguraAbstracta(String nombreFigura) {
        this.nombre = nombreFigura;
    }

    abstract public double area();

    final public boolean mayorQue(FiguraAbstracta otra) {
        return this.area() > otra.area();
    }

    public String toString() {
        return this.nombre + " con area " + this.area();
    }
}
