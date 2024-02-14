package practica.extiende_figura;

import java.util.Objects;

public class Circulo extends FiguraPlana {

    private static final String NOMBRE = "Círculo";
    private double radio;

    private Punto centro;

    public Circulo(double radio, Punto centro) {
        this(radio);
        this.centro = centro;
    }

    /**
     * Constructor que necesita el radio de círculo.
     *
     * @param radio En caso un valor inferior a 0 se insertará por defecto un 1.
     */
    public Circulo(double radio) {
        super(NOMBRE);
        this.radio = radio;
        if (radio <= 0) this.radio = 1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadio());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return Double.compare(getRadio(), circulo.getRadio()) == 0;
    }

    public double getRadio() {
        return radio;
    }    /**
     * Method implementation to calculate the area
     */
    @Override
    public double getArea() {
        return (Math.PI * this.radio * this.radio);
    }



    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    /**
     * Returns a representative string of the square.
     */
    @Override
    public String toString() {
        return "Círculo{" +
                "radio=" + radio +
                ", area=" + getArea() +
                '}';
    }


}
