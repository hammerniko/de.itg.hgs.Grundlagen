package G_Schleifen;

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
                meldung = "Zahl ist zu gro§";
            }
            System.out.println(meldung);
            
        } while (eingabeZahl!=zufallsZahl);
        
        System.out.println(meldung);
        System.out.println("Sie hatten "+anzahlVersuche+" Versuche");
    }

}
