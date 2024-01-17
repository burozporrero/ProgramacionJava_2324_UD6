    NOTA: Material extraido íntegramente de los apuntes de Programación de 1 de DAM/DAW de Eduard . 

# CLONE

El mètode clone permet crear i retornar una còpia de l'objecte, es copien els seus camps i els seus mètodes.

L'objecte retornat és diferent de l'objecte que executa el clone, tenen un hashcode diferent. 

    x.clone( ) != x // són objectes diferents 
    x.clone( ).getClass( ) == x.getClass( ) // són de la mateixa classe (no és un requeriment)
    x.clone( ).equals(x) // són semànticament iguals (no és un requeriment)

La classe ha d'implementar la interfície Cloneable. 

    public class Punt implements Cloneable { // implementa la interfície Cloneable 
        private int x; // primitiva 
        private Integer y; // classe immutable 
    
        @Override 
        protected Object clone( ) throws CloneNotSupportedException { 
            return super.clone( ); // fa referència a la classe pare, en aquest cas a Object 
        } 
    }

El mètode és protegit (protected), l’hem de passar a públic per a poder cridar-lo. 

    public Object clone( ) throws CloneNotSupportedException {
    
__Si una classe, sols, conté primitives o classes immutables__, llavors, el super.clone (clone de Object) __és 
suficient__, ja que copiar objectes immutables crea objectes nous. 

    public static void main(String[] args) throws CloneNotSupportedException { 
        Punt x = new Punt(); 
        System.out.println(x); 
        Punt y = (Punt) x.clone(); // clone torna un Object, per tant, s’ha de castear 
        System.out.println(y); 
    }

Si uses el mètode clone has de controlar l’excepció CloneNotSupportedException. 

La visualització de x i y dona codis hash diferents, és a dir, són objectes diferents.

El super.clone només copia la referència a un objecte mutable, per tant, les dues referències apunten al mateix objecte, llavors, cal clonar cadascun dels objectes que formen l’objecte original i assignar-lo a la referència copiada. 

    public class Cercle implements Cloneable { 
        private Punt centre; // referència a un objecte Punt 
        private int radi; // primitiva 

        public void setCentre(Punt centre) { 
            this.centre = centre; 
        } 

        @Override 
        public Object clone( ) throws CloneNotSupportedException { 
            Cercle copia = (Cercle) super.clone( ); // clona Cercle, còpia del radi i còpia de la referència centre
            copia.setCentre((Punt) centre.clone( )); // clona el Punt referenciat per centre i l’assigna a centre de la còpia 
            return copia; 
        } 
    }

En l’exemple, es clona un Cercle, s’obté una còpia correcta de radi, ja que radi és una primitiva (l’original i el clon tenen el seu propi radi), però la referència centre del clon rep una còpia de la referència centre de l’original, per tant, centre del clon i de l’original apunten al mateix objecte de tipus Punt. Cal fer un clon del Punt referenciat per centre, i assignar-lo al centre del clon (se suposa que Punt té definit el mètode clone).
