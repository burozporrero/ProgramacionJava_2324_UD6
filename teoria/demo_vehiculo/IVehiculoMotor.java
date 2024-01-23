package teoria.demo_vehiculo;

public interface IVehiculoMotor{

    void arrancar();

    void detener();

    static void claxon() {
        System.out.println("Sonando claxon");
    }

    float getMaxVel();

    public static boolean esMasRapido(IVehiculoMotor vehiculoMotor, IVehiculoMotor vehiculoMotor2) {
        if (vehiculoMotor.getMaxVel() > vehiculoMotor2.getMaxVel()) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

}
