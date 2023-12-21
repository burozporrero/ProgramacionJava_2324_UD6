package practica.caja_magica;

import java.util.Scanner;

/**
 * @author Diego F.
 */
public class Principal {

    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        CajaMagica caja = new CajaMagica();
        Aventurero aventurero;
        String nombreAventurero;

        sc.useDelimiter("\n");

        do {
            // TODO Lo de dejar el nombre en blanco con scanner no es tarea sencilla, en el primer caso hay que
            //  introducir dos intros para que funcione
            System.out.println("Dime el nombre de tu personaje o deja el nombre en blanco para que huya: ");
            nombreAventurero = sc.next();

            if (!nombreAventurero.isEmpty()) {

                aventurero = new Aventurero(nombreAventurero);
                gestionCajaMagica(caja, aventurero);

            }

        } while (!nombreAventurero.isEmpty());

        sc.close();
    }

    public static void gestionCajaMagica(CajaMagica caja, Aventurero aventurero){

        String opcion;

        do {
            System.out.println("Tu personaje encuentra una misteriosa caja. ¿Deseas interactuar con la caja?");
            System.out.println("1. Ver contenidos de la caja.\n2. Sacar/Meter objetos en la caja.\n3. No hacer nada.");

            opcion = sc.next();

            switch (opcion.toLowerCase()) {
                case "1": caja.abrirCaja(); break;
                case "2":
                    aventurero.setObjetoMano(sc);
                    usarCaja(aventurero, caja);
                    break;
            }
        } while (!opcion.equalsIgnoreCase("3"));
    }

    public static void usarCaja(Aventurero aventurero, CajaMagica caja) {

        if (caja.estaVacia() && !aventurero.tieneObjeto()) {
            System.out.println("La caja está vacía, pero " + aventurero.getNombre() + " no tiene nada en la mano.");
        } else if (caja.estaVacia() && aventurero.tieneObjeto()) {
            System.out.println("La caja está vacía. " + aventurero.getNombre() + " pone " + aventurero.getObjeto().getNombre() + " en la " +
                    "caja.");
            caja.setObjeto(aventurero.getObjeto());
        } else if (!caja.estaVacia() && !aventurero.tieneObjeto()) {
            System.out.println("Hay un/una " + caja.getObjeto().getNombre() + " en la caja. Cuando " + aventurero.getNombre() +
                    " retira el objeto de la caja, éste se pierde para siempre.");
            caja.vaciarCaja();
        } else {
            System.out.println("Hay un/una " + caja.getObjeto().getNombre() + " en la caja. " + aventurero.getNombre() + " pone" +
                    " " + aventurero.getObjeto().getNombre() + " en la caja. El objeto " + caja.getObjeto().getNombre() +
                    " desaparece.");
            caja.setObjeto(aventurero.getObjeto());
        }
        System.out.println();
    }
}
