package practica.extiende_figura;

public class Rectangulo extends FiguraPlana {

    private static final String NOMBRE = "Rectángulo";
    private double base;
    private double altura;

    /**
     * @param largo En caso un valor inferior a 0 se insertará por defecto un 1.
     * @param ancho En caso un valor inferior a 0 se insertará por defecto un 1.
     */
    public Rectangulo(double largo, double ancho) {
        super(NOMBRE);
        this.base = largo;
        this.altura = ancho;
        if (base <= 0) this.base = 1;
        if (altura <= 0) this.altura = 1;
    }

    public double getBase() {
        return base;
    }    /**
     * Method implementation to calculate the area
     */
    @Override
    public double getArea() {
        return this.base * this.altura;
    }

    public void setBase(double base) {
        this.base = base;
    }    @Override
    public double perimetro() {
        return (2 * base) + (2 * altura);
    }

    public double getAltura() {
        return altura;
    }    /**
     * Returns a representative string of the square.
     */
    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + getArea() +
                '}';
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }






}
