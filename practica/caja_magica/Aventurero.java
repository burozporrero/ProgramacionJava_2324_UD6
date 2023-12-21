package practica.caja_magica;

import java.util.Scanner;

/**
 * @author Diego F.
 */
public class Aventurero {
    
    private final String nombre;
    private Objeto objeto;

    public Aventurero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    /**
     * Preguntamos al usuario de la app que objeto tiene el aventurero en la mano y se lo guardamos directamente al
     * aventurero
     * @param sc Lectura de teclado
     */
    public void setObjetoMano(Scanner sc){
        System.out.println("Especifica qué objeto tiene tu personaje en la mano, o deja en blanco si no tienes ninguno: ");
        String nombreObjeto = sc.next();

        if (nombreObjeto.isEmpty()) {
            this.setObjeto(null);
        } else {
            this.setObjeto(new Objeto(nombreObjeto));
        }
    }

    public boolean tieneObjeto(){
        return !(this.objeto == null);
    }
}
