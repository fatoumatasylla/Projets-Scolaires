package Exo4;

import java.util.Iterator;
import java.util.Random;
public class Caisse { 
    private Caissier caissier;
    private ListP P; 
    private Client c1;
    private int num ;
    private double solde = 500;
    
    public Caisse(int n ,Caissier c1,Client c){ 
      this.num = n;
      this.caissier = c1;
      this.c1 = c;
      this.P = c.getL(); 
    }

     // Calcule ce que le client doit payer
     public double Apayer(){
      double total =0;
      // recupere le prix de chaque produit 
      //  Liste des Produits
      
      for(int i =0 ; i< 3 ; i++){
         // Recgerche le prix 
       //Produit produit = produits.getE();
       ListP produits = this.P;
      
       Iterator< Produit > itr = produits.iterator();
       Produit produit;
        while(itr.hasNext()){
          produit = itr.next();
        //System.out.println("produit: "+produit);}
            }
      double prix = produit.getP();

      total = total + prix;
      return total ;
      }
      return total;
    }  
     
    // Modifie le solde et l'argent du client
     public double rendMonaie(){

       double monaie =  this.Apayer() - c1.getA() ; 
       return monaie;
     }

    // Responsable de ventes vas changer les fonds
    public void setSolde(double s ){
      this.solde = s;
    }

    // GETTERS
    public double getSolde(){
      return this.solde;
    }
    public Client getClient(){
      return this.c1;
    }
    public Caissier getCaissier(){
      return this.caissier;
    }
    public ListP getL(){
      return this.P;
    } 
    public int getN(){
      return this.num;
    } 

    // new constructeur pour editer le ticket
    //public Caisse(int n){
      
    //  this.num = n;
    //  this.caissier = getCaissier();
    //  this.c1 = getClient();
    //  this.P = getL();
    //}
    
    public Ticket ticket(){
      //RAndom num ticket
      Random r = new Random();
      int num = 674778494* r.nextInt(123456);

      //Caisse C = new Caisse(1);
      Caisse C = new Caisse(getN(),getCaissier(),getClient());
      Ticket T = new Ticket(num,C);
      return T;
    }

    public void encaisse(){
      // TODO :
      // compare l'argent du client 
      // Si inferieur a Apayer() appler le manager 
      // modif liste de ticket m.modif()
      // nouveaux à payer 
      //rends la monaie
    }
                    
} 
