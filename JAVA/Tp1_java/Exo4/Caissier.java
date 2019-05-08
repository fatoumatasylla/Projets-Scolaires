package Exo4;


public class Caissier {
    int id ;
    String nom;
   
    public Caissier(int num, String nom){
        this.id= num;
        this.nom= nom;

    }

    public void demandeFond(){
        // TODO :
        // Solde insuffisant -> RespV.mfond(x)
     
    }
    public void addP(Client c, Produit p){
        //modif liste du client 
        ListP liste = c.getL();
        liste.setL(p);

        
    }
    public void verifSolde(Caisse caisse){
        caisse.getSolde();
    }

}