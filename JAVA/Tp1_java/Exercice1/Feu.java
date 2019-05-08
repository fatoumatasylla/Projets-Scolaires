package Exercice1;

public class Feu {
    String couleur;

    Feu(String couleur) {
        this.couleur = couleur;
        System.out.println("feu:" + this.couleur);
    }

    public String get_c() {
        return couleur;
    }

    public void setC(String c) {
        this.couleur = c;
    }

    public String description() {
        return "feu:" + this.couleur;
    }

}
