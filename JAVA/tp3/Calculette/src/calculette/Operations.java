/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculette;

/**
 *
 * @author koala
 */
public class Operations {
    static private int  x,y;
    static private String op;
    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Operations.x = x;
    }
    private static int addition(){
        return x+y;
    }
    private static int soustraction(){
        return x-y;
    }
    private static int division(){
        return Math.round(x/y);
    }
    private static int multiplication(){
        return x*y;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        Operations.y = y;
    }

    public static String getOp() {
        return op;
    }

    public static void setOp(String op) {
        Operations.op = op;
    }
    
    static int  calcul() {
      switch(op){
          case "+":return addition();
          case "-":return soustraction();
          case "*": return multiplication();
          case "/":return division()
                  ;
      }
      return -1;
    }
    
    
    
    
    
}
