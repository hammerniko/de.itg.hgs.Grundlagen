package G3_UebungenAusDemBuchS120;

public class S120A1 {

	public static void main(String[] args) {
		// ----------------EINGABE
		// Konstanten aus Wrapperklassen
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		double mittelwert = 0;
		int summe = 0;

		// Zahlenfeld (array) durchsuchen
		int zahlen[] = { 1, 2, 3, 4, 5, 1 };

		// --------------VERARBEITUNG
		for (int i = 0; i < zahlen.length; i++) {

			// min und max bestimmen
			if (zahlen[i] < min) {
				min = zahlen[i];
			} else {
				if (zahlen[i] > max) {
					max = zahlen[i];
				}
			}

			summe = summe + zahlen[i];

		}// ende for

		mittelwert =  (double) summe / zahlen.length;
		
		
		//-----------AUSGABE--
		System.out.println("minimum:"+min);
		System.out.println("maximum:"+max);
		System.out.println("summe:"+summe);
		System.out.println("mittelwert:"+mittelwert);
		
		

	}

}
