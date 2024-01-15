package practica.herencia_empleado;

/**
 * Clase Empleado. Clase Base de la jerarquía
 * @author Youssef E.
 */
public class Empleado {
    private String nombre;

    //constructor por defecto
    public Empleado() {
    }

    //constructor con un parámetro
    public Empleado(String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor de Empleado " + nombre);
    }
   
    //métodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //método toString()
    //devuelve un String formado por la palabra “Empleado” y el nombre de empleado                                
    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}
