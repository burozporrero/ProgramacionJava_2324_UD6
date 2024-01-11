package teoria.jerarquia;

public class MainPolimorfismo {

    public static void main(String[] args){

        Persona maria = new Persona();
        maria.setNombre("María");

        Alumno gonzalo = new Alumno("Gonzalo");

        //Profesor bea = new Profesor("Bea");
        Profesor bea = new Profesor();
        bea.setNombre("Bea");

        Profesor leo = new ProfesorEspecialista("Programador senior");
        Persona nueva = new ProfesorEspecialista("Analista");
    }
}
