package Exo2;
import java.util.Random;

public class Jeu {
    Joueur joueur1;
    Joueur joueur2;
    Random rand = new Random();
    int r1; 
    int r2;
    
   // int dé2=  Math.Math.random() * 7)
   
   public Jeu(Joueur j1, Joueur j2){
       this.joueur1 = j1;
       this.joueur2 = j2;
   }

   public void lancer(){ 
    // genere les deux dé lancer 
    //int l [] =;
    int l[] = new int[2];
        for(int i =0 ;i < 2 ;i++){ 
            int d1 = rand.nextInt(7);
            int d2 = rand.nextInt(7);
//debug: System.out.println("Dé:"+ d1 + "  " +d2);
            int somme = d1+d2;
//debug : System.out.println("somme:"+ i + "  " +somme);
            l[i]= somme;  
            
        }

    // attribue un lancer à un joueur 
//debug :System.out.println("tab:"+l[0]+"  "+l[1]);
 

        joueur1.setResultat(l[0]);
        joueur2.setResultat(l[1]);
        System.out.println("joueur 1 Lancer :"+joueur1.getResultat());
        System.out.println("joueur 2 Lancer :"+joueur2.getResultat()); 

//debug :récuperer les données ajouté et effectue la comparaison
        //int r1 =this.joueur1.getResultat();
        int r2 =this.joueur2.getResultat();
//debug :System.out.println("r1:" +r1 +"\nr2:"+r2);
        int J1 =7-r1;
        int J2 = 7-r2;
//debug :System.out.println("J1:" +J1 +"\nJ2:"+J2);
        
       int j1 =Math.abs(J1);
       int j2 =Math.abs(J2);

       
System.out.println("j1:" +j1 +"\nj2:"+j2);
        
    // affiche le resultat  
   if (j2 < j1 || j2 == 0){
        System.out.println("le joueur "+ joueur2.nom +" a gagané " + joueur1.getMise() +"€");
    }

    
    else if (j1 > j2 || j1 == 0){
        System.out.println("le joueur "+ joueur1.nom +" a gagané"  + joueur2.getMise() +"€");
    }
    else if (j1 == j2){
        System.out.println("ex-aequo rejouer !");
    }
    else{ System.out.println("error"); }
   
}
}