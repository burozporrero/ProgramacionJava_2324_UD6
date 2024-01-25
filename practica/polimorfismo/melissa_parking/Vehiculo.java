package practica.polimorfismo.melissa_parking;

/**
 * @author Melissa G.
 */
public class Vehiculo {
    private String matricula;
    private String marca;

    //contructor vacio
    public Vehiculo() {
        super();
    }
    public Vehiculo(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
