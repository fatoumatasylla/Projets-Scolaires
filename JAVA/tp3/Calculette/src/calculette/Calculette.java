/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculette;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author koala
 */
public class Calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame jf=new JFrame("Calculette");
        JLabel jl=new JLabel("                         ");
        jl.setSize(600, 80);
        
        jf.setLayout(new BorderLayout());
        JPanel Jp=new JPanel();
        Jp.setLayout(new GridLayout(4,4));
        for(int  i=0;i<10;i++){
        JButton jb=new JButton(""+i+"");
        jb.addMouseListener(new ClickButton(jl,i));
        Jp.add(jb);
        
        
        }
        
        JButton jb=new JButton(" + ");
        jb.addMouseListener(new OperationButton(jl,"+"));
        Jp.add(jb);
        jb=new JButton(" - ");
        jb.addMouseListener(new OperationButton(jl,"-"));
        Jp.add(jb);
        jb=new JButton(" * ");
        jb.addMouseListener(new OperationButton(jl,"*"));
        Jp.add(jb);
        
        jb=new JButton(" / ");
        jb.addMouseListener(new OperationButton(jl,"/"));
        Jp.add(jb);
        
        jb=new JButton(" = ");
        jb.addMouseListener(new ResultButton(jl));
        Jp.add(jb);
       
        jf.add(jl,BorderLayout.NORTH);
        jf.add(Jp,BorderLayout.CENTER);
       
        jf.pack();
        jf.setVisible(true);
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
