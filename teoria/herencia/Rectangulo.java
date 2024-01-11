package teoria.herencia;

public class Rectangulo extends FiguraAbstracta {

    private final double base;
    private final double altura;

    public Rectangulo(double largo, double ancho) {
        super("Rectángulo");
        this.base = largo;
        this.altura = ancho;
    }

    /**
     * Method implementation to calculate the area
     */
    public double area() {
        return this.base * this.altura;
    }

    /**
     * Returns a representative string of the square.
     */
    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + area() +
                '}';
    }
}
