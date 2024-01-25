package practica.polimorfismo.vicent_estudiante;

/**
 * @author Vicent P.
 */
public class Persona {
    private String nombre;
    private String edad;
    private String aficion;

    public Persona(String nombre, String edad, String aficion) {
        this.nombre = nombre;
        this.edad = edad;
        this.aficion = aficion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public void setAficion(String aficion) {
        this.aficion = aficion;
    }
    public void mostrarInformacion(){
        System.out.print("La persona " + this.nombre + " tiene " + this.edad + " años y le gusta " + this.aficion);
    }
}
