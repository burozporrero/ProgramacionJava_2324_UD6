package practica.extiende_figura;

public abstract class FiguraVolumen implements Figura{

    private String nombre;

    protected FiguraVolumen(String nombreFigura) {
        this.nombre = nombreFigura;
    }

    abstract public double getArea();

    // TODO - Fijar atención en que este método no puede ser static tal y como lo he declarado
    // y que llega un momento que al tenerlo que crear aqui y en FiguraPlana, quizá, en lugar de repetir código, es
    // mejor crear una interfaz Figura, por eso paso a comentarlo
    /*
    final public boolean mayorQue(FiguraAbstracta otra) {
        return this.area() > otra.area();
    }

     */

    /**
     * Calcula el volumen de la figura y lo retorna con una precisión de dos decimales como máximo
     * @return el volumen con dos decimales como máximo.
     */
    abstract public double getVolumen();

    public String toString() {
        return this.nombre + " con area " + this.getArea();
    }
}
