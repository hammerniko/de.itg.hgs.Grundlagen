package A3_Variablen;

public class VariablenBrueckenhoehe {

	public static void main(String[] args) {
		//Eingabe
		//s=1/2*a*t^2
		double strecke;
		double zeit=4;
		double beschleunigung=9.81;
		
		
		String meldung ="Die Höhe der Brücke ist:";
		
		//Verarbeitung
		strecke = 1.0/2.0 * beschleunigung * zeit * zeit;
		meldung = meldung + strecke;
		
		//Ausgabe
		System.out.println(meldung);

	}

}
