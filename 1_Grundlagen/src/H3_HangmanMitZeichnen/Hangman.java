package H3_HangmanMitZeichnen;

import java.util.Scanner;

public class Hangman {

	// Varriablen initialisieren
	int anzahl = 0;
	int aktuelleStufe = 0;
	String token="";
	String aktWort="";
	String wortliste[] = { "windsurfen", "sandmann", "mauseloch",
			"sprintrennen", "weihnachtsmann", "feierabend", "schule", "hirsch",
			"looser", "heino" };

	// gefundener Buchstabe = 1, offener Buchstabe = 0
	int[] zustand;

	//Assoziation
	Anzeige dieAnzeige;

	//Konstruktor
	public Hangman(Anzeige anzeige) {
		dieAnzeige = anzeige;
	}
	
	//Gib zufaellig ein Wort aus der Liste
	private String gibWort() {
		return wortliste[gibIndex(wortliste.length)];
	}

	//Bilde einen zufaelligen Index von 0-anzahl
	private int gibIndex(int anzahl) {
		int zufallszahl = (int) (Math.random() * anzahl);
		return zufallszahl;
	}

	
	public void neustart() {
		anzahl = 0;
		aktuelleStufe = 0;
		aktWort = gibWort();
		zustand = new int[aktWort.length()];
		dieAnzeige.zeigeToken(bildeToken(aktWort, zustand), anzahl);
	}

	//Erzeuge den Token fuer die Ausgabe 	
	private String bildeToken(String aktWort, int[] zustand) {
		token = "";
		for (int i = 0; i < zustand.length; i++) {
			if (zustand[i] == 0) {
				token = token + "_ ";
			} else {
				token = token + aktWort.charAt(i) + " ";
			}

		}

		return token;
	}

	//Prueft den eingegebenen Text und zeigt das Ergebnis an
	public void pruefeEingabe(String eingabe) {
		String token="";
		if (aktWort != "") {
			//System.out.println("eingegeben: " + eingabe);
			//System.out.println("Akt Wort: " + aktWort);

			zustand = setzeZustand(aktWort,zustand, eingabe);
			
			if(!pruefeZustand()&& aktuelleStufe < MeinPanel.MAX_STUFE){
				token = bildeToken(aktWort, zustand);
				
			}
			else if(aktuelleStufe == MeinPanel.MAX_STUFE){
				token = "VERLOREN";
				dieAnzeige.erzwingeNeustart();
			}
			else{
				token = "GEWONNEN";
				dieAnzeige.erzwingeNeustart();
			}
			
			
		}
		System.out.println(token);
		dieAnzeige.zeigeToken(token,anzahl);
	}

	private boolean pruefeZustand() {
		boolean hatGewonnen=true;
		for (int i = 0; i < zustand.length; i++) {
			if(zustand[i]==0){
				hatGewonnen = false;
			}
		}
		return hatGewonnen;
	}

	/**	Setzt fuer jeden richtigen Buchstaben eine 1
		und fuer jeden falschen eine 0
		Wurde das ganze Wort richtig eingegeben, wird
		fuer jeden Buchstaben eine 1 gesetzt.
		Zaehlt dabei die Anzahl der Versuche mit.
		Ueberprueft ob sich der Zustand veraendert oder nicht.
		Aendert sich der Zustand nicht, wird die Stufe um 1 erhoeht.
	**/
	private int[] setzeZustand(String aktWort, int[] zustand, String eingabe) {
		boolean zustandChanged=false;
		
		anzahl++;
		// Wenn das eingegebene Wort stimmt
		if (aktWort.equals(eingabe)) {
			for (int i = 0; i < zustand.length; i++) {
				zustand[i] = 1;
				zustandChanged = true;
			}
		}

		// Wenn nur ein Zeichen eingegeben wurde und das Zeichen noch
		//nicht vorhanden ist
		char ersterBuchstabe = eingabe.charAt(0);
		char[] zeichen = aktWort.toCharArray();

		for (int i = 0; i < zustand.length; i++) {
			if (zeichen[i] == ersterBuchstabe && !token.contains(""+ersterBuchstabe)) {
				zustand[i] = 1;
				zustandChanged = true;
				
			}
		}
		
		//Wenn kein richtiger Buchstabe eingegeben wurde
		if(!zustandChanged){
			erhoeheStufe();
		}
		
		dieAnzeige.zeigeBuchstabe(ersterBuchstabe); 
		
		return zustand;

	}
	
	private void erhoeheStufe(){
		aktuelleStufe++;
		dieAnzeige.erhoeheStufe();
	}

}