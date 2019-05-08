/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author koala
 */
public class LivreListener implements ActionListener {
    ListeLivre list;
    Livre livre;
    public LivreListener(ListeLivre aThis, Livre l) {
        this.list=aThis;
        this.livre=l;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        new FenetreLivre(list,livre);
        
    }
    
    
}
