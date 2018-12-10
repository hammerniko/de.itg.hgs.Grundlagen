package E1_Methoden;



public class BeispieleMethoden {

	// Hauptmethode
	public static void main(String[] args) {

		
		

	}

	
	
	
	public static double berecheneSumme(double zahl1, double zahl2) {
		
		double ergebnis;
		
		ergebnis = zahl1 + zahl2;
		
		
		return ergebnis;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static String ermittleZeugnisNote(double kommaNote) {

		String returnStr = "";

		if (kommaNote < 1.5 && kommaNote >= 1) {
			returnStr = "Sehr Gut";
		} else if (kommaNote < 2.5 && kommaNote >= 1.5) {
			returnStr = "Gut";
		} else if (kommaNote < 3.5 && kommaNote >= 2.5) {
			returnStr = "Befriedigend";
		} else if (kommaNote < 4.5 && kommaNote >= 3.5) {
			returnStr = "Ausreichend";
		} else if (kommaNote < 5.5 && kommaNote >= 4.5) {
			returnStr = "Mangelhaft";
		} else if (kommaNote <= 6 && kommaNote >= 5.5) {
			returnStr = "Ungenügend";
		} else {
			returnStr = "ungültiger Notenwert";
		}

		// TODO Auto-generated method stub
		return returnStr;
	}

	// Methode zum Zeichnen einer Linie
	public static void zeichneLinie() {
		System.out.println("------");
	}

	// Überladene Methode mit Übergabeparameter zum Zeichnen einer Linie
	public static void zeichneLinie(String pZeichen) {
		for (int i = 0; i < 5; i++) {
			System.out.print(pZeichen);
		}
		System.out.println();

	}

	// Ünerladene Methode mit Übergabeparameter zum Zeichnen einer Linie
	public static void zeichneLinie(String zeichen, int anzahl) {
		for (int i = 0; i < anzahl; i++) {
			System.out.print(zeichen);
		}
		System.out.println();

	}

	// Methode mit Rückgabewert und Übergabeparameter für BMI
	public static double getBmi(double pMasseInKg, double pGroesseInMeter) {

		// Verarbeitung
		double bmi = pMasseInKg / (pGroesseInMeter * pGroesseInMeter);

		// Rückgabe
		return bmi;
	}

}
