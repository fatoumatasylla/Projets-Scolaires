package Exo4;



public class Client {
    int num ;
    private double argent;
    private ListP liste;
    String ticket;
    
    public Client(int n,int a, ListP l ){
        this.argent = a;
        this.num =n;
        this.liste =l;
    }
    public double getA(){
        return this.argent;
    }
    public void setA(int a){
        this.argent = a;
    }

    public void setL(Produit p){
        liste.setL(p);
    }
    public ListP getL(){
        return this.liste;
    }
    // TODO: methode paye ???
    public double paye(){
        return this.getA();
    }
    
}