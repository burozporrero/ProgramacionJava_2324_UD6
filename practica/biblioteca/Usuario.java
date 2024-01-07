package practica.biblioteca;

/**
 * Clase para representar un usuario de la biblioteca
 * @author Kevin A. y Tavi C.
 */
public class Usuario implements Cloneable {
    private final int id;
    private final String nombre;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
