package practica.extiende_figura;

public interface Figura {

    public double getArea();
    static public boolean mayorQue(Figura una, Figura otra) {
        return una.getArea() > otra.getArea();
    }
}
