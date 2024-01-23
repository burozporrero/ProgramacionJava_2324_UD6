package teoria.interfaz_default_method;

public class Main {
    public static void main(String[] args) {

        Triangle t1 = new Triangle(2, 3, 4);
        double area = t1.getArea();
        double perimetro = t1.getPerimeter(2, 3, 4);
        System.out.println(t1.toString() + " tiene una area de " + area + " y un perímetro de " + perimetro);

        Rectangle r1 = new Rectangle();
        r1.setA(4);
        r1.setB(6);
        System.out.println(r1.toString() + " tiene una area de " + r1.getArea() + " y un perímetro de " + r1.getPerimeter());
    }
}
