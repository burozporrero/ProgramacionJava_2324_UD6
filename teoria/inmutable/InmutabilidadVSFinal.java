package teoria.inmutable;

import java.util.Date;

public class InmutabilidadVSFinal {
    public static void main(String[] args) {

        // Asignación inicial a una variable final
        final StringBuffer horaActual = new StringBuffer("La hora actual es: ");

        System.out.println(horaActual);

        // El final no afecta en que podamos modificar el contenido del objeto
        horaActual.append(new Date());
        System.out.println(horaActual);

        // Pero si afecta a la hora de crear una nueva asignación. La línea siguiente no puede ejecutarse:
        //horaActual = new StringBuffer("El estado del tiempo es: ");
    }
}
