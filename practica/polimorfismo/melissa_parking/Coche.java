package practica.polimorfismo.melissa_parking;

/**
 * @author Melissa G.
 */
public class Coche extends VehiculoMotor{
    private String color;

    public Coche(String matricula, String marca, String tipoMotor, String color) {
        super(matricula, marca, tipoMotor);
        this.color = color;
    }
    //metodos get y set

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
