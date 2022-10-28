package ma.projet.ecole.test;

import ma.projet.ecole.Professeur;
import ma.projet.ecole.Specialite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class test{
    public static void main(String[] args) {
        Specialite s1= new Specialite("a1","JAVA/JEE");
        Specialite s2 = new Specialite("b2",".net");
        Specialite s3 = new Specialite("c3","Gestion de projet");
        Specialite s4 = new Specialite("d4","CISCO");
        Specialite s5 = new Specialite("c5","PHP");
        Professeur p1 = new Professeur("safi","asmaa","0648294958","safi@gmail.com",s1);
        Professeur p2 = new Professeur("alami","said","06732884","alami@yahoo.fr",s1);
        Professeur p3 = new Professeur("alaoui","reda","063792912","alaoui@yahoo.fr",s4);
        Professeur p4 = new Professeur("kamali","imane","0685949292","i.kamali@gmail.com",s4);
        Professeur p5 = new Professeur("elguermai","ali","0647823894","alielguermai@gmail.com",s5);
        Professeur p6 = new Professeur("cherquaoui","adil","54454321","adli@gmail.com",s2);
        Professeur p7 = new Professeur("alaoui","sami","043903490","sami@gmail.com",s2);
        Professeur[] proftableau = {p1,p2,p3,p4,p5,p6,p7};
        Specialite[] sptableau={s1,s2,s3,s4,s5};
        ArrayList<String> labelles=new ArrayList<>(List.of(p1.getSp().getLibelle(),p2.getSp().getLibelle(),p3.getSp().getLibelle(),p4.getSp().getLibelle(),p5.getSp().getLibelle(),p6.getSp().getLibelle(),p7.getSp().getLibelle()));
        for (Specialite spe :sptableau){
            String lib= spe.getLibelle();
            if (labelles.contains(lib)){
                System.out.println(spe);
                for (Professeur p:proftableau){
                    if (Objects.equals(p.getSp().getLibelle(), lib)){
                        System.out.println(p);
                    }
                }
            }
        }
    }
}
