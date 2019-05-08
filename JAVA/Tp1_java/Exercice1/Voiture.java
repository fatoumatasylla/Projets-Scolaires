package Exercice1;

public class Voiture {
    int numero;
    String nom;
    private String etat = " ";

    public Voiture(int numero, String nom, String etat) {
        this.numero = numero;
        this.nom = nom;
        this.etat = etat;

        System.out.println("voirure:" + numero + ", nom:" + nom + ", etat:" + etat);
    }

    //Get & Set pour modifier l'état de ma voiture 

    public String get_e() {
        return etat;
    }

    public void set_e(String e) {
       this.etat = e;
    }

    public String description() {
        return "voirure:" + this.numero + ", nom:" + this.nom + ", etat:" + this.etat;
    }

}
