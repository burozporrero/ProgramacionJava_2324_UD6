package teoria.demo_vehiculo;

/**
 * Libre configuración por los alumnos
 * por ejemplo:
 *  - extends Vehiculo
 *  - implements ABS y Radio
 *  - Pero no implements GPS --> para eso crear otro que sea VehiculoMotorGps
 */
public class VehiculoMotor implements IVehiculoMotor {

    @Override
    public void arrancar() {

    }

    @Override
    public void detener() {

    }

    @Override
    public float getMaxVel() {
        return 0;
    }
}
