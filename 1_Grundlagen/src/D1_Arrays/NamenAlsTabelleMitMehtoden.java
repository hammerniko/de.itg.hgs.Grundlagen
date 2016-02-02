package D1_Arrays;

public class NamenAlsTabelleMitMehtoden {

	// Konstanten als Arraygrenzen sind uebersichtlich
	public static final int ZEILEN = 5;
	public static final int SPALTEN = 2;

	public static void main(String[] args) {
		String[][] tg113 = intialize();

		ausgabe(tg113);

	}// end main

	private static String[][] intialize() {
		// Array Deklarieren String[<zeilen>][<spalten>]
		String[][] namen = new String[ZEILEN][SPALTEN];

		// Array initialisieren
		// Zeile 0
		namen[0][0] = "Hammer"; // Spalte 0
		namen[0][1] = "Nikolai";// Spalte 1

		// Zeile 1
		namen[1][0] = "Meier"; // Spalte 0
		namen[1][1] = "Niko"; // Spalte 1

		// Zeile 2
		namen[2][0] = "Mueller";// Spalte 0
		namen[2][1] = "Tom"; // Spalte 1

		// Zeile 3
		namen[3][0] = "Philip"; // Spalte 0
		namen[3][1] = "Dragan"; // Spalte 1

		// Zeile 4
		namen[4][0] = "Balboa"; // Spalte 0
		namen[4][1] = "Rocky"; // Spalte 1

		return namen;
	}

	private static void ausgabe(String[][] array) {
		// Ausgabe des zweidimensionalen Arrays
		for (int zeile = 0; zeile < ZEILEN; zeile++) {
			for (int s = 0; s < SPALTEN; s++) {
				System.out.print(array[zeile][s] + "\t");
			}
			System.out.println();
		}
	}

}// end class
