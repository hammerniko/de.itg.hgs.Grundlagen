package E4_Backtracking_sudokumitGui;

import java.util.ArrayList;
import java.util.Random;

public class CreateSudoku {

	static int[][] s = { { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

	public static void main(String[] args) {

		//Fülle erste Reihe mit einer zufälligen Folge
		// von 1-9 -> Viele Varianten möglich
		initFirstRow();

		// Ausgangs Spielfeld anzeigen
		ausgabeSudoku();

		// Lösen
		solveSudoku();

		// Gelöstes Spielfeld anzeigen
		ausgabeSudoku();

		// Zufällig Felder Löschen
		deleteFields(50);

		// Ausgabe des Rätsels
		ausgabeSudoku();

	}

	private static void deleteFields(int anz) {

		// 81 Felder gibt es insgesamt
		// 17 Felder benötigt ein Sudoku mindestes
		if (anz <= (81 - 17) && anz >= 5) {

			// Lösche Zufällig Felder aus dem gelösten
			// Sudoku
			Random r = new Random();

			// Schweres Sudoku
			for (int i = 0; i < anz; i++) {
				int x, y;

				do {
					y = r.nextInt(9);
					x = r.nextInt(9);
				} while (s[y][x] == 0);

				s[y][x] = 0;
			}
		}
	}

	private static void initFirstRow() {
		ArrayList<Integer> zahlen = new ArrayList<Integer>();
		int zahl = 0;
		for (int i = 0; i < s.length; i++) {

			do {
				zahl = (int) (Math.random() * 9 + 1);
			} while (zahlen.contains(zahl));

			zahlen.add(i, zahl);

			// Zahl in Sudoku-Feld reinschreiben
			s[0][i] = zahl;

		}
		System.out.println("Ertse Reihe" + zahlen.toString());

	}

	private static boolean solveSudoku() {
		// Suche zufällig leeres Feld mit dem Wert 0

		for (int y = 0; y < s.length; y++) {
			for (int x = 0; x < s.length; x++) {
				if (s[y][x] == 0) {

					// Prüfe Zahl (alle Zahlen) an freier Stelle
					for (int zahl = 1; zahl <= 9; zahl++) {

						// Wenn TL funktioniert
						if (istZahlErlaubt(y, x, zahl)) {

							// Wähle TL
							s[y][x] = zahl;

							// Wenn Ziel erreicht
							if (solveSudoku()) {
								// Lösung gefunden
								return true;
							} else {

								// Setze Falsche Teillösung zurück
								s[y][x] = 0;
							}
						}
					}
					// Sackgasse
					return false;
				}
			}
		}
		// Wenn kein Freies Feld mehr vorhanden
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
				if (s[y][x] != 0) {
					System.out.print(" " + s[y][x] + " ");
				}
				else {
					System.out.print(" " + " " + " ");
				}
				
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
