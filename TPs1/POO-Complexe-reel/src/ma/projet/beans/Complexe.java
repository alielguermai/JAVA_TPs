package ma.projet.beans;

import ma.projet.inter.IAffichage;
import ma.projet.inter.IOperation;

public class Complexe implements IOperation, IAffichage {
    private double im;
    private double re;

    public Complexe(double im, double re) {
        this.im = im;
        this.re = re;
    }


    @Override
    public String affiche() {
        return "partie réelle = "+re+" et partie imaginaire = "+im;
    }

    @Override
    public Complexe plus(Complexe obj) {
        this.im+=obj.im;
        this.re+= obj.re;
        return this;
    }

    @Override
    public Complexe moins(Complexe obj) {
        this.im-=obj.im;
        this.re-= obj.re;
        return this;
    }
}
