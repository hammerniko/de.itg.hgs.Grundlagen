package E1_Methoden;

public class Suchen {

	public static void main(String[] args) {

		// Beispiel Array
		int[] z = { 5, 1, -4, 1, 1, 1 };

		// Finde das minimum von z
		int min = getMinimum(z);

		// Finde das Maximum von z
		int max = getMaximum(z);

		// Ermittle den Durchschnitt von z
		double avg = getAvg(z);

		// ermittle die position des Wertes w in z
		int wert = 5;
		int index = getIndexOf(wert, z);
		
		//***************************************************************
		// TODO Für ganz Schnelle ... Ermittle die absolute Häufigkeit des Wertes x
		int wert1 = 1;
		int anz = getFrequnecy(wert1, z);
		
		
		// TODO Für Nerds ... Sortiere das Array

		// Gib das Ergebnis jeder Methode aus
		System.out.println("Minimum:\t" + min);
		System.out.println("Maximum:\t" + max);
		System.out.println("Average:\t" + avg);
		System.out.println("index von " + wert + ":\t" + index);
		System.out.println("Anzahl von " + wert1 + ":\t" + anz);

	}
	
	public static int getFrequnecy(int wert, int[] z) {
		int anzahl=0;
		for (int i = 0; i < z.length; i++) {
			if(z[i]==wert) {
				anzahl++;
			}
		}
		
		return anzahl;
	}
	
	
	

	private static int getIndexOf(int pWert, int[] z) {
		for (int j = 0; j < z.length; j++) {
			if (z[j] == pWert) {
				return j;
			}
		}
		return -1;
	}

	
	
	
	
	private static double getAvg(int[] z) {
		double sum = 0;
		for (int i = 0; i < z.length; i++) {
			sum  += sum + z[i];
		}
		return sum/z.length;
	}

	
	
	
	
	
	
	
	
	
	
	
	private static int getMaximum(int[] pZahlen) {
		// Ersten Wert speichern
		int maxFound = pZahlen[0];

		for (int i = 1; i <= pZahlen.length - 1; i++) {
			if (pZahlen[i] > maxFound) {
				maxFound = pZahlen[i];
			}
		}

		return maxFound;
	}

	public static int getMinimum(int[] pZahlen) {
		// Ersten Wert speichern
		int minFound = pZahlen[0];

		for (int i = 1; i < pZahlen.length; i = i + 1) {
			if (pZahlen[i] < minFound) {
				minFound = pZahlen[i];
			}
		}

		return minFound;

	}

}
