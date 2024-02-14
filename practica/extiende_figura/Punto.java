package practica.extiende_figura;

public class Punto { // és la classe pública, el nom de l’arxiu és “punt.java”

    private int x; //posició sobre l’eix horitzontal del punt
    private int y; //posició sobre l’eix vertical del punt

    public Punto(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Punto(Punto p) {
        super();
        x = p.getX();
        y = p.getY();
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

}
