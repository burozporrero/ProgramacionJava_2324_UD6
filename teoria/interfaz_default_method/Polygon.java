package teoria.interfaz_default_method;

public interface Polygon {

    double getArea();

    // calculate the perimeter of a Polygon
    default double getPerimeter(int... sides) {
        int perimeter = 0;
        for (int side: sides) {
            perimeter += side;
        }

        return perimeter;
    }
}
