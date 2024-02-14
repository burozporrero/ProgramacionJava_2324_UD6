package practica.extiende_figura;

public abstract class FiguraPlana implements Figura{
    private String nombre;

    public FiguraPlana(String nombreFigura) {
        this.nombre = nombreFigura;
    }

    abstract public double getArea();

    abstract public double perimetro();

    // TODO - Fijar atención en que este método no puede ser static tal y como lo he declarado
    // y que llega un momento que al tenerlo que crear aqui y en FiguraVolumen, quizá, en lugar de repetir código, es
    // mejor crear una interfaz Figura, por eso paso a comentarlo
    /*
    final public boolean mayorQue(FiguraAbstracta otra) {
        return this.area() > otra.area();
    }

     */

    public String toString() {
        return this.nombre + " con area " + this.getArea();
    }
}
