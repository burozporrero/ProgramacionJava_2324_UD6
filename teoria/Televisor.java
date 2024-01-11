package teoria;

/**
 * Clase Televisor que permite cambiar canales, el mínimo es el 1 y el máximo el 99
 * @author Aula en la Nube
 * (<a href="https://aulaenlanube.com/zona-programacion/java/tema-5-poo-java-programacion-orientada-objetos/curso-java-sobrecarga-constructores/">...</a>)
 */
public class Televisor {

    private int canal;

    public Televisor() {
        canal = 1;
    }

    public Televisor(int valorCanal) {
        setCanal(valorCanal);
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int valorCanal) {
        if(valorCanal < 1){
            canal = 1;
        } else if (valorCanal >= 100){
            canal = 99;
        } else {
            this.canal = valorCanal;
        }
    }

    public void subirCanal(){
        setCanal(canal + 1);
    }

    public void bajarCanal(){
        setCanal(canal - 1);
    }
}
