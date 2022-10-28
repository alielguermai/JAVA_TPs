package ma.projet.beans;

import ma.projet.Personne;

public class Developpeur extends Personne {
    private String specialite;

    @Override
    public String toString() {
        return "Developpeur{" +
                "specialite='" + specialite + '\'' +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salaire=" + salaire +
                '}';
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Developpeur(int id, String nom, String prenom, String mail, String telephone, double salaire, String specialite) {
        super(id, nom, prenom, mail, telephone, salaire);
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        salaire+=salaire*0.2;
        return salaire;
    }

}
