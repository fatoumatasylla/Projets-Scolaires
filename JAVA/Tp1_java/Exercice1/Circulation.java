
package Exercice1;

public class Circulation {
    Voiture voiture;
    Feu feu;
    String couleur;
    String etat; 

    public Circulation(Voiture voiture, Feu feu) {
          this.voiture = voiture;
          this.feu = feu ;
          this.etat = voiture.get_e();
          this.couleur = feu.get_c();
    


        
        if (this.couleur.equals("rouge")){
            this.feu.setC("vert");
        } 
        else if (this.couleur.equals("vert")){
            feu.setC("rouge");
           
        }
        else {
            System.out.println("error");
        }

        if (this.etat.equals("stop") ){
             voiture.set_e("run"); 
             
        }

        else if (this.etat.equals("run")){
            voiture.set_e("stop");
        }
        else {
            System.out.println("error");
        }
              System.out.println("Changement:\n"+ feu.description() + "\n" + voiture.description());
  
    }

    
}
