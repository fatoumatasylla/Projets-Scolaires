package Exo4;

public class Achat{
    ListP P ;
    Client client ;
    Caissier vendeur ;
    Caisse vente ;

    public Achat(ListP P, Client c, Caissier v, Caisse vente){
    this.P = P;
    this.client = c;
    this.vendeur= v;
    this.vente =vente;
    }

    // senario
    public void achat(){
     this.vente.Apayer();
     this.client.getA(); 
     this.vente.rendMonaie();
     this.vente.ticket();
    }
}

