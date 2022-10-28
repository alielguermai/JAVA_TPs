package Exercice1;

public class TestMetiers {
    public static void main(String[] argv) {
        Personne[] personnes = new Personne[3];
        personnes[0] = new Menuisier("Amine");
        personnes[1] = new Plombier("Ahmed");
        personnes[2] = new Menuisier("Ali");
        for (int i = 0; i < personnes.length; i++)
            personnes[i].affiche();
    }
}
