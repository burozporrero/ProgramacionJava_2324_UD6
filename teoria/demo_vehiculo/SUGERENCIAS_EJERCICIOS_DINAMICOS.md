En primer lugar, subir las clases para que los alumnos las tengan disponibles y las revisemos juntos.
Pedir __ideas__ sobre todo lo que digo a continuación e __ir implementándolo__ sobre la marcha.
- VehiculoMotor, ¿Podria extender alguna clase de las disponibles?
  - Vehiculo
- VehiculoMotor ¿Podria implementas alguna clase de las disponibles?
  - IVehiculoMotor, Radio, ABS
  - GPS puede que no porque todos los coches no tienen GPS
  - Crear otra clase que sea VehiculoMotorGps
- Otra clase que pueda implementar GPS y Radio
  - Smartphone por ejemplo y no tendría nada que ver con un coche
- Otra clase que pueda extender Vehiculo
  - Bicicleta 
- Otra clase que pueda implementar VehiculoMotor
  - Camion
- Ideas para forzar polimorfismo.
  - Crear una clase __Starter__: dispositivo presente en coches antiguos que utilizan carburadores en vez de inyección 
    electrónica en el motor. Su función es regular de manera mecánica, la combinación de combustible para conseguir una mezcla equilibrada que propicie una combustión óptima.
    
        class Starter {
            // static method, can be called without instantiating the class
            public static void startEngine(IVehiculoMotor vehicle) {
                vehicle.arrancar();
            }
        }
    Que se usará así:
  
        VehiculoMotor seat = new Coche(4,5);
        VehiculoMotor tata = new Camion(4, 5);

        Starter.startEngine(seat); // starting engine ...
        Starter.startEngine(tata); // starting truck engine ...
  
- Buscar otro método que podamos meter en una interfaz de tipo default. 
  - Idea:

  
    /**
    * Implementación que devuelve las coordenadas aproximadas de alguna fuente conectada como wifi o móvil
    */
    default public void getCoordenadasAproximadas() {
        System.out.println("Fetching rough coordinates...");
    }

- Imaginemos una clase MusicPlayer, es posible que tenga los mismos métodos que radio?? 
  - Si
- Un smartphone podría implementar ambas?
  - Sí, de hecho no hace tanto, los smartphones llevaban radio y musicPlayer
- Entonces, si los métodos de ambas interfaces tienen el mismo nombre y smartphone implementa ambas ¿cómo se a que 
  método estoy llamando?
  - No me ha pasado nunca, vamos a probar y a buscar información a ver que podemos hacer
- Ahora vamos a añadir a MusicPlayer un método statico ¿que se les ocurre?
  - Por ejemplo, mostrar anuncio:


    interface MusicPlayer {
      public static void commercial(String sponsor) {
      System.out.println("Now for a message brought to you by " + sponsor);
    }

- Como se utilizará ese método

      public static void main(String[] args) {
        Smartphone motoG = new Smartphone();
        MusicPlayer.commercial("Motorola"); // Called on interface not on implementing class
         // motoG.commercial("Motorola"); // This would cause a compilation error
      }
- ¿Una interfaz podía implementar otra interfaz?
  - No, "Igual EXTENDS igual. Distinto IMPLEMENTS distinto."
- Vamos a extender la interfaz MusicPlayer o hacer que la interfas MusicPlayer extienda de otra superior ¿Que se les 
  ocurre?
  - Interfaz Player:


    public interface MusicPlayer extends Player {
      default public void next() {
        System.out.println("Next from MusicPlayer");
      }
    }

- ¿Más ideas?

[Ideas en parte extraidas de freecodecamp.org](https://www.freecodecamp.org/news/java-interfaces-explained-with-examples/)
