
package Exercice1;

public class Exercice1 {

    public static void main(String[] args) {

        Voiture v1 = new Voiture(1, "Rio", "stop");
        Voiture v2 = new Voiture(2, "Tokio", "stop");
        Voiture v3 = new Voiture(3, "Berlin", "run");
        Voiture v4 = new Voiture(4, "Nairobi", "run");

        Feu f1 = new Feu("vert");
        Feu f2 = new Feu("vert");
        Feu f3 = new Feu("rouge");
        Feu f4 = new Feu("rouge");

        
        // f1.description();
        // f2.description();
        // f3.description();
        // f4.description();
        Circulation c1 = new Circulation(v1, f1);
        Circulation c2 = new Circulation(v2, f2);
        Circulation c3 = new Circulation(v3, f3);
        Circulation c4 = new Circulation(v4, f4);

    }

}
