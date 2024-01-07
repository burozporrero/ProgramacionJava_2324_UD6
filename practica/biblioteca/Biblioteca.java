package practica.biblioteca;

import java.util.ArrayList;

/**
 * Clase para representar el sistema de gestión de la biblioteca
 * @author Kevin A. y Tavi C.
 */
public class Biblioteca {
    private final ArrayList<Libro> libros;
    private final ArrayList<Usuario> usuarios;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void agregarLibro(int id, String titulo, String autor) {
        libros.add(new Libro(id, titulo, autor));
    }

    public void agregarUsuario(int id, String nombre) {
        usuarios.add(new Usuario(id, nombre));
    }

    /**
     * @param codigoLibro No hace falta comprobar si son nulos, ya que los valores primitivos no pueden ser nulos
     * @param idUsuario   No hace falta comprobar si son nulos, ya que los valores primitivos no pueden ser nulos
     */
    public void prestarLibro(int codigoLibro, int idUsuario) {

        Libro libro = null;

        for (Libro libroEncontrado : libros) {
            if (libroEncontrado.getId() == codigoLibro) {
                libro = libroEncontrado;
            }
        }

        if (libro == null || libro.estaPrestado()) {
            System.out.println("El libro no está disponible para préstamo.");
            return;
        }

        for (Usuario usuario : usuarios) {
            if (usuario.getId() == idUsuario) {
                libro.prestar(usuario);
                System.out.println("Se ha prestado el libro " + libro.getTitulo() + " al usuario " + usuario.getNombre());
            }
        }
    }

    public void devolverLibro(int codigoLibro) {
        Libro libro = null;

        for (Libro libroEncontrado : libros) {
            if (libroEncontrado.getId() == codigoLibro) {
                libro = libroEncontrado;
            }
        }

        if (libro != null && libro.estaPrestado()) {
            Usuario usuario = libro.devolver();
            System.out.println("El libro: " + libro.getTitulo() + " ha sido devuelto" + (usuario != null ? " por el" +
                    " usuario " + usuario.getNombre() : "."));
        } else {
            System.out.println("No se puede devolver el libro porque no está prestado.");
        }
    }
}
