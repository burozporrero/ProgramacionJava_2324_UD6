package practica.polimorfismo.hugo_parking;

import java.util.Objects;

/**
 * @author Hugo A.
 */
public class Camion extends VehiculoMotor {

    private boolean conCarga;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Camion camion)) return false;
        if (!super.equals(o)) return false;
        return isConCarga() == camion.isConCarga();
    }

    public boolean isConCarga() {
        return conCarga;
    }

    public void setConCarga(boolean conCarga) {
        this.conCarga = conCarga;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isConCarga());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Camion{");
        sb.append("conCarga=").append(conCarga);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
