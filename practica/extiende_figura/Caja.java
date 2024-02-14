package practica.extiende_figura;

public class Caja extends FiguraVolumen{

    private static final String NOMBRE = "Caja";
    private Rectangulo base;
    private double profundidad;

    public Caja(double base, double altura, double profundidad) {
        super(NOMBRE);
        this.base = new Rectangulo(base, altura);
        this.profundidad = profundidad;
        if (profundidad < 0) this.profundidad = 1;
    }

    public Rectangulo getBase() {
        return base;
    }

    public void setBase(Rectangulo base) {
        this.base = base;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public double getArea() {
        // siendo longitud (l), ancho (w), y altura (h) la fórmula del área de superficie = 2lw+2lh+2hw
        return (2 * base.getArea()) + (2 * base.getBase() * profundidad) + (2 * base.getAltura() * profundidad);
    }

    @Override
    public double getVolumen() {
        double result = base.getArea() * profundidad;
        result = Math.round(result * 100d) / 100d;
        return result;
    }
}
