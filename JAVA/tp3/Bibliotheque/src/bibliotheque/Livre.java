/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import java.util.Date;

/**
 *
 * @author koala
 */
class Livre {
    private String titre;
    private String auteur;
    private int nombrePages;
    private String dateParution;

    public Livre(String titre, String auteur, int nombrePages, String dateParution) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePages = nombrePages;
        this.dateParution = dateParution;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }

    public String getDateParution() {
        return dateParution;
    }

    public void setDateParution(String dateParution) {
        this.dateParution = dateParution;
    }
    
    
}
