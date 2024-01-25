package practica.polimorfismo.hugo_parking;

import java.util.Objects;

/**
 * @author Hugo A.
 */
public class Vehiculo {

    private double longitud;
    private int capacidad;
    private int numPuertas;
    private int numRuedas;

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String tipoClase() {
        return this.getClass().getSimpleName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLongitud(), capacidad, numPuertas, numRuedas);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Double.compare(getLongitud(), vehiculo.getLongitud()) == 0 && capacidad == vehiculo.capacidad && numPuertas == vehiculo.numPuertas && numRuedas == vehiculo.numRuedas;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
