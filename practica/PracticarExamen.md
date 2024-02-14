# EJERCICIOS VARIOS

1. Revisar el código de la siguiente clase y determinar ante que tipo de clase nos
   encontramos.

```java
package practica.varios;

final class Student {
    private final int id;
    private final String name;
    private final int deptNo;

    private Student(int id, String name, int deptNo) {
        this.id = id;
        this.name = name;
        this.deptNo = deptNo;
    }

    public static Student with(int id, String name, int deptNo) {
        return new Student(id, name, deptNo);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDeptNo() {
        return deptNo;
    }
}
```

2. Métodos de una interfaz ¿Tienen que cumplir alguna restricción y/u obligación?
3. El atributo protected se utiliza para...
4. ¿Es posible crear una instancia de una clase abstracta?
5. La palabra clave que tengo que usar para que una interfaz herede de otra es implements.
7. Una clase que implementa una interfaz, debe sobreescribir todos sus métodos
8. Una clase que extiende a otra, debe sobreescribir todos sus métodos
9. Una variable es inmutable en Java, si está marcada con el modificador final.
11. ¿Que es un método de instancia?
12. ¿Que es un método de clase?
13. Siguiendo mi solución de extiende figura y teniendo en cuenta las convenciones de java... ¿qué modificarías a
    continuación?

```java
public static void main(String[] args) {

    Rectangulo r1;
    r1 = new Figura(12.5, 23.7);
    System.out.println("Area de r1 = " + Rectangulo.getArea());

    Rectangulo r2 = new Rectangulo(8.6, 33.1);
    System.out.println("Area de r2 = " + r2.toString());

    if (r1.mayorQue(r2))
        System.out.println("El rectángulo de mayor area es r1");
    else
        System.out.println("El rectángulo de mayor area es r2");

    Triangulo t1 = new Triangulo(20.1, 20.1);
    System.out.println(t1.toString());

    System.out.println("Es triangulo mayor que r1: " + Figura.mayorQue(r1, t1));
}
```

```java
public class Caja implements FiguraVolumen {

    final String NOMBRE = "Caja";
    rectangulo base;
    double profundidad;

    public Caja(double base, double altura, double profundidad) {
        this.base = new Rectangulo(base, altura);
        this.profundidad = profundidad;
        if (profundidad < 0) this.profundidad = 1;
    }

    public Caja() {
    }
}
```
