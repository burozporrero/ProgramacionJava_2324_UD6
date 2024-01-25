package practica.polimorfismo.hugo_parking;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Este ejercicio tiene mejoradas y optimizadas las clases relacionadas con Vehiculo. Tambien el Parking y Plaza.
 * Pero este main habría que actualizarlo para que ejecutara algo similar a lo que hace el ejercicio de Angel.
 *
 * @author Hugo A.
 */
public class ControlParkimetro {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Vehiculo vehiculo = null;
        ArrayList<Double> datosGenerales = datosGenerales();
        int opcion;

        do {
            opcion = seleccionMenu();
            switch (opcion) {
                case 1:
                    vehiculo = new Coche();
                    break;
                case 2:
                    vehiculo = new Bicicleta();
                    break;
                case 3:
                    vehiculo = new Camion();
                    break;
                case 4:
                    System.out.println("Se va a salir del programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("El numero no coincide");
            }
        } while (opcion > 4);
        if (vehiculo != null) {
            agregarVehiculo(datosGenerales, vehiculo);
            interactuarParking(vehiculo);
        }
    }

    //Datos generales
    public static ArrayList<Double> datosGenerales() {
        ArrayList<Double> datosGenerales = new ArrayList<>();

        System.out.println("""
                --Bienvenido al Parking 'El Bicho'
                Por favor, introduzca unos datos generales""");

        System.out.print("Introduzca la longitud de su vehiculo: ");
        datosGenerales.add(sc.nextDouble());

        System.out.print("Introduzca la capacidad de su vehiculo: ");
        datosGenerales.add((double) sc.nextInt());

        System.out.print("Introduzca el numero de puertas de su vehiculo: ");
        datosGenerales.add((double) sc.nextInt());

        System.out.print("Introduzca el numero de ruedas: ");
        datosGenerales.add((double) sc.nextInt());

        return datosGenerales;
    }

    //Menu
    public static int seleccionMenu() {
        char seleccion;
        int seleccionValida = 0;

        System.out.println("""
                Seleccione de los siguientes vehiculos cual desea aparcar:
                1. Coche
                2. Bici
                3. Camion
                4. Salir
                Introduzca un numero que este delante de la opcion: """);
        seleccion = sc.next().charAt(0);

        if (Character.isDigit(seleccion)) {
            seleccionValida = Integer.parseInt(String.valueOf(seleccion));
        } else System.out.println("No se ha introducido un digito\nSaliendo...");

        return seleccionValida;
    }

    //Case 1 --> Añadir coche
    public static void agregarVehiculo(ArrayList<Double> datos, Vehiculo vehiculo) {
        String matricula;
        int caballos;
        char carga;
        String tipoBici;

        vehiculo.setLongitud(datos.get(0));
        vehiculo.setCapacidad(datos.get(1).intValue());
        vehiculo.setNumPuertas(datos.get(2).intValue());
        vehiculo.setNumRuedas(datos.get(3).intValue());

        if (vehiculo.tipoClase().equalsIgnoreCase("camion")
                || vehiculo.tipoClase().equalsIgnoreCase("coche")) {

            System.out.print("Introduzca la matricula: ");
            matricula = sc.next();

            System.out.print("Introduzca el numero de caballos: ");
            caballos = sc.nextInt();

            ((VehiculoMotor) vehiculo).setMatricula(matricula);
            ((VehiculoMotor) vehiculo).setCaballos(caballos);

            if (vehiculo.tipoClase().equalsIgnoreCase("camion")) {

                do {
                    System.out.print("Tiene carga el camion (s/n): ");
                    carga = sc.next().charAt(0);

                    switch (carga) {
                        case 's':
                            ((Camion) vehiculo).setConCarga(Boolean.TRUE);
                            break;
                        case 'n':
                            ((Camion) vehiculo).setConCarga(Boolean.FALSE);
                            break;
                        default:
                            System.out.println("Se ha introducido un valor incorrecto");
                    }
                } while ((carga != 's' && carga != 'n'));
            }

        } else {
            System.out.print("Inserte el tipo de bicicleta: ");
            tipoBici = sc.next();
            ((Bicicleta) vehiculo).setTipo(tipoBici);
        }
    }

    //Opcion a realizar
    public static void interactuarParking(Vehiculo vehiculo) {

        int opcion;
        do {
            System.out.println("""
                    Introduzca si quiere salir o entrar
                    1. Salir del parking
                    2. Entrar al parking
                    3. Salir""");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    switch (vehiculo.tipoClase().toLowerCase()) {
                        case "coche":
                            ((Coche) vehiculo).irse();
                            break;
                        case "camion":
                            ((Camion) vehiculo).irse();
                            break;
                        default:
                            ((Bicicleta) vehiculo).irse();
                    }
                    break;
                case 2:
                    switch (vehiculo.tipoClase().toLowerCase()) {
                        case "coche":
                            ((Coche) vehiculo).aparcar();
                            break;
                        case "camion":
                            ((Camion) vehiculo).aparcar();
                            break;
                        default:
                            ((Bicicleta) vehiculo).aparcar();
                    }
                case 3:
                    System.out.println("Se abandona el vehiculo en el parking");
                    break;
                default:
                    System.out.println("Valor introducido incorrecto");
            }
        } while (opcion != 3);
    }
}
