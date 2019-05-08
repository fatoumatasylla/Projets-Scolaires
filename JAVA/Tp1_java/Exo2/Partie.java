package Exo2;
import java.util.Scanner;

public class Partie {

    public static void main(String[] args) {
       
        
        Joueur j1 = new Joueur(1,"cars");
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir la mise J1 :");
        int m1 = sc.nextInt();
        j1.setMise(m1) ;
        
        Joueur j2 = new Joueur(2,"queen");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Saisir Ta mise J2  :");
        int m2 = sc.nextInt();
        j2.setMise(m2) ;

        Jeu p1= new Jeu(j1,j2);
        p1.lancer();

   
    }
    
}