package ma.projet.classes;

public class Etudiant extends Personne {
    private String cne;

    public Etudiant(int id, String nom, String prenom, String cne) {
        super(id, nom, prenom);
        this.cne = cne;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }
    public String toString(){
        return id+" "+nom+" "+prenom+" "+cne;
    }
}
