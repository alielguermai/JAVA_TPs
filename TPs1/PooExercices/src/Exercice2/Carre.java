package Exercice2;

public class Carre extends Forme{
    double cote;

    @Override
    public String toString() {
        return "Carre{" +
                "cote=" + cote +
                '}';
    }

    public Carre(double cote) {
        this.cote = cote;
    }

    @Override
    public double getSurface() {
        return Math.pow(cote,2);
    }
}
