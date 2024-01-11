package teoria.herencia;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    /**
     * INVOCACION AL MAIN en la propia clase para ver mejor el ejemplo
     * @param args
     */
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        Cat.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}
