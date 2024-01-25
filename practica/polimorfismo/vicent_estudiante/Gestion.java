package practica.polimorfismo.vicent_estudiante;

/**
 * @author Vicent P.
 */
public class Gestion {

    // TODO - aquí nos faltaría un ejemplo como el del Parking, para ver más claramente las ventajas del polimorfismo
    public static void main(String[] args) {
        Persona p1 = new Secundaria("Juan", "15", "jugar al futbol", "mates", false, "informatica");
        Persona p2 = new Persona("Carlos", "14", "ir a correr");
        Estudiante e1 = new Universidad("Alex", "veinticinco", "jugar al padel", "el patio", true, 60);
        Universidad u1 = new Universidad("Ricardo", "diecinueve", "jugar al ajedrez", "historia", false, 42);

        System.out.println("Persona 1: ");
        p1.mostrarInformacion();
        System.out.println("\nPersona 2: ");
        p2.mostrarInformacion();
        System.out.println("\nEstudiante: ");
        e1.mostrarInformacion();
        System.out.println("\nUniversitario: ");
        u1.mostrarInformacion();
    }
}
