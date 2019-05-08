package Calculatrice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.lang.Double;
import java.lang.Object;

public class Calculatrice {

    public JFrame fenetre = new JFrame("Calculatrice");

    public JPanel affichage = new JPanel();
    public JLabel ecran = new JLabel("0");
    public JPanel chiffres = new JPanel();
    public JPanel operateurs = new JPanel();

    public double numEntree;
    public String operateur = "";
    // Variable qui change au clic operateur et a l entrer du 1er chiffre
    public boolean clic = false;
    public boolean entree = false;

    public Calculatrice() {
        init();
    }

    public void init() {

        // init l affichage

        this.fenetre.setLayout(new BorderLayout());
        // this.ecran.setFont("Courier New", Font.BOLD, 16);
        this.ecran.setBorder(BorderFactory.createLineBorder(Color.black));
        this.affichage.add(ecran);

        this.ecran.setPreferredSize(new Dimension(200, 40));
        this.fenetre.add(ecran, BorderLayout.NORTH);

        this.chiffres.setLayout(new GridLayout(4, 4));
        this.chiffres.setPreferredSize(new Dimension(400, 300));
        this.fenetre.add(chiffres, BorderLayout.CENTER);

        this.operateurs.setLayout(new GridLayout(4, 4));
        this.operateurs.setPreferredSize(new Dimension(40, 300));
        this.fenetre.add(operateurs, BorderLayout.EAST);

        this.fenetre.setResizable(false);

        // init les bouttons

        String[] btnName = { "1", "2", "4", "5", "6", "7", "8", "9", "0", ",", "=", "/", "*", "-", "+" };
        JButton[] btn = new JButton[btnName.length];

        for (int i = 0; i < btnName.length; i++) {
            // ASSOCIE CHAQUE CARATERE A UN BOUTTONS

            btn[i] = new JButton(btnName[i]);
            btn[i].setPreferredSize(new Dimension(50, 40));

            // AJOUTE LES BOUTEONS AU PANNEL OPERATEUR + leurs actions
            if (i == 10) {
                btn[i].addActionListener(new EgaleLtr());
                btn[i].setPreferredSize(new Dimension(20, 40));
                operateurs.add(btn[i]);
            }
            if (i == 11) {
                btn[i].addActionListener(new DivLtr());
                btn[i].setPreferredSize(new Dimension(20, 40));
                operateurs.add(btn[i]);
            }
            if (i == 12) {
                btn[i].addActionListener(new MultiLtr());
                btn[i].setPreferredSize(new Dimension(20, 40));
                operateurs.add(btn[i]);
            }
            if (i == 13) {
                btn[i].addActionListener(new MoinsLtr());
                btn[i].setPreferredSize(new Dimension(20, 40));
                operateurs.add(btn[i]);
            }
            if (i == 14) {
                btn[i].addActionListener(new PlusLtr());
                btn[i].setPreferredSize(new Dimension(20, 40));
                operateurs.add(btn[i]);
            }

            else {
                // AJOUTE LES BOUTEONS AU PANNEL CHIFFRE
                chiffres.add(btn[i]);
                btn[i].addActionListener(new ChiffreListener());

            }

        }

        this.fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.fenetre.setPreferredSize(new Dimension(400, 400));

        this.fenetre.setVisible(true);
        this.fenetre.pack();

    }

    // Methode en foction de l'operateur

    private void calcul() {

        if (operateur.equals("+")) {
            numEntree = numEntree + Double.valueOf(ecran.getText()).doubleValue();
            ecran.setText(String.valueOf(numEntree));
        }
        if (operateur.equals("-")) {
            numEntree = numEntree - Double.valueOf(ecran.getText()).doubleValue();
            ecran.setText(String.valueOf(numEntree));
        }
        if (operateur.equals("*")) {
            numEntree = numEntree * Double.valueOf(ecran.getText()).doubleValue();
            ecran.setText(String.valueOf(numEntree));
        }
        if (operateur.equals("/")) {
            numEntree = numEntree / Double.valueOf(ecran.getText()).doubleValue();
            ecran.setText(String.valueOf(numEntree));
        }
    }

    public class ChiffreListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String s = ((JButton) event.getSource()).getText();

            if (entree) {
                entree = false;
            } else {
                if (!ecran.getText().equals("0"))
                    s = ecran.getText() + s;
            }
            ecran.setText(s);

        }
    }

    public class EgaleLtr implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {
            calcul();
            clic = false;
            entree = true;
        }
    }

    public class PlusLtr implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {
            if (clic) {
                calcul();
                ecran.setText(String.valueOf(numEntree));
            } else {
                numEntree = Double.valueOf(ecran.getText()).doubleValue();
                clic = true;
            }
            operateur = "+";
            entree = true;
        }
    }

    public class MoinsLtr implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {
            if (clic) {
                calcul();
                ecran.setText(String.valueOf(numEntree));
            } else {
                numEntree = Double.valueOf(ecran.getText()).doubleValue();
                clic = true;
            }
            operateur = "-";
            entree = true;
        }
    }

    public class DivLtr implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {

            if (clic) {
                calcul();
                ecran.setText(String.valueOf(numEntree));
            } else {
                numEntree = Double.valueOf(ecran.getText()).doubleValue();
                clic = true;
            }
            operateur = "/";
            entree = true;
        }
    }

    public class MultiLtr implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {
            if (clic) {
                calcul();
                ecran.setText(String.valueOf(numEntree));
            } else {
                numEntree = Double.valueOf(ecran.getText()).doubleValue();
                clic = true;
            }
            operateur = "*";
            entree = true;
        }
    }

}