package G3_UebungenAusDemBuchS120;

public class S120A1Mit_Methoden {

	public static void main(String[] args) {
		// ----------------EINGABE
		// Konstanten aus Wrapperklassen
		int min;
		int max;
		double mittelwert;
		int summe;

		// Zahlenfeld (array) durchsuchen
		int zahlen[] = { 10, 2, 3, 4, 5, 9 };

		
		//VERARBEITUNG
		min = gibMin(zahlen);
		
		
		//AUSGABE
		System.out.println(min);
	}

	/**
	 * Gibt das Minimum eines Arrays zurück
	 * @param numbers
	 * @return minimum als int
	 */
	private static int gibMin(int[] numbers) {
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]<min){
				min = numbers[i];
			}
		}
		
		return min;
	}

}
