package practica.biblioteca;

/**
 * @author Kevin A. y Tavi C.
 */
public class GestionBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(1, "El señor de los anillos", "J.R.R. Tolkien");
        biblioteca.agregarLibro(2, "Cien años de soledad", "Gabriel García Márquez");

        // Agregar usuarios
        biblioteca.agregarUsuario(101, "Juan");
        biblioteca.agregarUsuario(102, "María");

        // Realizar préstamos y devoluciones
        biblioteca.prestarLibro(1, 101); // Juan toma "El señor de los anillos"
        biblioteca.prestarLibro(1, 102); // Intento fallido: "El señor de los anillos" ya está prestado
        biblioteca.devolverLibro(1);    // Juan devuelve "El señor de los anillos"
        biblioteca.devolverLibro(1);    // Juan devuelve "El señor de los anillos"
        biblioteca.prestarLibro(2, 102); // María toma "Cien años de soledad"

    }
}
