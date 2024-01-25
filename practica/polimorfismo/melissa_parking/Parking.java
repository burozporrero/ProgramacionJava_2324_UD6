package practica.polimorfismo.melissa_parking;

/**
 * @author Melissa G.
 */
public class Parking {
    //método estáticos
    // Ejemplo de métodos que no usan polimorfismo
    static public void aparcar(Coche coche){
        System.out.println("Aparco: " + coche.toString());
    }
    static public void aparcar(Bici bici){
        System.out.println("Aparco: " + bici.toString());
    }

    // Ejemplo de métodos con polimorfismo
    static public void aparcar(Vehiculo vehiculo){
        System.out.println("Vehiculo: " + vehiculo.toString());
    }
    static public Vehiculo retirar(){
        return new Vehiculo();
    }
}
