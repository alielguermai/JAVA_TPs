package ma.projet.ecole;

import java.util.ArrayList;
import java.util.Arrays;

public class Professeur {
    private static int id=0;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private static ArrayList<Integer>ids=new ArrayList<>();
    private Specialite sp;

    public Specialite getSp() {
        return sp;
    }

    public void setSp(Specialite sp) {
        this.sp = sp;
    }

    public static ArrayList<Integer> getIds() {
        return ids;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (ids.contains(id)){
            System.out.println("Cette id deja existe !");
        }
        else {
            this.id=id;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom.substring(0,1).toUpperCase()+prenom.substring(1).toLowerCase();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "- "+nom+" "+prenom+" "+email;
    }

    public Professeur(String nom, String prenom, String telephone, String email,Specialite sp) {
        this.nom = nom.toUpperCase();
        this.prenom = prenom.substring(0,1).toUpperCase()+prenom.substring(1).toLowerCase();
        this.telephone = telephone;
        this.email = email;
        id++;
        ids.add(id);
        this.sp=sp;
    }
}
