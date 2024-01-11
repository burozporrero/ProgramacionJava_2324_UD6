package teoria.jerarquia;

import java.time.LocalDate;

/**
 * Es una SUPERCLASE
 * Clase que define un objeto con nombre, apellidos y fecha de nacimiento
 */
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;

    /**
     * Constructor vacío que invoca a la superclase
     */
    public Persona(){
        super();
    }

    /**
     * Constructor que crea una persona directamente con su nombre
     * @param nombre Nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean esCumpleanyos(){
        // ver si es cumpleaños
        return Boolean.TRUE;
    }
}
