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
public class Pion extends Piece {

    
    public Pion(Position p,Couleur c){
        super(p,c);
        code="PI";
    }
    @Override
    public void mouvement() {
       int avance=(this.c==Couleur.noir)? -1 :1;
       if(Plateau.estVide(super.p.estPossible(avance, 0))){
       super.liste_mouvement.add(super.p.estPossible(avance, 0));
       }
       if(Plateau.estPossible(super.p.estPossible(avance, 1),this)){
       super.liste_mouvement.add(super.p.estPossible(avance, 1));
       }
       if(Plateau.estPossible(super.p.estPossible(avance, -1),this)){
       super.liste_mouvement.add(super.p.estPossible(avance, -1));
       }
     
       super.afficheProposition();
    }
   
    
}
