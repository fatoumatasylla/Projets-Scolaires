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
public class Tp2Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plateau.initPlateau();
        while(true){
        Plateau.montrerPlateau();
        Piece p=Plateau.ChoisirPiece();
        if(p==null)break;
        
        p.mouvement();
       
        }
    }
    
}
