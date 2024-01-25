package practica.polimorfismo.melissa_parking;

/**
 * @author Melissa G.
 */
public class Principal {
    public static void main(String[] args) {
        //probando objetos y polimofismo

        //clase padre Vehiculo
        Vehiculo vehiculo1 = new Vehiculo("Y2231DYS", "Ford");

        //ahora creando un objeto de clase hija coche
        Vehiculo coche = new Coche("T567YSF", "Audi", "diesel", "Rojo");
        Vehiculo bici = new Bici("No tiene", "Merida", "2531");
        coche = new Bici("No tiene", "Canyon", "2540");

        //Variable de tipo heredera e instancia de super clase no se pueden igualar y el error se produce en tiempo de
        // EJECUCIÓN, tampoco es posible hacerlo con casting
        Bici bici2 = (Bici) new Vehiculo("Y2231DYS", "Ford");
        // Sí es posible hacer casting si la instancia es de tipo "clase heredera = tipo variable"
        Bici bici3 = (Bici) bici; //DE ESTA MANERA ES CORRECTO EL CASTING


        Vehiculo v1 = Parking.retirar();
        // Esto fallará por la misma lógica que aplica en la línea 20.
        Coche c1 = (Coche)Parking.retirar();
    }
}
