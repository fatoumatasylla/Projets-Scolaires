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
public class ResultButton implements MouseListener {
    JLabel jl;
    public ResultButton(JLabel jl){
        this.jl=jl;
    }
    @Override
    public void mouseClicked(MouseEvent me) {
        Operations.setY(Integer.parseInt(jl.getText().trim()));
        jl.setText(Operations.calcul()+"");
        
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
