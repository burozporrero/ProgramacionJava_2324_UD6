package practica.polimorfismo.hugo_parking;

import java.util.Objects;

/**
 * @author Hugo A.
 */
public class VehiculoMotor extends Vehiculo {

    private String matricula;
    private int caballos;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), matricula, caballos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehiculoMotor that)) return false;
        if (!super.equals(o)) return false;
        return caballos == that.caballos && Objects.equals(matricula, that.matricula);
    }
}
