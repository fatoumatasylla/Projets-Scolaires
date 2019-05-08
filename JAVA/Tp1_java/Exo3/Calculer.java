package Exo3;

import java.util.Scanner;

public class Calculer {
    String p;
    int p1;
    int p2;
    
    public Calculer() {
        //intancie le calcule
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Saisir l'opération (+, -, *, /): ");
        this.p = sc.nextLine();
  
        System.out.println("Saisir l'Opérande1: ");
        this.p1 = sc.nextInt();
 
        System.out.println("Saisir l'Opérande1: ");
        this.p2 = sc.nextInt();
  
      
    }
// Calcule
    public void calcule() {
        String p = this.p;
        int p1 = this.p1;
        int p2 = this.p2;
        int r;
        switch (p){
            case "+":
            r= p1+p2;
            System.out.println(p1 +p + p2 +"="+ r);
            break;
            case "-":
            r= p1-p2;
            System.out.println(p1 +p + p2 +"="+ r);
            break;
            case "/":
            r= p1/p2;
            System.out.println(p1 +p + p2 +"="+ r);
            break;
            case "*":
            r= p1*p2;
            System.out.println(p1 +p + p2 +"="+ r);
            break;
             
        }
        
    }
    
  
}

