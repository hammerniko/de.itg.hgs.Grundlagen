package E1_Methoden;

public class MethodeRunden {
	public static void main(String[] args) {
		//Eingabe
		double zahl = 1.3547356865;
				
		//Verarbeitung
		zahl = runden(zahl,2);
		
		//Ausgabe
		System.out.println(zahl);
	}

	
	private static double runden(double pZahl, int pAnzahlStellen) {
				
		//Komma verschieben um Anzahl Stellen
		pZahl = pZahl * Math.pow(10, pAnzahlStellen);
		
		//letzte Dezimalstelle ab 0.5 aufrunden, sonst abrunden
		pZahl = pZahl + 0.5;
		
		//Nachkommateil abschneiden
		pZahl = (int) pZahl;
		
		//Komma zurückschieben
		pZahl = (double) pZahl / Math.pow(10, pAnzahlStellen);
		
		
		
		return pZahl;
	}

}
