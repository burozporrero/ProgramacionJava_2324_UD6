# HERENCIA

<!-- TOC -->
* [HERENCIA](#herencia)
  * [ABSTRACT](#abstract)
  * [INTERFACES](#interfaces)
    * [Interfaces conocidas](#interfaces-conocidas)
    * [Métodos default y static en una interfaz](#métodos-default-y-static-en-una-interfaz)
* [Bibliografía](#bibliografía)
<!-- TOC -->

## ABSTRACT

Una clase abstracta es una clase de la que no se pueden crear instancias. Su utilidad consiste en permitir que otras clases deriven de ella. De esta forma, proporciona un modelo de referencia a seguir a la vez que una serie de métodos de utilidad general. 

Las clases abstractas se declaran empleando la palabra reservada abstract.

    public abstract class FiguraAbstracta {
        ...
        abstract public double area();

Una clase abstracta puede componerse de varios atributos y métodos pero debe tener, al menos, un método abstracto (declarado también con la palabra reservada abstract en la cabecera). Los métodos abstractos no se implementan en el código de la clase abstracta pero las clases descendientes de ésta han de implementarlos o volver a declararlos como abstractos (en cuyo caso la subclase también debe declararse como abstracta). En cualquier caso, ha de indicarse el tipo de dato que devuelve y el número y tipo de parámetros.

    public class Rectangulo extends FiguraAbstracta {
        ...
        public double area() {
            return this.base * this.altura;
        }

[Demo figura](herencia/TrabajaFiguras.java)

[EJERCICIO CONJUNTO](demo_vehiculo/SUGERENCIAS_EJERCICIOS_DINAMICOS.md)

## INTERFACES

Son un elemento que surge, en cierta medida porque en Java no existe la herencia múltiple, por lo que solo es posible heredar de una única clase.

Una interfaz es una clase de la que no se pueden crear instancias. Su utilidad consiste en permitir que otras clases 
implementen sus métodos. De esta forma, proporciona un protocolo a seguir por las clases que la implementan.  

Las interfaces se declaran empleando la palabra reservada interface.

Una interfaz puede estar compuesta de constantes y métodos únicamente. Los métodos no se implementan en el código de 
la interfaz, se declara únicamente su firma.

Un ejemplo que considero muy interesante para entender el concepto de interfaz, se encuentra en la propia página de 
[Oracle](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html) 

Las interfaces: 
- Indican que hacer, pero no como hacerlo.
- Todos los métodos de una interfaz son IMPLÍCITAMENTE ABSTRACTOS (public abstract), no es necesario especificarlo en 
  la declaración.
- Todas las variables y atributos de una interfaz son IMPLÍCITAMENTE CONSTANTES (public static final), no es 
  necesario especificarlo en la declaración.
- Una clase puede extender una clase y/o implementar muchas interfaces. Una interfaz puede extender muchas interfaces. Con las interfaces no hay límite, recuérdalo.
- "Igual EXTENDS igual. Distinto IMPLEMENTS distinto." Esto quiere decir que una clase extiende otra clase, pero una 
  clase implementa una interfaz. De igual modo, una interfaz extiende otra interfaz. Por último, una interfaz no puede heredar de una clase.Las interfaces no pueden heredar de una clase.
- El orden de las palabras clave cuando una clase extiende otra clase e implementa una o varias interfaces es 
  extends-implements. Si te paras a pensar, tiene lógica: primero colocas la única clase que se puede extender, y a continuación la lista ilimitada de interfaces que se implementen.

### Interfaces conocidas

[Clonable](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Cloneable.html)

[List](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html)

[Iterable](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Iterable.html)

### Métodos default y static en una interfaz

Los métodos que en su cabecera incluyen estos modificadores son los únicos que pueden contener código, dentro de 
una interfaz. 

Los métodos DEFAULT aparecen en Java 8 con la finalidad de poder modificar una interfaz ya creada, sin tener que 
modificar todas las clases que implementen dicha interfaz. 

Especifican un comportamiento por defecto para el método y todas aquellas clases que implementaban previamente la 
interfaz, ya tienen un comportamiento por defecto, pero aquellas clases nuevas, se espera que sobreescriban el 
método y que, por tanto, especifiquen un nuevo comportamiento.

Los métodos STATIC tienen en mismo comportamiento que en cualquier otra clase. No pueden ser sobreescritos y 
pertenecen a la clase, no a la instancia.

Para entender mejor su cometido visitar [Oracle](https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html)

__[DEMO default](interfaz_default_method/Main.java)__ 

# Bibliografía

Información extraída de:

[javautodidacta.es](https://javautodidacta.es/la-herencia-en-java/#:~:text=El%20orden%20de%20las%20palabras,de%20interfaces%20que%20se%20implementen.)

[arkaitzgarro.com](https://www.arkaitzgarro.com/java/capitulo-16.html)
