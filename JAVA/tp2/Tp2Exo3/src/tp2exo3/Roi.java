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
public class Roi extends Piece {
    
    public Roi(Position p, Couleur c){
        super(p,c);
        code="RO";
    }
    @Override
    public void mouvement() {
       super.liste_mouvement.add(super.p.estPossible(1, 0));
       super.liste_mouvement.add(super.p.estPossible(1, 1));
       super.liste_mouvement.add(super.p.estPossible(0, 1));
       super.liste_mouvement.add(super.p.estPossible(-1, 1));
       super.liste_mouvement.add(super.p.estPossible(-1, 0));
       super.liste_mouvement.add(super.p.estPossible(-1, -1));
       super.liste_mouvement.add(super.p.estPossible(0, -1));
       super.liste_mouvement.add(super.p.estPossible(1, -1));
       super.afficheProposition();
    }
    
}
