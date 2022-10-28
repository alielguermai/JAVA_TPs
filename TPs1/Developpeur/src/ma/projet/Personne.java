package ma.projet;

public abstract class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected String mail;
    protected String telephone;
    protected double salaire;
    public Personne(int id, String nom, String prenom, String mail, String telephone, double salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public abstract double calculerSalaire();
}
