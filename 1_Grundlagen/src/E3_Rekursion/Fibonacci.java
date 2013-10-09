/*
 * Created on 06.06.2005
 *
 * By Nikolai Hammer
 */
package E3_Rekursion;

public class Fibonacci {
    public static void main (String []args){
      int n= 12;
      System.out.println (fibozahl(n));
      System.exit(0);
    }

    static int fibozahl(int x){
      int wert=1;
      if (x>1){
        wert= fibozahl (x-1) + fibozahl (x-2);
      }
      return wert;
    }
 } 
