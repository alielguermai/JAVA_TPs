package ma.projet.ecole;

import java.util.ArrayList;
import java.util.Arrays;

public class Specialite {
    private static int id=0;
    private String code;
    private String libelle;
    private static ArrayList<Integer> ids=new ArrayList<>();
    public static ArrayList<Integer> getIds() {
        return ids;
    }
    public Specialite(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
        id++;
        ids.add(id);
    }

    @Override
    public String toString() {
        return "Spécialité "+libelle+" :";
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
