package practica.extiende_figura;

import java.util.Objects;

public class Cilindro extends FiguraVolumen {

    private static final String NOMBRE = "Cilindro";

    private Circulo base;
    private double altura;

    public Cilindro(double radio, double altura) {
        super(NOMBRE);
        this.base = new Circulo(radio);
        this.altura = altura;
        if (altura <= 0) this.altura = 1;
    }

    @Override
    public double getArea() {
        // Área del rectángulo = 2 × π × r × h
        // Área de las bases = 2 × π × r2
        // Área del cilindro = Área del rectángulo + Área de las bases
        return (base.getArea() * 2) + (2 * Math.PI * base.getRadio() * altura);
    }

    /**
     * @return La precisión máxima siempre será de dos decimales
     */
    @Override
    public double getVolumen() {
        Double result = Math.PI * (base.getRadio() * base.getRadio()) * altura;
        result = Math.round(result * 100d) / 100d;
        return result;
    }

    public double getRadio() {
        return base.getRadio();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBase(), getAltura());
    }

    public Circulo getBase() {
        return base;
    }

    public void setBase(Circulo base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
