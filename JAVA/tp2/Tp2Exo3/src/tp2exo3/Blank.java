/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2exo3;

import static tp2exo3.Couleur.vide;

/**
 *
 * @author koala
 */
public class Blank extends Piece{

    
    public Blank(Position p){
        super(p,vide);
        code="   ";
    }
    @Override
    public void mouvement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
