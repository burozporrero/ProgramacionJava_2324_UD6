package teoria.herencia;

public class Triangulo extends FiguraAbstracta{

    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        super("Triángulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + area() +
                '}';
    }
}
