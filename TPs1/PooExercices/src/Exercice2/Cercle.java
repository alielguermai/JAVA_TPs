package Exercice2;

public class Cercle extends Forme{
    double rayon;

    public Cercle(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }

    @Override
    public double getSurface() {
        final double pi = 3.14159265358979323846;
        return pi*(Math.pow(rayon,2));
    }
}
