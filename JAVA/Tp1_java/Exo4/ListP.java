package Exo4;
import java.util.ArrayList;
import java.util.List;


public class ListP {
     
    private List<Produit> Liste = new ArrayList<Produit>();
    //private Produit produit;
    //Produit p = new Produit(1,"Mask Detox",8.2,"Hygiène");
    //Produit p2 = new Produit(2,"Cookies Granola",1.26,"Alimentaire");
    //Liste.add(p);
    //Liste.add(p2);
    
    public ListP(Produit p1,Produit p2){ 
        this.setL(p1);
        this.setL(p2);
        }
    
    
    //public ListP(Produit p){ 
    //this.produit = p;
    //}

    public void setL(Produit p){
        Liste.add(p);

    }
    public List getL(){
        return this.Liste;
    }

   //public Produit getE(){
   //     Iterator< Produit > itr = this.getL().iterator();
    //    Produit produit;
    //    while(itr.hasNext()){
    //      produit = itr.next();
    //    //System.out.println("produit: "+produit);}
    //        }
    //        return produit ;
     //   }

}
    //public int gett(){
    //  int t = this.Liste.size();
    // return t;
    //}
      
    //public static void main(String[] args) {
        
// MESSAGE D ERREUR :rror: constructor ListP in class ListP cannot be applied to given types;
//ListP P = new ListP();
//          ^
//required: Produit
//found: no arguments
//reason: actual and formal argument lists differ in length

        //List<Produit> Liste = new ArrayList<Produit>();
    //    Produit p = new Produit(3,"Cookies Granola",1.26,"Alimentaire");
    //    System.out.println(p.getPt());
    //    ListP l = new ListP(p.getPt());
    //    l.getL();
     //   System.out.println(l.getE(1));
    //}
