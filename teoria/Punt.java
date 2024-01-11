package teoria;

public class Punt { // és la classe pública, el nom de l’arxiu és “punt.java”

    private int x; //posició sobre l’eix horitzontal del punt
    private int y; //posició sobre l’eix vertical del punt
    private static int cantidadPuntos; // atributo estático


    public Punt(int x, int y) { // constructor per a la classe Punt, rep x i y, els valors per als camps
        this.x = x;
        this.y = y;
        cantidadPuntos++;
    }

    public Punt(Punt p) { // constructor per a la classe Punt, rep p de tipus Punt (la classe que estem definint)
        super();
        x = p.getX();
        y = p.getY();
        cantidadPuntos++;
    }

    public Punt(){

    }

    public int getX() { // retorna el valor del camp x
        return x;
    }

    public int getY() { // retorna el valor del camp y
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Punt getPunt() { // el tipus retornat pel mètode és un Punt
        return new Punt(x, y);
    }

    public static int getCantidadPuntos() {

        return cantidadPuntos;
    }

    /*
    Pensemos en que no tendría mucho sentido hacer un set de cantidadPuntos, ya que dejariamos abierta la posibilidad
     de que se modifique desde fuera y ya no sería real la contabilización objetos tipo Punt creados
     */
}
