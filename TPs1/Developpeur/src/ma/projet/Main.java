package ma.projet;

import ma.projet.beans.Developpeur;
import ma.projet.beans.Manager;

public class Main {
    public static void main(String[] args) {
        Developpeur dev1 = new Developpeur(76,"el guermai","ali","alielguermai@gmail.com","0678345467",16000,"back-end");
        Developpeur dev2 = new Developpeur(9,"bentaleb","rachid","rachidbentaleb@gmail.com","0667834901",18000,"css");
        Manager m1 = new Manager(1,"haha","adil","adilhaha@gmail.com","067838289",8000,"marketing");
        Manager m2 = new Manager(2,"hehe","sami","samihehe@gmail.com","843928",4000,"digital");
        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println(m1);
        System.out.println(m2);
    }
}
