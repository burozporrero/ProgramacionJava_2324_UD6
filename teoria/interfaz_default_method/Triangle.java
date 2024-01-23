package teoria.interfaz_default_method;

import java.util.Objects;

public class Triangle extends Figura implements Polygon {

    private static final String NAME = "Triangle";
    private int a, b, c;


    public Triangle() {
        super(NAME);
    }
    // initializing sides of a triangle
    Triangle(int a, int b, int c) {
        super(NAME);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return getA() == triangle.getA() && getB() == triangle.getB() && getC() == triangle.getC();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB(), getC());
    }

    @Override
    public String toString() {
        return super.getNombre() + "{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    /**
     * calculate the area of a triangle:
     * Semiperimetro (s) = perimetro / 2
     * Area = raiz_cuadrada (s*(s-a)*(s-b)*(s-c))
     */
    //
    public double getArea() {

        double s = (double) (a + b + c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
