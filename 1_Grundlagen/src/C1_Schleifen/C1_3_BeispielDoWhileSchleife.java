package C1_Schleifen;

import java.util.Scanner;

public class C1_3_BeispielDoWhileSchleife {

    public static void main(String[] args) {

    	  	
    	
    	
        String passwort, benutzer;
        Scanner s = new Scanner(System.in);
        boolean loginKorrekt = false;

        
        
        /** Fussgetseuerte while Schleife
        /*  Wird verwendet wenn die Anzahl Wiederholungen nicht bekannt ist
         *  und die Schleife mindesten einmal durchlaufen werden soll.
         *  Abbruchbedingung: loginKorrekt enthält nicht den boolschen Wert 'true'
         *  Solange die Abbruchbedingung wahr ergibt, wird wiederholt.
         *  
         */
        do {
            System.out.println("Benutzername:");
            benutzer = s.next();

            System.out.println("Passwort:");
            passwort = s.next();

        } while (!benutzer.equals("gast") || !passwort.equals("hgs"));

        System.out.println("Anmeldung akzeptiert");

    }

}
