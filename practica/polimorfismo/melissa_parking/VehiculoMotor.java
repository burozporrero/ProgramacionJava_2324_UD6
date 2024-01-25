package practica.polimorfismo.melissa_parking;

/**
 * @author Melissa G.
 */
public class VehiculoMotor extends Vehiculo {
    private String tipoMotor;

    public VehiculoMotor(String matricula, String marca, String tipoMotor) {
        super(matricula, marca);
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return super.toString()+ "VehiculoMotor{" +
                "tipoMotor='" + tipoMotor + '\'' +
                '}';
    }
}
