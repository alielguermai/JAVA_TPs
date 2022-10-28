package ma.projet.test;

import ma.projet.classes.Employe;
import ma.projet.classes.Etudiant;
import ma.projet.classes.Professeur;

public class Application {
    public static void main(String[] args) {
        Etudiant etud1 = new Etudiant(9,"bentaleb","rachid","EE101010");
        Etudiant etud2 = new Etudiant(76,"el guermai","ali","EE000111");
        Employe emp1= new Employe(1,"cherqaoui","adil",6000);
        Employe emp2 = new Employe(2,"sabir","simo",7500);
        Professeur prof1= new Professeur(3,"alaoui","samir",9000,"reseau");
        Professeur prof2= new Professeur(4,"mohammed","sami",4000,"economie");
    }
}
