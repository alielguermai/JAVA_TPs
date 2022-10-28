import ma.projet.beans.Complexe;
import ma.projet.beans.Reel;

public class Main {
    public static void main(String[] args) {
        Reel r= new Reel(4);
        Complexe c1= new Complexe(4.3,1);
        Complexe c2 = new Complexe(5,2.9);
        c1.plus(c2);
        System.out.println(c1.affiche());
    }
}
