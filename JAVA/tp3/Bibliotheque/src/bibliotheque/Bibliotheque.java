/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import javax.swing.JFrame;

/**
 *
 * @author koala
 */
public class Bibliotheque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListeLivre l=new ListeLivre();
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.pack();
        l.setVisible(true);
    }
    
}
