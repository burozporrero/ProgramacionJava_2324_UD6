package teoria.inmutable;

public class DemoMutable {

    public static void main(String[] args) throws CloneNotSupportedException {

        Persona ana = new Persona();

        ana.setNombre("Ana");
        ana.setApellido1("Martínez");

        System.out.println("Imprimo Ana: " + ana.toString());

        Persona elena = ana;
        elena.setNombre("Elena");
        elena.setApellido1("Sanchez");

        System.out.println("Imprimo Ana: " + ana.toString());

        /** EJECUTAR Y LUEGO LEER ESTO
         * Como podemos ver hasta aquí, al copiar 'ana' en 'elena' y modificar datos sobre elena, en realidad se ha
         * modificado el objeto ana, ya que, en realidad, lo que se ha hecho es apuntar a la misma referencia de
         * memoria.
         */

        Persona maria = (Persona) ana.clone();
        maria.setNombre("María");
        maria.setApellido1("López");

        System.out.println("Imprimo Ana: " + ana.toString());
        System.out.println("Imprimo Maria: " + maria.toString());

    }
}
