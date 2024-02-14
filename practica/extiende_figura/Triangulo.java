package practica.extiende_figura;

public class Triangulo extends FiguraPlana {

    private static final String NOMBRE = "Triángulo";

    // Un triangulo puede definirse por su base y su altura
    // O por sus tres lados
    private double base;
    private double altura;

    private double a;
    private double b;
    private double c;


    /**
     * @param base   En caso un valor inferior a 0 se insertará por defecto un 1.
     * @param altura En caso un valor inferior a 0 se insertará por defecto un 1.
     */
    public Triangulo(double base, double altura) {
        super(NOMBRE);
        this.base = base;
        this.altura = altura;
        if (base <= 0) this.base = 1;
        if (altura <= 0) this.altura = 1;
        this.calcularLados();
    }

    private void calcularLados() {
        // TODO calcular los lados del triangulo
        a = 0d;
        b = 0d;
        c = 0d;
    }

    public Triangulo(double a, double b, double c) {
        super("Triángulo");
        this.a = a;
        this.b = b;
        this.c = c;
        if (a <= 0) this.a = 1;
        if (b <= 0) this.b = 1;
        if (c <= 0) this.c = 1;
        this.calcularBaseAltura();
    }

    private void calcularBaseAltura() {
        //TODO calcular base y altura
        altura = 0d;
        base = 0d;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return (base * altura) / 2;
    }


    @Override
    public double perimetro() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + getArea() +
                '}';
    }


}
