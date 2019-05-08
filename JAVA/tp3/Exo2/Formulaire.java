package Exo2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Formulaire extends JFrame {

    public Formulaire(){
        Container conteneur=this.getContentPane( ) ;
        JPanel panel=new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder( " Formulaire " )) ;

        JTextField v1 = new JTextField(40);
        v1.addTextListener( new);
        JTextField v2 = new JTextField(40);
        v1.addTextListener(this);
        JTextField v3 = new JTextField(40);
        v1.addTextListener(this);
        JTextField v4 = new JTextField(40);
        v1.addTextListener(this);

        panel.add(new JLabel("Nom:"));
        panel.add(v1);
        panel.add(new JLabel("Auteur:"));
        panel.add(v2);
        panel.add(new JLabel("nombre de page:"));
        panel.add(v3);
        panel.add(new JLabel("Date de Parution:"));
        panel.add(v4);

        JButton enregistrer = new JButton("enregistrer");
        enregistrer.addActionListener( new Enregistred());

        panel.add(enregistrer);
        conteneur.add(panel) ;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
}




class Enregistred implements ActionListener {

    Bibliotheque b = new Bibliotheque() ;
    
    private String nom;
     private String auteur;
     private int nbPage;
     private String dateParution; 
     
    public void actionPerformed(ActionEvent e){

        // utiliser un text listener au lieu d'un event listener 

    // extraction des donnees entree 
    
    if (e.getSource().equals("enregistrer"){


     String nom =  v1.getText();
     String auteur=  v2.getText();
     int np= v3.getText();
     String dp=  v4.getText();

     Livre l = new Livre(nom,auteur,np,dp );
    
     b. setLivres(l);

     b.init();
 
}
    }
  }      


}


