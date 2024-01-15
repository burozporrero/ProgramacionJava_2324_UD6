package practica.herencia_empleado;

public class GestionEmpleados {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Rafa");
        Directivo d1 = new Directivo("Mario");
        Operario o1 = new Operario("Alfonso");
        Oficial of1 = new Oficial("Luis");
        Tecnico t1 = new Tecnico("Pablo");

        System.out.println(e1);
        System.out.println(d1);
        System.out.println(o1);
        System.out.println(of1);
        System.out.println(t1);
    }
}
