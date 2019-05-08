/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author koala
 */
public class FenetreLivre extends JFrame {
    public class Sauvegarde implements ActionListener{
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        Livre livre=new Livre(
                jtfTitre.getText(),
                jtfAuteur.getText(),
                Integer.parseInt(jtfNombrePage.getText()),
                jtfDate.getText()
        );
        list.supprimer(FenetreLivre.this.livre);
        list.ajout(livre);
        list.setVisible(true);
        dispose();
        }
        
    }
    ListeLivre list;
    Livre livre;
    JTextField jtfTitre;
    JTextField jtfAuteur;
    JTextField jtfNombrePage;
    JTextField jtfDate;
    public FenetreLivre(ListeLivre list, Livre livre) {
        this.list=list;
        this.livre=livre;
        initFenetre();
    }

    private void initFenetre() {
        JPanel  jp=new JPanel();
        jp.setLayout(new GridLayout(5,2));
        jp.add(new JLabel("titre"));
        jtfTitre=new JTextField(this.livre.getTitre());
        jp.add(jtfTitre);
        jp.add(new JLabel("Auteur"));
        jtfAuteur=new JTextField(this.livre.getAuteur());
        jp.add(jtfAuteur);
        jp.add(new JLabel("nombre de page"));
        jtfNombrePage=new JTextField(this.livre.getNombrePages()+"");
        jp.add(jtfNombrePage);
        jp.add(new JLabel("date de parution"));
        jtfDate=new JTextField(this.livre.getDateParution().toString());
        jp.add(jtfDate);
        JButton jb=new JButton("sauvegarder");
        jb.addActionListener(new Sauvegarde());
        jp.add(jb);
        this.add(jp);
        this.pack();
        this.setVisible(true);
    }
    
}
