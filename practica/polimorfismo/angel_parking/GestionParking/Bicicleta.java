package practica.polimorfismo.angel_parking.GestionParking;

/**
 * @author Ángel M.
 */
public class Bicicleta extends VehiculoNoMotor {
    protected int numeroRuedas;

    public Bicicleta(String marca, String modelo, String propietario, int numeroRuedas) {
        super(marca, modelo, propietario);
        this.numeroRuedas = numeroRuedas;
    }

    @Override
    protected String mostrarDatos() {

        return "Tipo: Bicicleta" + "\nMarca: " + marca + "\nModelo: " + modelo + "\nNº de Ruedas: " + numeroRuedas;
    }
}
