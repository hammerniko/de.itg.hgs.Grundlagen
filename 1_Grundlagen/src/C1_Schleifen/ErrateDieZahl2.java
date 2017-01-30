package C1_Schleifen;

import java.util.Scanner;

/**
 * In diesem Spiel wird zu Beginn zufaellig eine Zahl zwischen 1 und 100
 * gezogen. Dannach wird der Spieler aufgefordert eine Zahl einzugeben. Je
 * nachdem wie nah die geratene Zahl beim Ergebnis liegt, sollen die Meldungen
 * "zu klein" oder "zu gross" ausgegeben werden. Die Anzahl der Versuche wird
 * mitgezaehlt und am Ende ausgegeben, wenn die Zahl erraten wurde.
 */
public class ErrateDieZahl2 {

	public static void main(String[] args) {
		// EINGABE*********************************************
		Scanner s = new Scanner(System.in);
		int eingabeZahl;
		int anzahlVersuche = 0;
		String meldung = "";
		int zufallsZahl;

		// Ziehe eine Zufallszahl zwischen 1 und 100
		zufallsZahl = (int) (Math.random() * 100 + 1);

		// VERARBEITUNG*****************************************
		do {
			System.out.println("Zahl zw. 1-100:");
			eingabeZahl = s.nextInt();

			anzahlVersuche++;

			if (eingabeZahl < zufallsZahl) {
				meldung = "Zahl ist zu klein";
			}
			else if (eingabeZahl > zufallsZahl) {
				meldung = "Zahl ist zu gross";
			} else {
				meldung = "Sie haben gewonnen";
			}
			System.out.println(meldung);

		} while (eingabeZahl != zufallsZahl);

		// AUSGABE************************************************
		System.out.println(meldung);
		System.out.println("Sie hatten " + anzahlVersuche + " Versuche");

	}

}
