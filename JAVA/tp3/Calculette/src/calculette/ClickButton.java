/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculette;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/**
 *
 * @author koala
 */
public class ClickButton implements MouseListener {
    private JLabel jlabel;
    private int num;
    public ClickButton(JLabel lab,int i){
        this.jlabel=lab;
        this.num=i;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        this.jlabel.setText(this.jlabel.getText()+num);
        
            }

    @Override
    public void mousePressed(MouseEvent me) {
   }       


    @Override
    public void mouseReleased(MouseEvent me) {
       
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
}
