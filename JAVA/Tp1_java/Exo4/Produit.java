package Exo4;

public class Produit {

    String nom ;
    private double prix;
    private int num;
    private String cat ;

    public Produit(int num,String n, double p , String c){

        this.nom=n;
        this.num =num;
        this.prix= p;
        this.cat= c;
    }

    public void setp(String nom , int prix) {
        this.nom = nom;
        this.prix = prix ;
    }
    
    //GETTERS
    public double getP(){
        return this.prix;
    }
    public int getNum() {
        return this.num;
    }
    public String getC(){
        return this.cat ;
    } 
    public Produit getPt(){
        Produit p = new Produit(this.num,this.nom,this.prix,this.cat) ;
        return p;
    } 
}