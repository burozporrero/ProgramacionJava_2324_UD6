package practica.polimorfismo.angel_parking.GestionParking;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ángel M.
 */
public class GestionParking {
    static Scanner sc = new Scanner(System.in);
    protected ArrayList<Vehiculo> listaVehiculos;

    public GestionParking() {
        listaVehiculos = new ArrayList<>();
        listaVehiculos.add(new Coche("Volkswagen", "Golf", "Javier Ramírez", "Diésel", 4));
        listaVehiculos.add(new Moto("Yamaha", "YZF-R6", "Maria Gómez", "Gasolina", 2));
        listaVehiculos.add(new Bicicleta("Specialized", "Hybrid", "Carmen Ruiz", 2));
        listaVehiculos.add(new Coche("BMW", "X5", "Laura Sánchez", "Gasolina", 4));
        listaVehiculos.add(new Coche("Ford", "Mustang", "Elena Fernández", "Gasolina", 2));
        listaVehiculos.add(new Moto("Honda", "CBR500R", "Juan Pérez", "Gasolina", 2));
        listaVehiculos.add(new Coche("Tesla", "Model 3", "Daniel López", "Eléctrico", 4));
        listaVehiculos.add(new Moto("Suzuki", "GSX-R750", "Pedro López", "Gasolina", 2));
        listaVehiculos.add(new Bicicleta("Giant", "Road Bike", "Raúl Rodríguez", 2));
        listaVehiculos.add(new Bicicleta("Trek", "Mountain Bike", "Sara Martínez", 2));
        listaVehiculos.add(new Coche("Toyota", "Corolla", "Carlos García", "Gasolina", 4));
        listaVehiculos.add(new Moto("Kawasaki", "Ninja 400", "Luis Martínez", "Gasolina", 2));
        listaVehiculos.add(new Moto("Zero", "SR/F", "Ana Rodríguez", "Eléctrico", 2));
        listaVehiculos.add(new Bicicleta("Cannondale", "City Bike", "Mario González", 2));
    }


    //TODO mejor que este método estuviese en el main
    public void mostrarOpciones() {
        boolean repetir = true;
        String opcionSeleccionada;

        do {
            System.out.println("""
                    - Gestión del Parking -
                    1 - Ver vehículos aparcados
                    2 - Registrar vehículo nuevo
                    3 - Dejar plaza libre
                    4 - Salir""");
            System.out.print("Seleccione una opción: ");

            opcionSeleccionada = sc.nextLine();

            switch (opcionSeleccionada) {
                case "1":
                    verVehiculosAparcados();
                    break;
                case "2":
                    registrarVehiculo();
                    break;
                case "3":
                    dejarPlazaLibre();
                    break;
                case "4":
                    System.out.println("Saliendo del programa");
                    repetir = false;
                    break;
                default:
                    System.out.println("Introduce una opción válida");
                    break;
            }

        } while (repetir);
    }

    public void verVehiculosAparcados() {
        for (int i = 0; i < listaVehiculos.size(); i++) {
            Vehiculo vehiculoActual = listaVehiculos.get(i);
            System.out.println("- Plaza " + i + " -");
            System.out.println(vehiculoActual.mostrarDatos());
            System.out.println();
        }
    }

    public void registrarVehiculo() {
        boolean repetir = true;
        System.out.println("""
                ¿Que tipo de vehículo és?:\s
                1 - Coche
                2 - Moto
                3 - Bicileta
                4 - Salir""");

        do {
            System.out.print("Seleccione una respuesta");
            String opcionSeleccionada = sc.nextLine();

            switch (opcionSeleccionada) {
                case "1":
                    preguntarDatosCoche();
                    break;
                case "2":
                    preguntarDatosMoto();
                    break;
                case "3":
                    preguntarDatosBici();
                    break;
                case "4":
                    System.out.println("Saliendo");
                    repetir = false;
                    break;
                default:

                    System.out.println("Introduce una opción válida");
                    break;
            }
        } while (repetir);
    }

    public void dejarPlazaLibre() {
        System.out.println("Que plaza te gustaría dejar libre");
        int plaza = sc.nextInt();

        listaVehiculos.remove(plaza);
    }

    public void preguntarDatosCoche() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los datos del Coche:");

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Propietario: ");
        String propietario = scanner.nextLine();

        System.out.print("Tipo de Motor: ");
        String tipoMotor = scanner.nextLine();

        System.out.print("Nº de Puertas: ");
        int numeroPuertas = scanner.nextInt();

        Vehiculo nuevoCoche = new Coche(marca, modelo, propietario, tipoMotor, numeroPuertas);
        int primeraPosicionVacia = listaVehiculos.indexOf(null);

        if (primeraPosicionVacia != -1) {
            listaVehiculos.set(primeraPosicionVacia, nuevoCoche);
        } else {
            listaVehiculos.add(nuevoCoche);
        }
    }

    public void preguntarDatosMoto() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los datos de la bicicleta:");

        System.out.print("Marca: ");
        String marca = sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Propietario: ");
        String propietario = sc.nextLine();

        System.out.print("Tipo de Motor: ");
        String tipoMotor = sc.nextLine();

        System.out.print("Numero de ruedas: ");
        int numeroRuedas = sc.nextInt();

        Vehiculo nuevaMoto = new Moto(marca, modelo, propietario, tipoMotor, numeroRuedas);

        int primeraPosicionVacia = listaVehiculos.indexOf(null);

        if (primeraPosicionVacia != -1) {
            listaVehiculos.set(primeraPosicionVacia, nuevaMoto);
        } else {
            listaVehiculos.add(nuevaMoto);
        }
    }

    public void preguntarDatosBici() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los datos de la bicicleta:");

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Propietario: ");
        String propietario = scanner.nextLine();

        System.out.print("Numero de ruedas: ");
        int numeroRuedas = sc.nextInt();

        Vehiculo nuevaBici = new Bicicleta(marca, modelo, propietario, numeroRuedas);

        int primeraPosicionVacia = listaVehiculos.indexOf(null);

        if (primeraPosicionVacia != -1) {
            listaVehiculos.set(primeraPosicionVacia, nuevaBici);
        } else {
            listaVehiculos.add(nuevaBici);
        }
    }
}
