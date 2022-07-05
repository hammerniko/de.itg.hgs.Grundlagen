package E4_Backtracking_sudoku;

public class SolveSudoku {

	static int[][] s = { 
			{ 8, 0, 0, 0, 0, 0, 0, 0, 0 }, 
			{ 0, 0, 3, 6, 0, 0, 0, 0, 0 }, 
			{ 0, 7, 0, 0, 9, 0, 2, 0, 0 },
			{ 0, 5, 0, 0, 0, 7, 0, 0, 0 }, 
			{ 0, 0, 0, 0, 4, 5, 7, 0, 0 }, 
			{ 0, 0, 0, 1, 0, 0, 0, 3, 0 },
			{ 0, 0, 1, 0, 0, 0, 0, 6, 8 }, 
			{ 0, 0, 8, 5, 0, 0, 0, 1, 0 }, 
			{ 0, 9, 0, 0, 0, 0, 4, 0, 0 } };

	public static void main(String[] args) {

		// Spielfeld anzeigen
		ausgabeSudoku();

		// Lösen
		solveSudoku();

		// Spielfeld anzeigen
		ausgabeSudoku();

	}

	private static boolean solveSudoku() {
		//Suche leeres Feld mit dem Wert 0
		for (int y = 0; y < s.length; y++) {
			for (int x = 0; x < s.length; x++) {
				if (s[y][x] == 0) {
					
					//Prüfe Zahl (alle Zahlen) an freier Stelle
					for (int zahl = 1; zahl <= 9; zahl++) {
						
						//Wenn TL funktioniert
						if (istZahlErlaubt(y, x, zahl)) {

							//Wähle TL
							s[y][x] = zahl;

							//Wenn Ziel erreicht
							if (solveSudoku()) {
								//Lösung gefunden
								return true;
							} else {
								
								//Setze Falsche Teillösung zurück
								s[y][x] = 0;
							}
						}
					}
					//Sackgasse
					return false;
				}//Ende Prüfung freies feld
			}//Ende for x
		}//Ende for y
		//Wenn kein Freies Feld mehr vorhanden
		return true;
	}

	private static boolean istZahlErlaubt(int y, int x, int z) {

		if (pruefeReihe(y, z) && pruefeSpalte(x, z) && pruefeQuadrat(y, x, z)) {
			return true;
		}

		return false;
	}

	private static boolean pruefeQuadrat(int reihe, int spalte, int zahl) {
		int r = reihe - reihe % 3;
		int c = spalte - spalte % 3;

		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (s[i][j] == zahl) {
					return false;
				}
			}

		}
		return true;
	}

	
	
	
	
	
	
	
	private static boolean pruefeSpalte(int spalte, int zahl) {
		for (int j = 0; j < s.length; j++) {
			if (s[j][spalte] == zahl) {
				return false;
			}
		}
		return true;
	}

	private static boolean pruefeReihe(int reihe, int zahl) {
		for (int i = 0; i < s.length; i++) {
			if (s[reihe][i] == zahl) {
				return false;
			}
		}
		return true;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void ausgabeSudoku() {
		int wx = 0;
		// Erste Trennlinie
		augabeLinie();
		for (int y = 0; y < s.length; y++) {
			// Zeilenumbruch
			System.out.println();

			if (y == 3 || y == 6) {
				augabeLinie();
				System.out.println();
			}
			for (int x = 0; x < s.length; x++) {

				if (wx == 0 || wx == 3 || wx == 6) {
					System.out.print("|");
				}
				System.out.print(" " + s[y][x] + " ");
				wx++;
				if (wx >= 9) {
					System.out.print("|");
					wx = 0;
				}
			}
		}
		// letzte Linie
		System.out.println();
		augabeLinie();
		System.out.println();
	}

	private static void augabeLinie() {
		System.out.print("-------------------------------");
	}

}
