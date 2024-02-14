package practica.extiende_figura;

public class Triangulo2 extends FiguraPlana {

    private static final String NOMBRE = "Triángulo";

    private double a;
    private double b;
    private double c;

    public Triangulo2(double a, double b, double c) {
        super("Triángulo");
        this.a = a;
        this.b = b;
        this.c = c;
        if (a <= 0) this.a = 1;
        if (b <= 0) this.b = 1;
        if (c <= 0) this.c = 1;
    }

    @Override
    public double getArea() {
        double semiperimetro = semiperimetro();
        return Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
    }

    private double semiperimetro() {
        return (a + b + c) / 2;
    }

    @Override
    public double perimetro() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangulo2{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
