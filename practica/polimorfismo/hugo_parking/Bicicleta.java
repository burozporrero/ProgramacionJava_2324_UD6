package practica.polimorfismo.hugo_parking;

import java.util.Objects;

/**
 * @author Hugo A.
 */
public class Bicicleta extends Vehiculo {

    private String tipo;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bicicleta bicicleta)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(tipo, bicicleta.tipo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bicicleta{");
        sb.append("tipo='").append(tipo).append('\'');
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
