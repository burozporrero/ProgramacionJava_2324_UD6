package practica.formas_geometricas;

/**
 * @author Dayanara M.
 */
public class Circulo extends FormaGeometrica {
    private double radio;

    public Circulo(String tipo, double radio) {
        super(tipo);
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
