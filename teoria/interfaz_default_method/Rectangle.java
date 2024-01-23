package teoria.interfaz_default_method;

import java.util.Objects;

public class Rectangle extends Figura implements Polygon{

    private static final String NAME = "Rectangle";
    private int a, b;

    public Rectangle() {
        super(NAME);
    }

    public Rectangle(int a, int b) {
        super(NAME);
        this.a = a;
        this.b = b;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getA() == rectangle.getA() && getB() == rectangle.getB();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB());
    }

    @Override
    public String toString() {
        return super.getNombre() + "{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public double getArea() {
        return b * a;
    }

    @Override
    public double getPerimeter(int... sides) {
        return (2 * a) + (2 * b);
    }
}
