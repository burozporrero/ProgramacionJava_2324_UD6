package practica.formas_geometricas;

/**
 * @author Dayanara M.
 */
public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(String tipo, double base, double altura) {
        super(tipo);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
