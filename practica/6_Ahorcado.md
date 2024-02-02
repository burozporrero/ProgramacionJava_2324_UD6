# EJERCICIO juego del ahorcado

Las necesidades son las siguientes:

1. Vamos a añadir a la aplicación principal del juego MultiplicationGame otro juego
2. La aplicación principal nos debe permitir elegir a que juego queremos jugar.
3. En el futuro nos permitirá jugar a varios juegos diferentes.
4. Para el ahorcado, tendremos la clase Incognita y estará formada por:
    1. Un atributo: Texto: una cadena que almacenará el texto de la incógnita.
    2. Métodos, como mínimo:
        1. Incognita(String texto) que crea Incognita con el texto.
        2. getTipo que retorna el tipo de Incognita.
        3. getTexto que retorna el texto la incógnita.
        4. setTexto(String text) que asigna el texto a la incògnita.
        5. equals dos incógnitas són iguales si tienen el mismo tipo y texto.
        6. toString que retorna el tipo y texto de la incógnita

5. Las incógnitas a su vez podrá ser de tres tipos diferentes: Película, Libro o Grupo musical.
6. Dados 3 arrays definidos de 5 películas, 5 libros y 5 grupos musicales, el juego en sí del ahorcado, creará una
   array nuevo de incógnitas cada vez que lancemos el juego. Este array se precargará con 6 incógnitas diferentes
   y aleatorias de entre los 3 de tipos concretos, cada vez que se arranque el juego.
7. La incognita a averiguar se elegirá en cada partida aleatoriamente entre las incógnitas cargadas en el array de
   incógnitas.
8. El ahorcado tendrá como atributos, el array de incognitas, la incognita a adivinar y la palabra en juego.
9. Tendremos 12 intentos para averiguar la incognita. Cuando solo queden 6 intentos, se informará al usuario del
   tipo de incognita que está buscando, para ayudarle.  
