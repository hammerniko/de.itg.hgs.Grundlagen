package G_Schleifen;

import java.util.Scanner;

public class SchleifeWhile {

    
    public static void main(String[] args) {
             
        String passwort;
        int a;
        
        
        
        
        Scanner s = new Scanner(System.in);
       
        
        do {
          System.out.println("Passwort:");
          passwort = s.next();
        } while (!passwort.equals("hallo"));

        
       
        
    }

}
