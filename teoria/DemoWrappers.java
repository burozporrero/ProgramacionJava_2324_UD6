package teoria;

/**
 * @author Ejemplos extraidos en parte de https://profile.es/blog/clases-wrapper-envoltorio-en-java/
 */
public class DemoWrappers {
    public static void main(String[] args){

        // Creando un primitivo y un wrapper
        char ch = 'a';
        Character chWrapped = 'a'; //AUTOBOXING

        // Comparando ambos
        System.out.println("ch == chWrapped: " + (ch == chWrapped));
        System.out.println("ch == chWrapped: " + (chWrapped.equals(ch)));

        char ch2 = 'b';
        Character ch2Wrapped = Character.valueOf(ch2);

        // Comparando ambos
        System.out.println("ch2 == ch2Wrapped: " + (ch2 == ch2Wrapped));
        System.out.println("ch2 == ch2Wrapped: " + (ch2Wrapped.equals(ch2)));

        // BOXING: Pasando de tipo primitivo a wrapper
        int numPrimitive = 6;
        Integer numWrapper = Integer.valueOf(numPrimitive);
        Integer num2Wrapper = Integer.valueOf(6);
        // Deprecated...
        /*
        Integer deprecatedNumWrapper = new Integer(numPrimitive);
        Integer deprecatedNumWrapper = new Integer(6);
         */

        // Y volviendo a primitivo
        int numUnWrapped = numWrapper.intValue();
        System.out.println(numUnWrapped);

        System.out.println(chWrapped.getClass());
    }
}
