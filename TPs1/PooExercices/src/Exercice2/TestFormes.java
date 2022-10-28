package Exercice2;
import java.text.DecimalFormat;
public class TestFormes{
    public static void main(String[] argv) {
        DecimalFormat df = new DecimalFormat(". ##");
        Forme[] figures = new Forme [3];
        figures [0] = new Carre (2); // Création d'un carré de 2 cm de coté
        figures [1] = new Cercle (3); // Création d'un cercle de 3 cm de rayon
        figures [2] = new Carre (5.2); // Création d'un carré de 5,2 cm de coté
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i] + ": surface = " + df.format(figures[i].getSurface()) + " cm2");
        }
    }
}
