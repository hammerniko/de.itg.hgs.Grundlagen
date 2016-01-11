package C1_Schleifen;

import java.util.Scanner;
/** 
 *  Kopfgetseuerte while Schleife
 *  Wird verwendet wenn die Anzahl Wiederholungen nicht bekannt ist.
 *  Abbruchbedingung: a!=-4
 *  Solange die Abbruchbedingung wahr ergibt, wird wiederholt.
 *  Ist die Abbruchbedingung von Beginn an flasch, wird
 *  die Schleife komplett Ÿbersprungen.
 */
public class BeispielWhileSchleife {

    public static void main(String[] args) {

       
       /* int a = -4;
        
        while (a != -4) {
            a = a / 8 + 1 - 5;
            System.out.println(a);
        }*/

        // Fussgesteuerte Schleife
        // Anzahl der Wiederholungen ist mindestens 1
        String passwort, benutzer;
        Scanner s = new Scanner(System.in);
        boolean loginKorrekt = false;

        do {
            System.out.println("Benutzername:");
            benutzer = s.next();

            System.out.println("Passwort:");
            passwort = s.next();

            if (benutzer.equals("gast") && passwort.equals("hgs")) {
                loginKorrekt = true;
            } else {
                loginKorrekt = false;
            }

        } while (!loginKorrekt);

        System.out.println("Passwort akzeptiert");

    }

}
