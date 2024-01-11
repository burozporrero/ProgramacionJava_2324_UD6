package teoria;

public class NComplex {
    private int pReal; // part real del nombre complex
    private int pImaginaria; // part imaginària del nombre complex

    public NComplex(int pReal, int pImaginaria) { // constructor del nombre complex
        this.pReal = pReal; this.pImaginaria = pImaginaria;
    }

    // el nou codi per al mètode toString
    @Override
    public String toString() { // la capçalera no canvia
        if (pImaginaria == 0) { // si la part imaginària és 0, llavors és un nombre normal
            return pReal + "";
        }
        if (Math.abs(pImaginaria) == 1) { // si la part imaginària és 1 o -1, llavors no es posa l’1
            return pReal + (pImaginaria > 0 ? "+i" : "-i"); // posa la part real i el signe seguit de la i
        }
        return String.format("%d%+di", pReal, pImaginaria); // posa la part real i la part imaginària seguida de la i
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //si la referència obj és igual la referència d'aquesta instància, llavors els objectes són iguals
            return true;
        }
        if (obj == null) { // si l'objecte obj és null, llavors els objectes són diferents
            return false;
        }
        if (getClass() != obj.getClass()) { //si l'objecte obj no és d’aquesta classe, llavors els objectes són diferents
            return false;
        }
        final NComplex other = (NComplex) obj; // l'objecte obj es transforma a la classe NComplex (càsting)
        if (this.pReal != other.pReal) { //si les parts reals són diferents, llavors els objectes són diferents
            return false;
        }
        if (this.pImaginaria != other.pImaginaria) { //si les parts imaginàries són diferents, llavors són diferents
            return false;
        }
        return true; // si les parts reals i imaginaries són iguals, llavors els objectes són iguals
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.pReal; // el càlcul usa el valor de la part real de l’objecte
        hash = 29 * hash + this.pImaginaria; // el càlcul usa el valor de la part imaginària de l’objecte
        return hash;
    }

}
