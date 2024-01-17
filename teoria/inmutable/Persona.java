package teoria.inmutable;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Es una SUPERCLASE
 * Clase que define un objeto con nombre, apellidos y fecha de nacimiento
 */
public class Persona implements Cloneable{
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(getNombre(), persona.getNombre()) && Objects.equals(getApellido1(), persona.getApellido1()) && Objects.equals(getApellido2(), persona.getApellido2()) && Objects.equals(getFechaNacimiento(), persona.getFechaNacimiento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellido1(), getApellido2(), getFechaNacimiento());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        Persona clon = (Persona) super.clone();

        //Aunque fecha de nacicmiento es un objeto de tipo fecha, este tipo de objetos en Java son inmutables, por lo
        // que el clone anterior es suficiente para que funcione correctamente.
        // Es más, si intentamos acceder al .clone de estos objetos podremos ver que no existe.
        //clon.setFechaNacimiento(this.fechaNacimiento.clone());

        return clon;
    }
}
