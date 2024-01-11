package teoria.jerarquia.ejemplo_empresa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class GestionEmpresa {
    public static void main(String[] args){

        Desarrollador p = new Desarrollador();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse("15/08/1993", fmt);


        p.setNombre("Demetrio Edelvives");
        p.setFechaNacimiento(fechaNacimiento);
        p.setFechaInicio(LocalDate.now());
        p.setSalario(20_000);
        p.setLenguajesProgramacion(new String[] { "Java", "Python", "Kotlin" });

        System.out.println(p.getNombre());
        System.out.println(p.getSalario());
        System.out.println(Arrays.toString(p.getLenguajesProgramacion()));
    }
}
