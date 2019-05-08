/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2exo3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author koala
 */
public abstract class Piece {
    protected Position p;
    protected String code;
    protected Couleur c;
    ArrayList<Position> liste_mouvement=new ArrayList<>();
    public Piece(Position p, Couleur c){
        this.p=p;
        this.c=c;
    }
    
    abstract public void mouvement();
    
    public void afficheProposition(){
        System.out.println("Voici les positions possibles :");
        int i=0;
        for(Position pos : liste_mouvement){
            System.out.println(i+++" : "+pos.toString());
         }
        System.out.println("Faites un choix ");
        Scanner sc=new Scanner(System.in);
        int j=sc.nextInt();
        deplacement(j);
        liste_mouvement=new ArrayList<>();
    }
    public void deplacement(int i){
      
      Plateau.deplacement(this, liste_mouvement.get(i));
    }
    public Position getP() {
        return p;
    }

    public void setP(Position p) {
        this.p = p;
    }

    public Couleur getC() {
        return c;
    }

    public void setC(Couleur c) {
        this.c = c;
    }
    
    @Override
    public String toString(){
        return this.code+((c==Couleur.noir)? "N": (c==Couleur.blanc)? "B" :"");
    }
    
}
