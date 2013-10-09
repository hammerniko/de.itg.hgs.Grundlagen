package C1_Schleifen;

import java.util.Scanner;

public class SchleifeWhile {
    
    public static void main(String[] args) {
             
        String passwort;
        Scanner s = new Scanner(System.in);
        
        do {
          System.out.println("Passwort:");
          passwort = s.next();
        } while (!passwort.equals("12xz57f"));
        
        System.out.println("Passwort akzeptiert.");
      
    }

}
