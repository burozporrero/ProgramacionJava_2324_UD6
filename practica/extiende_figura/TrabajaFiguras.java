package practica.extiende_figura;

public class TrabajaFiguras {

    public static void main (String [] args ) {

        Rectangulo r1;
        r1 = new Rectangulo(12.5, 23.7);
        System.out.println("Area de r1 = " + r1.getArea());

        Rectangulo r2 = new Rectangulo(8.6, 33.1);
        System.out.println("Area de r2 = " + r2.toString());

        if (Figura.mayorQue(r1,r2))
            System.out.println("El rectángulo de mayor area es r1");
        else
            System.out.println("El rectángulo de mayor area es r2");

        Triangulo t1 = new Triangulo(20.1, 20.1);
        System.out.println(t1.toString());

        System.out.println("Es triangulo mayor que r1: " + Figura.mayorQue(r1, t1));

        Circulo circle = new Circulo(7.75);
        System.out.println("circulo.radio = " + circle.getRadio());
        System.out.println("circle.area= " + circle.getArea());
        Cilindro cylinder = new Cilindro(2.55, 2.25);
        System.out.println("cylinder.radius= " + cylinder.getRadio());
        System.out.println("cylinder.height= " + cylinder.getAltura());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volumen= " + cylinder.getVolumen());
        System.out.println("Es el cilindro mayor que el circulo: " + Figura.mayorQue(cylinder, circle));
        System.out.println(cylinder.toString());
    }
}
