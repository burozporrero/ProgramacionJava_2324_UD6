package teoria.jerarquia;

public class Main {

    public static void main(String[] args){

        Persona maria = new Persona();
        maria.setNombre("María");

        Alumno gonzalo = new Alumno("34556667");
        if(gonzalo.esCumpleanyos()){
            //activar tarjeta regalo
        }

        //Profesor bea = new Profesor("Bea");
        Profesor bea = new Profesor();
        bea.setNombre("Bea");

        gonzalo.setNombre("Gonzalo");
        maria.esCumpleanyos();
        gonzalo.esCumpleanyos();


        Profesor leo = new ProfesorEspecialista("Programador senior");
    }
}
