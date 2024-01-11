package teoria;

import teoria.jerarquia.Alumno;

import java.lang.reflect.Method;

public class DemoInteres {
    public static void main(String[] args){

        /*
        getClass()
         */
        Integer a = 6;
        System.out.println(a.getClass());
        System.out.println(a.getClass().getSimpleName());


        Alumno alumno = new Alumno("123456");
        System.out.println(alumno.getClass());

        /*
        Reflexión
         */
        Method[] metodosAlumno = alumno.getClass().getDeclaredMethods();
        for (Method metodo : metodosAlumno) {
            System.out.println(metodo.getName());
        }

        /*
        instanceOf
         */
        int numPrimitive = 6;
        Integer numWrapper = Integer.valueOf(numPrimitive);
        Object demo =  Integer.valueOf(8);
        System.out.println(numWrapper.getClass().getName() + " ¿Es un objeto? " + (numWrapper instanceof Object));

        /* Por ejemplo, si no acertamos con la clase, da un error en tiempo de compilación
        System.out.println(x instanceof String);
        */
        System.out.println(numWrapper.getClass().isInstance(demo));

    }
}
