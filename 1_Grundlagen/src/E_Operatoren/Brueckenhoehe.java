package E_Operatoren;

import java.util.Scanner;


public class Brueckenhoehe {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
        //Hauptprogramm
        double g = 9.81; //Erdbeschleunigung
        double strecke;
        
        //Eingabe
        System.out.print("Zeit:");
        double zeit = s.nextDouble();
                
        //Verarbeitung
        strecke = 0.5*g*zeit*zeit;
        
        //Ausgabe
        System.out.println("Die Höhe der Brücke:"+strecke);
        

    }

}
