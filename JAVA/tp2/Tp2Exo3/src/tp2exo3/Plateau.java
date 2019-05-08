/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2exo3;

import java.util.Scanner;

/**
 *
 * @author koala
 */
public class Plateau {
    private static Piece[][] plateau=new Piece[8][8];
    
    public static boolean estPossible(Position pos,Piece pi ){
        Piece p =Plateau.getCase(pos);
        if( p.getC()==Couleur.noir &&  pi.getC()==Couleur.blanc) return true;
        if(p.getC()==Couleur.blanc &&  pi.getC()==Couleur.noir) return true;
        return false;
    }
    public static boolean estVide(Position pos){
        return Plateau.getCase(pos).getC()==Couleur.vide;
    }
    public static Piece getCase(Position pos){
        
        return plateau[pos.getLigne()][pos.getC().ordinal()];
    }
    public static void setCase(Piece p){
        plateau[p.getP().getLigne()][p.getP().getC().ordinal()]=p;
    }
    
    public  static void deplacement(Piece pi,Position pos){
        Piece p=new Blank(pi.getP());
        pi.setP(pos);
        setCase(pi);
        setCase(p);
        
    }
    
    public static void montrerPlateau(){
        System.out.println("  | A | B | C | D | E`| F | G | H |  ");
        for(int i=0;i<8;i++){
            System.out.print(i+" |");
            for(int j=0;j<8;j++){
                System.out.print(plateau[i][j].toString()+" | ");
            }
            System.out.println("\n------------------------------------------");
        }
    }
    public static Piece ChoisirPiece(){
        System.out.println("choisir une piece : entrer une ligne de 0 à 7 ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("choisir une colonne : A B C D E F G H ");
        String y=sc.next();
        Colonne c=Colonne.valueOf(y.toUpperCase());
        return plateau[x][c.ordinal()];
    }
    
    public static void initPlateau(){
       Plateau.setCase(new Tour(new Position(0,0),Couleur.blanc));
       Plateau.setCase(new Cheval(new Position(0,1),Couleur.blanc));
       Plateau.setCase(new Fou(new Position(0,2),Couleur.blanc));
       Plateau.setCase(new Reine(new Position(0,3),Couleur.blanc));
       Plateau.setCase(new Roi(new Position(0,4),Couleur.blanc));
       Plateau.setCase(new Fou(new Position(0,5),Couleur.blanc));
       Plateau.setCase(new Cheval(new Position(0,6),Couleur.blanc));
       Plateau.setCase(new Tour(new Position(0,7),Couleur.blanc));
       for(int i=0;i<8;i++){
           Plateau.setCase(new Pion(new Position(1,i),Couleur.blanc));
       }
       for(int j=2;j<6;j++){
            for(int i=0;i<8;i++){
                Plateau.setCase(new Blank(new Position(j,i)));
            }
        }
       Plateau.setCase(new Tour(new Position(7,7),Couleur.noir));
       Plateau.setCase(new Cheval(new Position(7,6),Couleur.noir));
       Plateau.setCase(new Fou(new Position(7,5),Couleur.noir));
       Plateau.setCase(new Reine(new Position(7,4),Couleur.noir));
       Plateau.setCase(new Roi(new Position(7,3),Couleur.noir));
       Plateau.setCase(new Fou(new Position(7,2),Couleur.noir));
       Plateau.setCase(new Cheval(new Position(7,1),Couleur.noir));
       Plateau.setCase(new Tour(new Position(7,0),Couleur.noir));
       for(int i=0;i<8;i++){
           Plateau.setCase(new Pion(new Position(6,i),Couleur.noir));
       }
    }
    public static void run(){
        
    }
}
