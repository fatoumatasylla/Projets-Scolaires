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
public class Reine extends Piece {

    public Reine(Position p,Couleur c){
        super(p,c);
        code="RE";
    }
    @Override
    public void mouvement() {
        //diagonal N E
        Position p2=new Position(p.getLigne(),p.getC().ordinal());
        Position p1=p2.estPossible(1,1 );
        while(((p1!=p2)) && Plateau.estVide(p1)){
            super.liste_mouvement.add(p1);
            p2=p1;
            p1=p1.estPossible(1, 1);
        }
        if(Plateau.estPossible(p1, this))super.liste_mouvement.add(p1);
        
        //diagonal S E
         p2=new Position(p.getLigne(),p.getC().ordinal());
        p1=p2.estPossible(-1,1 );
        while(((p1!=p2)) && Plateau.estVide(p1)){
            super.liste_mouvement.add(p1);
            p2=p1;
            p1=p1.estPossible(-1, 1);
        }
        if(Plateau.estPossible(p1, this))super.liste_mouvement.add(p1);
        //diagonal S O
         p2=new Position(p.getLigne(),p.getC().ordinal());
        p1=p2.estPossible(-1,-1 );
        while(((p1!=p2)) && Plateau.estVide(p1)){
            super.liste_mouvement.add(p1);
            p2=p1;
            p1=p1.estPossible(-1, -1);
        }
        if(Plateau.estPossible(p1, this))super.liste_mouvement.add(p1);
        //diagonal N O
         p2=new Position(p.getLigne(),p.getC().ordinal());
        p1=p2.estPossible(1,-1 );
        while(((p1!=p2)) && Plateau.estVide(p1)){
            super.liste_mouvement.add(p1);
            p2=p1;
            p1=p1.estPossible(1, -1);
        }
        if(Plateau.estPossible(p1, this))super.liste_mouvement.add(p1);
        //deplacement N 
        p2=new Position(p.getLigne(),p.getC().ordinal());
        p1=p2.estPossible(1,0 );
        while(((p1!=p2)) && Plateau.estVide(p1)){
            super.liste_mouvement.add(p1);
            p2=p1;
            p1=p1.estPossible(1, 0);
        }
        if(Plateau.estPossible(p1, this))super.liste_mouvement.add(p1);
        
        //déplacement  E
         p2=new Position(p.getLigne(),p.getC().ordinal());
        p1=p2.estPossible(0,1 );
        while(((p1!=p2)) && Plateau.estVide(p1)){
            super.liste_mouvement.add(p1);
            p2=p1;
            p1=p1.estPossible(0, 1);
        }
        if(Plateau.estPossible(p1, this))super.liste_mouvement.add(p1);
        //déplacement O 
         p2=new Position(p.getLigne(),p.getC().ordinal());
        p1=p2.estPossible(0,-1 );
        while(((p1!=p2)) && Plateau.estVide(p1)){
            super.liste_mouvement.add(p1);
            p2=p1;
            p1=p1.estPossible(0, -1);
        }
        if(Plateau.estPossible(p1, this))super.liste_mouvement.add(p1);
        //deplacement S
         p2=new Position(p.getLigne(),p.getC().ordinal());
        p1=p2.estPossible(-1,0 );
        while(((p1!=p2)) && Plateau.estVide(p1)){
            super.liste_mouvement.add(p1);
            p2=p1;
            p1=p1.estPossible(-1, 0);
        }
        if(Plateau.estPossible(p1, this))super.liste_mouvement.add(p1);
        super.afficheProposition();
    }
    
}
