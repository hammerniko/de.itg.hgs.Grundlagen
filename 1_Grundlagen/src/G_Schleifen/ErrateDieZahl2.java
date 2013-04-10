package G_Schleifen;
/**
 * In diesem Spiel wird zu Beginn zufällig eine Zahl zwischen
 * 1 und 100 gezogen.
 * Dannach wird der Spieler aufgefordert eine Zahl einzugeben.
 * Je nachdem wie nah die geratene Zahl beim Ergebnis
 * liegt, sollen die Meldungen "heiß","lauwarm" und "kalt"
 * ausgegeben werden.
 * Die Anzahl der Versuche wird mitgezählt und ausgegeben,
 * wenn die Zahl erraten wurde.
 */

import java.util.Scanner;

public class ErrateDieZahl2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int eingabeZahl;
        int anzahlVersuche=0;
        String meldung;
        int zufallsZahl;
        
        zufallsZahl = (int) (Math.random()*100+1);

        do {
            System.out.println("Zahl zw. 1-100:");
            eingabeZahl=s.nextInt();
            anzahlVersuche++;
            if (eingabeZahl<=zufallsZahl) {
                if (eingabeZahl==zufallsZahl) {
                    meldung = "Sie haben gewonnen";
                    break;
                } else {
                    meldung = "Zahl ist zu klein";
                }
            } else {
                meldung = "Zahl ist zu groß";
            }
            System.out.println(meldung);
            
        } while (eingabeZahl!=zufallsZahl);
        
        System.out.println(meldung);
        System.out.println("Sie hatten "+anzahlVersuche+" Versuche");
    }

}
