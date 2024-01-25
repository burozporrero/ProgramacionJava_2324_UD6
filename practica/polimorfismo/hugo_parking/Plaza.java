package practica.polimorfismo.hugo_parking;

import java.util.Objects;

/**
 * @author Bea U.
 */
public class Plaza {
    private int numero;
    private Vehiculo vehiculo;

    @Override
    public int hashCode() {
        return Objects.hash(getNumero(), getVehiculo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plaza plaza = (Plaza) o;
        return getNumero() == plaza.getNumero() && Objects.equals(getVehiculo(), plaza.getVehiculo());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plaza{");
        sb.append("numero=").append(numero);
        sb.append(", vehiculo=").append(vehiculo);
        sb.append('}');
        return sb.toString();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
