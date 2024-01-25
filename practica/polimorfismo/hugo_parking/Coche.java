package practica.polimorfismo.hugo_parking;

/**
 * @author Hugo A.
 */
public class Coche extends VehiculoMotor {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coche{");
        sb.append("longitud=").append(getLongitud());
        sb.append(", tipoClase='").append(tipoClase()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
