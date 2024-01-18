package teoria.inmutable;

public class StringInmutable {

    public static void main (String[] args){

        // Asignaciones directas de Strings, trabajan con el String pool en el área PermGen del heap de Java.
        // Esto implica "Reutilización de memoria"
        // También que son inmutables.
        // Todos los tipos primitivos trabajan con el pool, por lo tanto, son inmutables
        // Los objetos son mutables.
        String persona1 = "Bea";
        String persona2 = "Bea";

        System.out.println("Trabajando con el pool:");
        System.out.println("persona1(Bea) == persona2(Bea) : " + (persona1 == persona2));
        System.out.println("persona1(Bea) equals persona2(Bea) : " + (persona1.equals(persona2)));

        // Cuando hacemos esto, en realidad sí que estamos cambiando el valor de la variable, 'persona2', con lo cual
        // podría parecer que está MUTANDO, pero... la instancia a la que estaba apuntando previamente, o sea,
        // "Bea", sigue en el pool sin haber cambiado.
        persona2 = "Elena";
        System.out.println("persona1(Bea) == persona2(Elena) : " + (persona1 == persona2));
        System.out.println("persona1(Bea) equals persona2(Elena) : " + (persona1.equals(persona2)));

        // Asignación a un espacio de memoria nuevo y reservado, fuera del pool
        String persona3 = new String("Bea");

        System.out.println("\nTrabajando fuera del pool:");
        System.out.println("persona1(Bea) == persona3(new Bea) : " + (persona1 == persona3));
        System.out.println("persona1(Bea) equals persona3(new Bea) : " + (persona1.equals(persona3)));

        // como podemos ver, la clase String también garantiza la inmutabilidad
        persona3.substring(2);
        persona3.concat(" Martinez");
        System.out.println("substring persona3(new Bea) : " + persona3);

        // La condicion de que una variable sea inmutable no altera el resultado
        final String persona4 = "Sofia";
        String persona5 = "Sofia";

        System.out.println("\nTrabajando con el pool y con final:");
        System.out.println("final persona4(Sofia) == persona5(Sofia) : " + (persona4 == persona5));
        System.out.println("final persona4(Sofia) equals persona5(Sofia) : " + (persona4.equals(persona5)));

        persona4.substring(2);
        System.out.println("substring persona4(pool) : " + persona4);

        // No puede apuntar a otra posición del pool
        //persona4 = "Lucia";

        persona5 = "Lucia";
        System.out.println("final persona4(Sofia) == persona5(Lucia) : " + (persona4 == persona5));
        System.out.println("final persona4(Sofia) equals persona5(Lucia) : " + (persona4.equals(persona5)));

        // ahora además persona6
        // no puede apuntar a otra posición de memoria.
        System.out.println("\nTrabajando fuera del pool y con final:");
        final String persona6 = new String("Ainara");
        System.out.println("persona6(new Ainara) : " + persona6);
        persona6.substring(2);
        persona6.concat(" Martinez");
        //persona6 = new String("prueba fallida");
        System.out.println("substring persona6(new Ainara) : " + persona6);
    }
}
