package Exo4;

public class Coffre {
    private String code = "tp1java";
    private int somme = 0 ;
    private int max = 500;
    private int min = 50 ;

    public void Gerefonds(){
    //TODO 
    // getsolde si s>max = remise a min
    // s< min = remise au min autoriser
    
    }
    //




    //GET AND SET 

    public int getS() {
        return somme;
    }
    public void setS( int s){
       this.somme = s ;
    }

    public int getMax() {
        return this.max; 
    }
    public void SetMax(int m) {
        this.max = m;
    }

    public int getMin() {
        return this.min; 
    }
    public void SetMin(int m) {
        this.min = m;
    }
  
}