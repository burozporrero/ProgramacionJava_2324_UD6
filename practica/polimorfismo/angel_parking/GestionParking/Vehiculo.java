package practica.polimorfismo.angel_parking.GestionParking;

/**
 * @author Ángel M.
 */
public abstract class Vehiculo {
    private static int contador = 1;
    protected String marca;
    protected String modelo;
    protected String propietario;
    protected int numeroPlaza = 0;

    public Vehiculo(String marca, String modelo, String propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
        this.numeroPlaza = contador++;
    }

    protected abstract String mostrarDatos();
}
