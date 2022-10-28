package ma.projet.beans;

import ma.projet.inter.IAffichage;
import ma.projet.inter.IOperation;

public class Reel implements IOperation, IAffichage {
    private double x;

    public Reel(double x) {
        this.x = x;
    }

    public double plus(double x){
        return this.x+x;
    }

    public double moins(double x){
        return this.x-x;
    }

    @Override
    public String affiche() {
        return "le nombre reel est :"+x;
    }

    @Override
    public Complexe plus(Complexe obj) {
        return null;
    }

    @Override
    public Complexe moins(Complexe obj) {
        return null;
    }
}
