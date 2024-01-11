# EJERCICIOS ABSTRACCIÓN, ENCAPSULACIÓN Y OCULTACIÓN

## Abstraete
Abstrae las características de una casa e imprímela por pantalla utilizando los atributos de la clase casa en 
“Private”, debe tener al menos 5 atributos. Para finalizar, imprime los atributos por pantalla.

[Solución](abstraccion/Main.java)

## Caja mágica

Un aventurero encuentra una caja mágica en uno de sus viajes. 

La caja puede guardar un solo objeto dentro de ella, pero es un truco: cada vez que el objeto se saca de la caja, se 
pierde. 

Crea un programa para que un usuario dé nombre a un aventurero que encuentre la caja. El aventurero podrá ver los contenidos de la caja e interactuar con ella (meter y sacar objetos).

- Debes crear diversas clases, una por cada objeto que necesites.
- Protege debidamente los métodos y atributos que creas convenientes.
- El usuario deberá recibir por pantalla el nombre del aventurero y el objeto con el que interactúa cada vez que use 
  la caja (usa métodos set y get).

[Solución](caja_magica/Principal.java)

## Gestión de biblioteca
Eres parte de un equipo de desarrollo de software para una compañía de gestión de bibliotecas. 
Necesitas diseñar un sistema para manejar la información de libros prestados por los usuarios. 

Los detalles de los libros y usuarios deben estar protegidos y solo accesibles a través de métodos específicos. 

Además, se requiere abstracción para representar los préstamos de libros y su gestión

[Solución](biblioteca/GestionBiblioteca.java)

# EJERCICIOS HERENCIA Y POLIMORFISMO

## Crea estudiante

A partir de la siguiente clase:

![Clase persona](images/persona.png)

Construye una clase 'Estudiante' con los atributos: nombre, edad y créditos matriculados. 
Solo hace falta que imprima por pantalla la información indicada, si quieres modificar la información para que aparezca de forma diferente puedes hacerlo como quieras.

[Solución](estudiante/Main.java)

## Crea estudiante 2

La clase padre es la clase “Empleado”. Está clase contiene: un atributo privado “nombre” de tipo String que heredan el resto de clases. Un constructor por defecto, un constructor con parámetros que inicializa el nombre con el String que recibe, métodos “set” y “get” para el atributo nombre, un método toString() que devuelve el String “Empleado” + nombre.

El resto de clases solo deben sobrescribir el método toString() en cada una de ellas y declarar el constructor adecuado de forma que cuando la ejecución de las siguientes instrucciones:

    Empleado E1 = new Empleado("Rafa");
    Directivo D1 = new Directivo("Mario");
    Operario OP1 = new Operario("Alfonso");
    Oficial OF1 = new Oficial("Luis");
    Tecnico T1 = new Tecnico("Pablo");
    System.out.println(E1);
    System.out.println(D1);
    System.out.println(OP1);
    System.out.println(OF1);
    System.out.println(T1);

Den como resultado:

![Diagrama clases](images/ejercicio_dayanara.png)
