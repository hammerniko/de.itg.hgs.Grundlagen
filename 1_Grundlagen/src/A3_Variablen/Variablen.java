package A3_Variablen;

import D1_Arrays.KartenMischen;

/**
 * Die Hoehe einer Brücke soll berechnet werden.
 * Zeit wird gemessen.
 * g=9.81 m/s^2
 * 
 * s = 0.5 * g * t^2
 * @author hr
 *
 */
public class Variablen {

	//Hauptprogramm, Einstiegspunkt
	public static void main(String[] args) {
		
		//Eingabe
		double erdfallbeschleunigung = 9.81;
		double zeit = 1.5;
		double strecke;
		String meldung ="Die hoehe der Brücke ist:"; 
		
		//Verarbeitung
		strecke = 0.5 * erdfallbeschleunigung * zeit * zeit;
		meldung = meldung+strecke;
				
		
		//Ausgabe
		System.out.println(meldung);
		
	}

}
