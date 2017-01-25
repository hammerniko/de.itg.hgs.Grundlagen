package C1_Schleifen;

import java.util.Scanner;

/**
 * In diesem Spiel wird zu Beginn zufaellig eine Zahl zwischen 1 und 100
 * gezogen. Dannach wird der Spieler aufgefordert eine Zahl einzugeben. Je
 * nachdem wie nah die geratene Zahl beim Ergebnis liegt, sollen die Meldungen
 * "zu klein" oder "zu gross" ausgegeben werden. Die Anzahl der Versuche wird
 * mitgezaehlt und am Ende ausgegeben, wenn die Zahl erraten wurde.
 */
public class ErrateDieZahlMitHighscore {

	public static void main(String[] args) {
		// EINGABE*********************************************
		Scanner s = new Scanner(System.in);
		int eingabeZahl;
		int anzahlVersuche = 0;
		String meldung;
		int zufallsZahl;
		int highscore = 1000000;
		int diff = 0;
		int startzeit, endzeit=0;

		// Ziehe eine Zufallszahl zwischen 1 und 100
		zufallsZahl = (int) (Math.random() * 100 + 1);

		// VERARBEITUNG*****************************************
		do {
			startzeit = (int) System.currentTimeMillis();
			System.out.println("Zahl zw. 1-100:");
			eingabeZahl = s.nextInt();

			diff = Math.abs(eingabeZahl - zufallsZahl);
			highscore = highscore + (100 - diff * anzahlVersuche *(endzeit-startzeit) * 1000);

			anzahlVersuche++;
			
			if (eingabeZahl <= zufallsZahl) {
				if (eingabeZahl == zufallsZahl) {
					meldung = "Sie haben gewonnen";
					break;
				} else {
					meldung = "Zahl ist zu klein";
				}
			} else {
				meldung = "Zahl ist zu gross";
			}
			System.out.println("Highscore:" + highscore);
			System.out.println(meldung);
			endzeit = (int) System.currentTimeMillis();
			System.out.println("Zeit:"+(endzeit-startzeit)+"ms");
		} while (eingabeZahl != zufallsZahl);

		// AUSGABE************************************************
		System.out.println(meldung);
		System.out.println("Highscore:" + highscore);
		System.out.println("Sie hatten " + anzahlVersuche + " Versuche");
	}

}
