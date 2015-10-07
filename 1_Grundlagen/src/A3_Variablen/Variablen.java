package A3_Variablen;

public class Variablen {

	public static void main(String[] args) {
		
		//***********************EINGABE
		//deklarieren und initialisiere
		//tastatureingabe
		//sensorwert o.ä.
		//F=m*a, 
		double kraft;
		double masse;
		double beschleunigung;
		String meldung;
		
		masse = 10.5;
		beschleunigung = 9.81;
		meldung = "Die größe der Kraft ist:";
		
		
		//Verarbeitung
		kraft = masse * beschleunigung;
		meldung = meldung +kraft;
		
		//Ausgabe
		System.out.println(meldung);
		System.out.println(meldung.length());
		
	}

}
