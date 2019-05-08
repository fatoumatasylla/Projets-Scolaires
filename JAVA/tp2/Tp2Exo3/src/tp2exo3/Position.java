/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2exo3;

/**
 *
 * @author koala
 */
public class Position {
    
    private int ligne;
    private Colonne c;
   
    public Position(int x,int y){
        this.ligne=x;
        this.c=Colonne.values()[y];
    }
    public Position estPossible(int x,int y){
        boolean b=((ligne+x >= 0)&& ((ligne+x)<8) )? true : false;
        b&=(((c.ordinal()+y)<8) && ((c.ordinal()+y)>=0))? true :false;
        if(b){
            return new Position(ligne+x,c.ordinal()+y);
        }
        else{
            return this;
        }
    }

    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public Colonne getC() {
        return c;
    }

    public void setC(Colonne c) {
        this.c = c;
    }
    @Override
    public String toString(){
        return "position "+getLigne()+" "+getC();
    }
    
}
