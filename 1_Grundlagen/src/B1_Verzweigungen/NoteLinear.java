package B1_Verzweigungen;

import java.util.Scanner;

public class NoteLinear {

    public static void main(String[] args) {

        // EINGABE
        Scanner s = new Scanner(System.in);
        double pErr, pMax, note;
        String meldung;

        System.out.print("Punkte maximal:\t");
        pMax = s.nextDouble();

        System.out.print("Punkte erreicht:\t");
        pErr = s.nextDouble();

        // VERARBEITUNG
        if (pMax > pErr && pMax > 0 && pErr >= 0) {
            note = -5 / pMax * pErr + 6;
            meldung = "Ihre Note: \t" + note;
        } else {
            meldung = "ungültige Eingabe";
        }

        // AUSGABE
        System.out.println(meldung);

    }

}
