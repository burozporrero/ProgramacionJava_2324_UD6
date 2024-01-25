package practica.polimorfismo.hugo_parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Hugo A.
 */
public class Parking {

    List<Plaza> plazas = new ArrayList<>();

    public void aparcar(Vehiculo vehiculo) {
        Plaza plaza = new Plaza();
        plaza.setVehiculo(vehiculo);
        plaza.setNumero(asignarPlaza());
        plazas.add(plaza);
    }

    // TODO método a mejorar: Evitar que asigne una plaza dos veces.
    private int asignarPlaza() {
        Random random = new Random();
        int plaza = random.nextInt(100);
        return plaza;
    }

    /**
     * @param vehiculo
     * @return true si el coche estaba en el parking, false, si no se ha encontrado
     */
    public boolean irse(Vehiculo vehiculo) {
        Boolean estabaAparcado = Boolean.FALSE;
        for (Plaza plaza : plazas) {
            if (plaza.getVehiculo().equals(vehiculo)) {
                estabaAparcado = Boolean.TRUE;
                plazas.remove(plaza);
            }
        }
        return estabaAparcado;
    }
}
