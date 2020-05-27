package E1_Methoden;

public class BeispieleMethoden {

	// Hauptmethode
	public static void main(String[] args) {

		double summe = berecheneSumme(5, 6);
		System.out.println(summe);
		
		double differenz = berechneDifferenz(10,4);
		System.out.println(differenz);
		

	}

	
	
	
	public static double berechneDifferenz(double zahl1, double zahl2) {
		//eingabe
		double ergebnis;
		
		//verarbeitung
		ergebnis = zahl1 - zahl2;
		
		//Rueckgabe
		return ergebnis;
	}
	
	public static int berechneDifferenz(int zahl1, int zahl2) {
		//eingabe
		int ergebnis;
		
		//verarbeitung
		ergebnis = zahl1 - zahl2;
		
		//Rueckgabe
		return ergebnis;
	}





	// 1. Einfache Methode zum Zeichnen einer Linie
	public static void zeichneLinie() {
		System.out.println("------");
	}

	// 2. Überladen Methode mit Uebergabeparameter zum Zeichnen einer Linie
	public static void zeichneLinie(String pZeichen) {
		for (int i = 0; i < 5; i++) {
			System.out.print(pZeichen);
		}
		System.out.println();
		

	}

	// 3. Ueberladene Methode mit Uebergabeparameter zum Zeichnen einer Linie
	public static void zeichneLinie(int anzahl) {
		for (int i = 0; i < anzahl; i++) {
			System.out.print("-");
		}
		System.out.println();

	}

	// 4. Weitere Ueberladene Methode mit Uebergabeparameter zum Zeichnen einer Linie
	public static void zeichneLinie(String zeichen, int anzahl) {
		for (int i = 0; i < anzahl; i++) {
			System.out.print(zeichen);
		}
		System.out.println();

	}

	// 5. Methode mit Rückgabewert
	public static double berecheneSumme(double zahl1, double zahl2) {
		// eingabe
		double ergebnis;

		// verarbeitung
		ergebnis = zahl1 + zahl2;

		// Rueckgabe
		return ergebnis;

	}

	// Methode mit Rückgabewert
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
			returnStr = "Ungenuegend";
		} else {
			returnStr = "ungueltiger Notenwert";
		}

		// Rueckgabe
		return returnStr;
	}

	// Methode mit Rueckgabewert und Uebergabeparameter fuer BMI
	public static double getBmi(double pMasseInKg, double pGroesseInMeter) {

		// Verarbeitung
		double bmi = pMasseInKg / (pGroesseInMeter * pGroesseInMeter);

		// Rueckgabe
		return bmi;
	}

}
