package practica.herencia_empleado;

/**
 * Clase Técnico. Clase derivada de la clase Operario
 * @author Youssef E.
 */
public class Tecnico extends Operario {

    public Tecnico() {
    }

    public Tecnico(String nombre) {
        super(nombre);
        System.out.println("Constructor de Tecnico");                                                             
    }
   
    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }
}
