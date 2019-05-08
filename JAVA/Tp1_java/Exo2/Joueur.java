package Exo2;

public class Joueur {

    int numero ;
    String nom ;
    private int mise ;
    private int resultat;
    
    public Joueur(int numero,String nom){
        this.numero = numero;
        this.nom =nom ;
        System.out.println("num:"+ numero +", nom:"+ nom );
    }
    
    public int getMise(){
        return mise;
    }

    public void setMise(int i ){
        this.mise = i ;
    }
    public int getResultat(){
        return resultat;
    }
    public void setResultat(int r){
        this.resultat = r;
    }
    public void description(){
        System.out.println("num:"+ numero +", nom:"+ nom +",mise:"+ mise);
    }

}