package ma.projet.beans;

import ma.projet.Personne;

public class Manager extends Personne {
    private String service;

    @Override
    public String toString() {
        return "Manager{" +
                "service='" + service + '\'' +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salaire=" + salaire +
                '}';
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Manager(int id, String nom, String prenom, String mail, String telephone, double salaire, String service) {
        super(id, nom, prenom, mail, telephone, salaire);
        this.service = service;
    }

    @Override
    public double calculerSalaire() {
        salaire+=salaire*0.35;
        return salaire;
    }
}
