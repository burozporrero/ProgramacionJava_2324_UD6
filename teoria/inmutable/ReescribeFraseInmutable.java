package teoria.inmutable;

import java.util.*;

public class ReescribeFraseInmutable {
    public static void main(String[] args) {

        desordenarArray();
    }

    public static Character[] desordenarArray() {

        Random random = new Random();

        Character[] ARRAY = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '-', '=', '{', '}', '[', ']',
                ';', ':', ',', '.', '<', '>', '/', '|', '?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', ' ', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '?'};

        // Creamos uno INMUTABLE
        List<Character> listChars = Collections.unmodifiableList(Arrays.asList(ARRAY));
        // Y otro normal o MUTABLE
        List<Character> listChars4 = Arrays.asList(ARRAY);

        List<Character> listChars2 = listChars4;
        List<Character> listChars3 = List.copyOf(listChars4);

        System.out.println("listChars4 == listChars2: " + (listChars4 == listChars2));
        System.out.println("listChars4 equals listChars2: " + (listChars4.equals(listChars2)));

        System.out.println("listChars4 == listChars3: " + (listChars4 == listChars3));
        System.out.println("listChars4 equals listChars3: " + (listChars4.equals(listChars3)));


        for (int i = listChars.size() - 1; i > 0; i--) {

            int index = random.nextInt(i + 1);
            // Intercambiar elementos para que el orden en el que se verán por pantalla, no sea siempre el mismo

            char temp = listChars.get(i);
            /* DESCOMENTAR PARA PROBAR
            listChars.set(i, listChars.get(index));
            listChars.set(index, temp);
            */

            listChars4.set(i, listChars4.get(index));
            listChars4.set(index, temp);
        }

        System.out.println("\nDespués de alterar las posiciones del array: ");
        System.out.println("listChars4 == listChars2: " + (listChars4 == listChars2));
        System.out.println("listChars4 equals listChars2: " + (listChars4.equals(listChars2)));
        System.out.println("listChars4 == listChars3: " + (listChars4 == listChars3));
        System.out.println("listChars4 equals listChars3: " + (listChars4.equals(listChars3)));

        // ARRAY = new char[3];

        return ARRAY;
    }
}
