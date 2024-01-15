package practica.herencia_empleado;

/**
 * Clase Operario. Clase derivada de la clase Empleado
 * @author Youssef E.
 */
public class Operario extends Empleado{

    //constructor con un parámetro
    public Operario(String nombre) {
        super(nombre);
        System.out.println("Constructor de Operario");
    }

    //constructor por defecto
    public Operario() {
    }

    //modificación del método toString() para mostrar el mensaje adecuado                                         
    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
   
}
