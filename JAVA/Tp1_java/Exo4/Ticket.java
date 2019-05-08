package Exo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ticket {
    Client c;
    Caisse c1;
    int num;
    ListP Produits;
    String cat[] = {"Alimenetaire","Hygiéne","Loisir","Entretien"};
    List<Produit> A = new ArrayList<Produit>();
    List<Produit> H = new ArrayList<Produit>();
    List<Produit> L = new ArrayList<Produit>();
    List<Produit> E = new ArrayList<Produit>();

    public Ticket(int n, Caisse c1 ){
        this.num = n;
        this.c1 = c1;
        this.c = c1.getClient();
        this.Produits= c1.getClient().getL();
        ;
    }

   public void scanner(){
    
       int n = this.num ;
       //Liste des Produits
       
       for(int i =0 ; i< 3 ; i++){
     
        ListP Produits = this.Produits ;
        // TODO 
        // Produits.iterator()
        // While itertor = next 
        //
        //Produit produit = Produits.getE();
        Iterator< Produit > itr = Produits.iterator();
        Produit produit;
        while(itr.hasNext()){
          produit = itr.next();
        //System.out.println("produit: "+produit);}
            }


        if (produit.getC().equals(cat[0])){
            this.A.add(produit);
        }
        else if(produit.getC().equals(cat[1])){
            this.H.add(produit);
        }
        else if(produit.getC().equals(cat[2])){
            this.L.add(produit);
        }
        else if(produit.getC().equals(cat[3])){
            this.E.add(produit);
        }
        else{System.out.println("error: catégorie pas trouvé");}     
        }
    }
    
    public double total(){
    Caisse c1 = this.c1;
    double total = c1.Apayer();
    return total;
    }
    
    public double monaie(){
    Caisse c1 = this.c1;
    double total = c1.Apayer();
    
    //double total= this.total();
    double argent = this.c.getA();
    double monaie = total - argent;
    return monaie;

    }   

    public String des(){
        double p =this.total();
        double m = this.monaie();
        
        String s ="Ticket num°"+this.num+
            "\nAlimentaire : \n" + this.A +
            "\nHygiéne: \n" + this.H +
            "\nLoisir: \n"+ this.L +
            "\nEntretien: \n"+ this.E +
            "\nA payer" + p+
            "\nMonaie rendu "+ m + "." ;

     return s ;
            
          
    }
}