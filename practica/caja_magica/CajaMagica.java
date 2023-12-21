package practica.caja_magica;

/**
 * @author Diego F.
 */
public class CajaMagica {
    
    private Objeto objeto;

    public void abrirCaja() {
        if (this.objeto == null) {
            System.out.println("La caja está vacía.\n");
        } else {
            System.out.println("La caja contiene: ");
            System.out.print(objeto.getNombre() + "\n");
        }
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public void vaciarCaja(){
        this.objeto = null;
    }

    public boolean estaVacia(){
        return this.objeto == null;
    }
}
