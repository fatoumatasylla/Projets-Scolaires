package Exo3;

import java.util.Scanner;

public class Taux {
    private double  Inv ;
    private double Tx ;
    private double Be ;
    private int  P ;
    private double tri = 0;

    
    
    public Taux(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Saisir l'Investissement initial: ");
        this.setInv(sc.nextInt());

        System.out.println("Saisir la période: ");
        this.setP(sc.nextInt());

        System.out.println("Saisir le taux: (si 15% entrer 15)");
        this.setTx(sc.nextInt());

        System.out.println("Saisir le Benefice: ");
        this.setBe(sc.nextInt());

    }
// GETTERS 
   public double getInv() {
       return this.Inv;
   }
   public double getBe() {
    return this.Be;
    }
    public int getP() {
        return this.P;
    }
    public double getTri() {
        return this.tri;
    }
    public double getTx() {
        return this.Tx;
    }
//SETTERS 
    public void setInv( double c) {
        this.Inv = c ;
    }
    public void setBe(double c ) {
        this.Be= c ;
    }
    public void setP(int c) {
         this.P= c ;
    }
    public void setTri(double c) {
         this.tri= c ;
    }
    public void setTx(double c) {
        
         this.Tx= c/100;
    }
    
    // Fonction qui calcule le taux
    public  String tx() {   

    //System.out.println("TRI INIT :"+getTri());
    int p = this.getP();
    double somme = 0; 
    for(int i =1 ; i < p+1 ;i++){
    //Calcule la somme sur une periode i en fonction des benefices

    setBe(this.getBe()) ;
    somme += getBe()/((1+getTx())*i);
    }
    // applique la formule donner en cour: this.getTx()
    // TRI = -inv initiale + Somme(Investimment annuelle durant la periode i à x% taux)
    double tri = -1*this.getInv()+ somme;
    setTri(tri) ;
    
    //System.out.println("TRI 2 :"+getTri());

    String  s= "Pour un Invertissement de: "+this.getInv()
                +"\nd'une période de "+this.getP()+" année(s)"
                +"\nTRI = "+this.getTri();
    return s ;
    }
    
    public void description(){
        System.out.println("Pour un Invertissement de: "+this.getInv()
        +"\nd'une période de "+this.getP()+" année(s)"+
        "\nTRI= "+this.getTri());
        }
       
}