package Exo3;

import java.util.Scanner;

public class Calculatrice {

    public static void main(String[] args){
    int rep;
    Scanner sc = new Scanner(System.in);
    System.out.println(" Menu: \n1 - Calcule \n2 _ Calculer le TRI d'un projet \nEntrer 1 ou 2.");
    rep = sc.nextInt();
    //Taux tx = new Taux();

    if(rep == 1){

        Calculer c1 = new Calculer();
        c1.calcule();
    }

    else if(rep == 2){

        //Messsage d'erreur :
        //Exception in thread "main" java.lang.NoSuchMethodError: Exo3.Taux.taux()I
        // at Exo3.Calculatrice.main(Calulatrice.java:20)
        // POURTANAT la classe fonctionne quand je la test
        Taux tx = new Taux();
        tx.tx();
        tx.description();

    }

    else { 
        System.out.println("error"); 
    }

}

}
