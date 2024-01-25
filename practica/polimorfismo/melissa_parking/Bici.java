package practica.polimorfismo.melissa_parking;


/**
 * @author Melissa G.
 */
public class Bici extends Vehiculo{
    private String codigoBicicleta;

    public Bici(String matricula, String marca, String codigoBicicleta) {
        super(matricula, marca);
        this.codigoBicicleta = codigoBicicleta;
    }
    //get y set

    public String getCodigoBicicleta() {
        return codigoBicicleta;
    }

    public void setCodigoBicicleta(String codigoBicicleta) {
        this.codigoBicicleta = codigoBicicleta;
    }
}
