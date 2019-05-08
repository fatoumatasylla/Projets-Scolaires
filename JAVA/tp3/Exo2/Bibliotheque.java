package Exo2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bibliotheque {

    // creation de la bibliotheque

    public Jframe fenetre = new Jframe("Bibliotheque");
    public JLabel liste = new JLabel("Livres");
    public JPanel affichage = new JPanel();
    public JPanel creation = new JPanel();
    public Jframe ajout = new Formulaire();
    public JButton ajouter = new JButton("Ajouter");

    private ArrayList<Livre> Livres = new ArrayList<Livre>();

    public bibliotheque(){
        Livre L1 = new Livre("test1","fatou",6,"18-02-2018");
        Livre L2 = new Livre("test2","Nicolas",66,"08-06-2018");
        Livres.add(L1);
        Livres.add(L2);

        init();
    }

    public void setLivres(Livre l) {
        Livres.add(l);
    }

}

    public void init() {

        // initialisation de ma bibliotheque
        this.fenetre.setLayout(new BorderLayout());

        this.affichage.setPreferredSize(new Dimension(2000, 400));
        this.fenetre.add(affichage, BorderLayout.NORTH);

        this.creation.setPreferredSize(new Dimension(2000, 400));

        ajouter.addActionListener(new Addbook());
        this.creation.add(ajouter);

        this.fenetre.add(creation, BorderLayout.SOUTH);

        this.fenetre.setResizable(false);

        this.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.fenetre.setPreferredSize(new Dimension(2000, 400));

        this.fenetre.setVisible(true);
        this.fenetre.pack();

    }

    // ACTION LISTENER QUI OUVRE NOTRE FENETRE POUR AJOUTER UN LIVRE
    class AddBook implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Formulaire frame = new Formulaire();

            frame.setVisible(true);
        }
    }
}

// ACTION LISTENER POUR METTRE A JOUR LA LISTE
