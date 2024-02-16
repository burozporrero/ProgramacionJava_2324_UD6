# EJERCICIOS VARIOS

1. Revisar el código de la [siguiente clase](/practica/varios/Student.java) y determinar ante que tipo de clase nos
   encontramos.
    2. Estamos ante una clase inmutable.
2. Métodos de una interfaz ¿Tienen que cumplir alguna restricción y/u obligación?
    3. Los métodos Default deben tener una implementación
    4. Los métodos Static estar implementados también
    5. Los métodos abstractos no deben estar implementados
3. El atributo protected se utiliza para...
    4. Que un atributo o método de una clase sea accesible en las clases
       del mismo paquete y también en las subclases
4. ¿Es posible crear una instancia de una clase abstracta?
    5. No
5. La palabra clave que tengo que usar para que una interfaz herede de otra es implements.
    6. Si
7. Una clase que implementa una interfaz, debe sobreescribir todos sus métodos
    8. Si
8. Una clase que extiende a otra, debe sobreescribir todos sus métodos
    9. No
9. Una variable es inmutable en Java, si está marcada con el modificador final.
    10. No
11. ¿Que es un método de instancia?
    12. Un método de instancia en Java es un método que opera en instancias de una clase y
        depende de los atributos específicos de esa instancia y puede acceder a ellos
        utilizando this
12. ¿Que es un método de clase?
    13. Aquel que puede ser invocado sin tener que crear una instancia de la clase y no puede acceder a
        los atributos o métodos no estáticos de la clase.
13. Siguiendo mi solución de extiende figura y teniendo en cuenta las convenciones de java... ¿qué modificarías a
    continuación?

```java
public static void main(String[] args) {

    Rectangulo r1;
    r1 = new Figura(12.5, 23.7); // TODO polimorfirmo no válido
    System.out.println("Area de r1 = " + Rectangulo.getArea()); // TODO no estático

    Rectangulo r2 = new Rectangulo(8.6, 33.1);
    System.out.println("Area de r2 = " + r2.toString()); // TODO mejor no usar toString para imprimir el área

    if (r1.mayorQue(r2)) // TODO debería ser llamada estática
        System.out.println("El rectángulo de mayor area es r1");
    else
        System.out.println("El rectángulo de mayor area es r2");

    Triangulo t1 = new Triangulo(20.1, 20.1);
    System.out.println(t1.toString());

    System.out.println("Es triangulo mayor que r1: " + Figura.mayorQue(r1, t1));
}
```

```java
public class Caja implements FiguraVolumen { // TODO es extends

    final String NOMBRE = "Caja"; // TODO falta private y static
    rectangulo base; // TODO falta private y la R mayúscula
    double profundidad; // TODO falta private

    public Caja(double base, double altura, double profundidad) {
        // TODO falta super nombre
        this.base = new Rectangulo(base, altura);
        this.profundidad = profundidad;
        if (profundidad < 0) this.profundidad = 1;
    }

    public Caja() {
    } // TODO FAlta super

    //TODO falta implementar el resto de métodos necesarios: getters, setters, toString, hashCode y clone.
    // TODO falta implementar todos los métodos de la interfaz que implementa
}
```
