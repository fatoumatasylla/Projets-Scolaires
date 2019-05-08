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
public class OperationButton  implements MouseListener{
    String op;   
    JLabel jl;
    public OperationButton(JLabel jl,String op){
     this.jl=jl;
     this.op=op;
        
        
    }
    @Override
    public void mouseClicked(MouseEvent me) {
        Operations.setX(Integer.parseInt(jl.getText().trim()));
        jl.setText("                       ");
        Operations.setOp(op);
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
