package practica.biblioteca;

/**
 * Clase para representar un libro
 * @author Kevin A. y Tavi C.
 */
public class Libro {

    private final int id;
    private final String titulo;
    private final String autor;
    private boolean prestado;
    private Usuario usuarioPrestado;

    public Libro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean estaPrestado() {
        return prestado;
    }

    public void prestar(Usuario usuarioPrestado) {
        if (usuarioPrestado != null) {
            this.usuarioPrestado = usuarioPrestado;
            prestado = true;
        }
    }

    public Usuario devolver() {
        prestado = false;

        Usuario usuarioDevuelve = null;
        try {
            usuarioDevuelve = (Usuario) usuarioPrestado.clone();
        } catch (CloneNotSupportedException e) {
            // No relanzo la excepción, ya que no me importa si no se ha podido clonar, era por tener un poco más de
            // información.
            System.out.println("ERROR");
        }

        usuarioPrestado = null;
        return usuarioDevuelve;
    }
}
