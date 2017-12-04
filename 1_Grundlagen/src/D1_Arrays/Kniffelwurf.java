package D1_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//Jeder Spieler hat 3 Wuerfe
//Nach einem Wurf kann der Spieler 0-5 Wuerfel ziehen
//Mit den restlichen Wuerfeln darf er weiterwuerfeln
//Mit 'a' werden alle Wuerfel gezogen und ausgewertet
//Mit 'k' wird kein Wuerfel gezogen und mit allen Wuerfeln weitergewuerfelt
//Mit 1..6 werden 1er, 2er...,6er gezogen 
//Das ziehen wird beendet mit 'w'

public class Kniffelwurf {

	public static final int ANZAHL_WUERFE = 3;
	public static final int ANZAHL_WUERFEL = 5;
	public static final String REGEX_NUMBERS_ONLY = "[0-9]";
	public static final String[] MELDUNGEN = {
			"alle Wuerfel gezogen",
			"kein Wuerfel gezogen",
			"schreibe",
			"gewählt:",
			"Falsche eingabe"};
	
	public static final String EINGABETEXT = "Ihre Wahl: a-> alle, k->kein, 1..6->Wuerfel, w->schreiben:";
	
	public static void main(String[] args) {
		ArrayList gezogen = new ArrayList();
		ArrayList wuerfel = new ArrayList();
		String wahl;
		String meldung;
		Scanner s = new Scanner(System.in);

		//Wuerfeln
		wuerfeln(gezogen, wuerfel);
		
		//Wählen
		meldung = waehlen(wuerfel, s, gezogen);
		
		//Nach 3 Wuefen schreiben
		System.out.print("gewürfelt: ");
		ausgabeWuerfel(wuerfel);
		System.out.println();
		
		System.out.print("gezogen: ");
		ausgabeWuerfel(gezogen);
		System.out.println();
		
		System.out.println(meldung);
	}

	public static String waehlen(ArrayList wuerfel, Scanner s, ArrayList gezogen) {
		String wahl;
		String meldung;
		System.out.println(EINGABETEXT);
		wahl = s.next();
		meldung = pruefeWahl(wuerfel, wahl, gezogen);
		return meldung;
	}

	public static void wuerfeln(ArrayList gezogen, ArrayList wuerfel) {
		for (int j = 0; j < ANZAHL_WUERFEL-gezogen.size(); j++) {
			wuerfel.add(gibWuerfelZahl());
		}
		ausgabeWuerfel(wuerfel);
	}

	public static String pruefeWahl(ArrayList wuerfel, String wahl, ArrayList gezogen) {
		String meldung;
		if(wahl.equals("a")){
			meldung = MELDUNGEN[0];
			gezogen.addAll(wuerfel);
			wuerfel.clear();
			
		}
		else if(wahl.equals("k")){
			meldung = MELDUNGEN[1];
		}
		else if(wahl.equals("w")){
			meldung = MELDUNGEN[2];
		}
		else if(wahl.matches(REGEX_NUMBERS_ONLY)&&wuerfel.contains(Integer.parseInt(wahl))){
			meldung = MELDUNGEN[3]+wahl;
			int anz = wuerfel.size();
			for (int i = 0; i < wuerfel.size(); i++) {
				if((int) wuerfel.get(i)==Integer.parseInt(wahl)){
					wuerfel.remove(i);
					gezogen.add(wahl);
				}
			}
			
			
		}
		else {
			meldung = MELDUNGEN[4];
		}
		return meldung;
	}

	public static int gibWuerfelZahl() {
		return (int) (Math.random() * 6 + 1);
	}

	public static int[] gibWurf(int[] w) {

		for (int i = 0; i < w.length; i++) {
			w[i] = gibWuerfelZahl();
		}
		Arrays.sort(w);

		return w;
	}

	public static void ausgabeWuerfel(ArrayList w) {
		for (int i = 1; i <= w.size(); i++) {
			System.out.print("|" + w.get(i - 1) + "| ");
		}
		System.out.println();
	}

}
