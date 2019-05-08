package Exo4;
public class Manager {
    int id ;
    String nom;
    String prenom;
    public Manager(int i, String n, String p){
        this.id = i;
        this.nom = n;
        this.prenom =p; 
    }

    public Caissier remplacer(){
        Caissier c = new Caissier(this.id,this.nom);
        return c;
    }
    public void SupP(ListP p,Produit pt){
        // TODO : Recherche du produit dans la liste 
       // p.Remove(i);
   
    }
    public void ModifList(){
        
    }
}