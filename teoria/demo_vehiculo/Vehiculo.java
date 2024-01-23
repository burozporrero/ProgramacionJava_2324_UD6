package teoria.demo_vehiculo;

/**
 * Superclase que engloba todos los vehículos que tienen ruedas.
 */
public class Vehiculo {
    protected int nRuedas;
    protected int nAsientos;

    public Vehiculo(int nRuedas, int nAsientos) {
        this.nRuedas = nRuedas;
        this.nAsientos = nAsientos;
    }
}
