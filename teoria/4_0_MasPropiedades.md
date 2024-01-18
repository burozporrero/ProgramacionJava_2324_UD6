# FUNCIONALIDADES DE INTERÉS

<!-- TOC -->
* [FUNCIONALIDADES DE INTERÉS](#funcionalidades-de-interés)
    * [getclass()](#getclass)
    * [instanceOf vs isInstance()](#instanceof-vs-isinstance)
    * [EJEMPLO](#ejemplo)
* [INMUTABILIDAD Y FINAL](#inmutabilidad-y-final)
* [CARDINALIDAD DE OBJETOS](#cardinalidad-de-objetos)
<!-- TOC -->

### getclass()
Definido en Object como un método final, dicho método devuelve una representación en tiempo de ejecución de
la clase del objeto sobre el cual podemos acceder a una serie de características del objeto por ejemplo: el nombre 
de la clase, el nombre de su superclase y los nombres de los interfaces que implementa.

### instanceOf vs isInstance()
Operadores que permiten verificar si un objeto pertenece a una clase determinada. 

[Ver más sobre ellos en este enlace](https://ifgeekthen.nttdata.com/es/que-es-y-como-utilizar-instanceof-en-java)

[InstanceOf con más ejemplos](https://codegym.cc/groups/posts/105-how-the-instanceof-operator-works)

### EJEMPLO
[Demo interés](DemoInteres.java)

# INMUTABILIDAD Y FINAL

Algo mutable es algo que cambia, por lo tanto, podemos deducir, que inmutable se refiere a cuando algo no cambia.
Un objeto inmutable es aquel objeto que no puede ser modificado una vez creado, es decir, no puede cambiar su 
estructura ni los datos que contiene.

Vamos a entender primero por qué String es una clase inmutable en Java y nos los explican muy bien en ["Like a 
shark"](https://www.youtube.com/watch?v=XtrFCtsXSl0)

__NOTA:__ Todos los datos de tipo primitivo son inmutables en java.

Por contra, todos los OBJETOS en Java, son MUTABLES, pero, se pueden construir de forma INMUTABLE.

Veamos un ejemplo propio:
[Demo String inmutable](inmutable/StringInmutable.java)

Aplicar un modificador FINAL por sí solo, no garantiza que el objeto sea inmutable. Aunque una variable de tipo 
objeto, se cree como constante con FINAL, no podremos reasignarle un valor, es decir, no podremos modificar la 
instancia, pero SÍ podremos cambiar su estructura.

En este ejemplo vemos como tenemos un array de char, objetos primitivos y no aplica el principio de la inmutabilidad:
[Veamos el ejemplo conocido, que nos encontramos en ReecribreFrase del tema anterior](inmutable/ReescribeFrase.java)

[Veamos otro ejemplo](inmutable/InmutabilidadVSFinal.java)

Cómo crear una clase de Java inmutable:
- Declarar la clase como final
- Declarar todos los atributos de la clase como finales.
- No proporcionar métodos setters.
- No devolver NUNCA en los métodos de la clase, ninguna referencia al objeto. Se deben devolver copias.

Como siempre en [Aula en la nube](https://www.youtube.com/watch?v=72i5vVL3Sc0&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=110) nos ponen un ejemplo muy detallado de como crear 
una clase inmutable.

Una de las tareas importantes a la hora de crear clases inmutables, es el __clonado de objetos__, para poder devolver 
una copia del objeto y no perder la referencia actual.

Veamos que ocurre cuando pensamos que estamos copiando un objeto en Java y como copiarlo con el método clone.

[Demo](inmutable/DemoMutable.java)

[Clonación de objetos](4_1_Clonacion.md)

Después de entrar en mayor detalle de la clonación, [vamos a ver el ejemplo conocido de ReecribreFrase de nuevo](inmutable/ReescribeFraseInmutable.java)

Veamos más ejemplos de clases inmutables que contienen Arrays y ArrayList:

- [Arrays inmutables en Aula en la nube](https://www.youtube.com/watch?v=5CX4PiQUP5k&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=113)
- [ArrayList inmutables en Aula en la nube](https://www.youtube.com/watch?v=ua7OoQKsdRQ&list=PLG1qdjD__qH6ULjW5iN8E45m5nkaCNbUu&index=115&t=324s)

Para aquellos que tengan más curiosidad y entrar en mayor detalle sobre la clonación, es muy interesante 
[esta página](https://www.digitalocean.com/community/tutorials/java-clone-object-cloning-java)
