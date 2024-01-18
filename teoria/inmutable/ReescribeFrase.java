package teoria.inmutable;

import java.util.Arrays;
import java.util.Random;

/**
 * Este ejercicio que salió en la UD4 tenía un método en el que se podía ver como funciona el modificador final,
 * aplicado sobre un objeto.
 * El array de símbolos y letras, aunque se declara como final, su contenido se puede modificar, ya que final afecta
 * a la instancia del objeto, no a su contenido.
 * Hemos modificado el ejercicio para eliminar la parte no necesaria y al final, intentar hacer una modificación de
 * la instancia y ver que ocurre.
 */
public class ReescribeFrase {
    public static void main(String[] args) {

        desordenarArray();
    }

    public static char[] desordenarArray() {

        Random random = new Random();

        final char[] ARRAY = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '-', '=', '{', '}', '[', ']',
                ';', ':', ',', '.', '<', '>', '/', '|', '?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', ' ', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '?'};

        final char[] ARRAY2 = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '-', '=', '{', '}', '[', ']',
                ';', ':', ',', '.', '<', '>', '/', '|', '?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', ' ', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '?'};

        System.out.println("ARRAY == ARRAY2: " + (ARRAY == ARRAY2));
        System.out.println("ARRAY equals ARRAY2: " + (ARRAY.equals(ARRAY2)));
        System.out.println("ARRAYS.equals(ARRAY, ARRAY2): " + (Arrays.equals(ARRAY,ARRAY2)));
        System.out.println("ARRAY[0] == ARRAY2[0]: " + (ARRAY[0] == ARRAY2[0]));

        for (int i = ARRAY.length - 1; i > 0; i--) {

            int index = random.nextInt(i + 1);

            // Intercambiar elementos para que el orden en el que se verán por pantalla, no sea siempre el mismo
            char temp = ARRAY[i];
            ARRAY[i] = ARRAY[index];
            ARRAY[index] = temp;
        }

        System.out.println("\nDespués de alterar las posiciones del array: ");
        System.out.println("ARRAY == ARRAY2: " + (ARRAY == ARRAY2));
        System.out.println("ARRAY equals ARRAY2: " + (ARRAY.equals(ARRAY2)));
        System.out.println("ARRAYS.equals(ARRAY, ARRAY2): " + (Arrays.equals(ARRAY,ARRAY2)));
        System.out.println("ARRAY[0] == ARRAY2[0]: " + (ARRAY[0] == ARRAY2[0]));

        // ARRAY = new char[3];

        return ARRAY;
    }
}
