package practica.polimorfismo.angel_parking.GestionParking;

/**
 * @author Ángel M.
 */
public class Moto extends VehiculoMotor {
    protected int numeroRuedas;

    public Moto(String marca, String modelo, String propietario, String tipoMotor, int numeroRuedas) {
        super(marca, modelo, propietario, tipoMotor);
        this.numeroRuedas = numeroRuedas;
    }

    @Override
    protected String mostrarDatos() {

        return "Tipo: Moto" + "\nMarca: " + marca + "\nModelo: " + modelo + "\nTipo de motor: " + tipoMotor + "\nNº de Ruedas: " + numeroRuedas;
    }

}
