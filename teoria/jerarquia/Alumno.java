package teoria.jerarquia;

import java.time.LocalDate;

/**
 * Se llama SUBCLASE
 */
public class Alumno extends Persona {

    private String nia;
    private LocalDate fechaNac;

    public Alumno(String nia) {
        this.nia = nia;
    }

    public String getNia() {
        return nia;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    @Override
    public boolean esCumpleanyos() {
        boolean esCumpleanyos = super.esCumpleanyos();
        if(esCumpleanyos) {
            // Activar tarjeta regalo
        }
        return esCumpleanyos;
    }
}
