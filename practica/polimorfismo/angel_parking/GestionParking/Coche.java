package practica.polimorfismo.angel_parking.GestionParking;

/**
 * @author Ángel M.
 */
public class Coche extends VehiculoMotor {
    protected int numeroPuertas;

    public Coche(String marca, String modelo, String propietario, String tipoMotor, int numeroPuertas) {
        super(marca, modelo, propietario, tipoMotor);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    protected String mostrarDatos() {
        return "Tipo: Coche" + "\nMarca: " + marca + "\nModelo: " + modelo + "\nTipo de motor: " + tipoMotor + "\nNº de Puertas: " + numeroPuertas + "\nNº de Plaza: " + numeroPlaza;
    }

}
