package A5_Eingabe;

import java.util.Scanner;

public class ErsteEingabe {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Grš§e:");
        int groesse = s.nextInt();
        System.out.println("Sie sind "+groesse+" cm gro§");
        
        System.out.println("Gewicht:");
        double gewicht = s.nextDouble();
        System.out.println("Sie wiegen "+gewicht+"kg");
        
        System.out.println("Name:");
        String name = s.next();
        System.out.println("Ihr Name ist "+name);
        
        
        

    }

}
