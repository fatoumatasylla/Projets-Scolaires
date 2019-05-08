package Exo4;

public class Acheter {
    

    public static void main(String[] args) {
    // Message d'erreur 
    //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
    //at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
    //at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
    //at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
    //at java.base/java.util.Objects.checkIndex(Objects.java:372)
    //at java.base/java.util.ArrayList.get(ArrayList.java:458)
    //at Exo4.ListP.getE(ListP.java:31)
    //at Exo4.Ticket.scanner(Ticket.java:33)
    //at Exo4.Acheter.main(Acheter.java:17)
    
    Produit p = new Produit(1,"Mask Detox",8.2,"Hygiène");
    Produit p2 = new Produit(2,"Cookies Granola",1.26,"Alimentaire");
    ListP P = new ListP(p,p2);
    Client client = new Client(1,50,P);
    Caissier vendeur = new Caissier(1,"fatou");

    Caisse vente = new Caisse(1,vendeur,client);
    Ticket ticket = vente.ticket();
    
    ticket.scanner();
    ticket.total();
    ticket.monaie();

    System.out.println("A payer: "+ vente.Apayer()+
                       "\nSomme donner: "+ client.paye()+
                       "\nMonaie: "+ vente.rendMonaie()+
                       "\n"+ ticket.des() );
    
     }
}