package H3_HangmanMitZeichnen;

import java.util.Scanner;

public class Hangman {

	// Varriablen initialisieren
	int anzahl = 0;
	String aktWort="";
	String wortliste[] = { "windsurfen", "sandmann", "mauseloch",
			"sprintrennen", "weihnachtsmann", "feierabend", "schule", "hirsch",
			"looser", "heino" };

	// gefundener Buchstabe = 1, offener Buchstabe = 0
	int[] zustand;

	Anzeige dieAnzeige;

	public Hangman(Anzeige anzeige) {
		dieAnzeige = anzeige;
	}

	private String gibWort() {
		return wortliste[gibIndex(wortliste.length)];
	}

	private int gibIndex(int anzahl) {
		int zufallszahl = (int) (Math.random() * anzahl);
		return zufallszahl;
	}

	public void neustart() {
		aktWort = gibWort();
		zustand = new int[aktWort.length()];
		dieAnzeige.zeigeToken(bildeToken(aktWort, zustand));
	}

	private String bildeToken(String aktWort, int[] zustand) {
		String token = "";
		for (int i = 0; i < zustand.length; i++) {
			if (zustand[i] == 0) {
				token = token + "_ ";
			} else {
				token = token + aktWort.charAt(i) + " ";
			}

		}

		return token;
	}

	public void pruefeEingabe(String eingabe) {
		if (aktWort != "") {
			System.out.println("eingegeben: " + eingabe);
			System.out.println("Akt Wort: " + aktWort);

			zustand = setzeZustand(aktWort, zustand, eingabe);
			String token = bildeToken(aktWort, zustand);
			System.out.println(token);
			dieAnzeige.erhoeheStufe();
			dieAnzeige.zeigeToken(token);
		}
	}

	private int[] setzeZustand(String aktWort, int[] zustand, String eingabe) {

		// Wenn das eingegebene Wort stimmt
		if (aktWort.equals(eingabe)) {
			for (int i = 0; i < zustand.length; i++) {
				zustand[i] = 1;

			}
		}

		// Wenn nur ein Zeichen eingegeben wurde
		char ersterBuchstabe = eingabe.charAt(0);
		char[] zeichen = aktWort.toCharArray();

		for (int i = 0; i < zustand.length; i++) {
			if (zeichen[i] == ersterBuchstabe) {
				zustand[i] = 1;

			}
		}

		return zustand;

	}

}