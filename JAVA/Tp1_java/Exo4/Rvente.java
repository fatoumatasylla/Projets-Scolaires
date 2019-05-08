package Exo4;
public class Rvente {
    int id ;
    String nom;
    String prenom;

    public Rvente(int i, String n, String p){
        this.id = i;
        this.nom = n;
        this.prenom =p; 
    }
    // TODO 
    public void getCoffre(Coffre c){
      
    }

    public void ModiFond(Caisse c,double f){
    c.setSolde(f);
    }
}