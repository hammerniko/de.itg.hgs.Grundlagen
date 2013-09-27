package Eingabe;

import java.util.Scanner;

public class Eingabe {

    // Hauptprogramm
    public static void main(String[] args) {

        // Eingabe
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Bitte Fallzeit eingeben: ");
        double t = sc.nextDouble();
        
        //Verarbeitung
        double s = 0.5 * 9.81 * t * t;
        
        
        //Ausgabe
        System.out.println("Höhe der Brücke: "+s);
        
        
        
    }

}
