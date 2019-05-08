/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author koala
 */
public class ListeLivre extends JFrame {

    public class ListListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
          Livre l= new Livre("","", 0,"");
          FenetreLivre fenL=new FenetreLivre(ListeLivre.this,l);
          ListeLivre.this.dispose();
        }
        
    }
    ArrayList<Livre> list=new ArrayList<>();
    public ListeLivre(){
        initFrame();
    }
    public void initFrame(){
        this.setLayout(new GridLayout(this.list.size()+5,1));
        for(Livre l: list){
        JPanel jp=new JPanel();
        jp.add(new JLabel(l.getTitre()));
        JButton jb=new JButton("modifier le livre");
        jb.addActionListener(new LivreListener(this,l));
        jp.add(jb);
        this.add(jp);
        }
        JPanel jp=new JPanel();
        JButton jb=new JButton("ajouter un livre à la bibliothèque");
        jb.addActionListener(new ListListener());
        jp.add(jb);
        this.add(jp);
        
    }

    void ajout(Livre livre) {
       this.list.add(livre);
       this.setContentPane(createRootPane());
       initFrame();
       this.pack();
    }
    
    void supprimer(Livre livre) {
       this.list.remove(livre); 
    }
}
