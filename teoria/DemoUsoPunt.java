package teoria;

public class DemoUsoPunt {

    public static void main(String[] args) {
        Punt elPunt; // elPunt és una referència de tipus Punt
        Punt[] punts = new Punt[5]; // punts és una matriu per a 5 objectes de tipus Punt
        elPunt = new Punt(11, 22); // crea un objecte de tipus Punt i l’assigna a el Punt
        punts[0] = elPunt; //assigna a elPunt a la posició 0 de la matriu

        Punt a = new Punt();

    }
}
