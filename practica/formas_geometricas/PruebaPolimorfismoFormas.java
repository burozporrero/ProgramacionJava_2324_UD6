package practica.formas_geometricas;

/**
 * @author Dayanara M.
 */
public class PruebaPolimorfismoFormas {
    public static void main(String[] args) {

        FormaGeometrica[] formaGeometricas = new FormaGeometrica[3];

        formaGeometricas[0] = new Circulo("Circulo", 5.0);
        formaGeometricas[1] = new Cuadrado("Cuadrado", 4.5);
        formaGeometricas[2] = new Triangulo("Triangulo", 9.5, 6.10);

        for(FormaGeometrica formas: formaGeometricas) {
            System.out.println(formas.mostrarDatos());
            System.out.println("-----------------------");
        }
    }
}
