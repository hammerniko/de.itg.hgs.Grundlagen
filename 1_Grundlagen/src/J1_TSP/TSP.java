package J1_TSP;

/**
 * Das Programm berechnet nach dem Travel Salesman Problem - Algorithmus ein
 * Array mit den Daten(Entfernung) von 5 Orten (Knoten)
 * 
 * @author Nikolai Hammer
 * 
 */
public class TSP {

	static String[] buchstaben = { "A", "B", "C", "D", "E" };
	static final int ANZAHL = 5;
	static final int DASH = 999;
	static boolean debug = true;
	static int[][] matrix = new int[ANZAHL][ANZAHL];
	static int[][] matrixCopy = new int[ANZAHL][ANZAHL];
	static int[][] penalties = new int[ANZAHL][ANZAHL];
	static int min;
	static String loesung = "";
	static int distanz = 0;

	public static void main(String[] args) {
		// Eingabe Init
		setMatrix();
		matrixCopy = arrayCopy(matrix);
		ausgabeArray(matrix);

		
		
		// ********************************** TSP Algorithmus
		for (int i = 0; i < ANZAHL; i++) {

			// Minimieren
			minimiereAlleReihen();
			minimiereAlleSpalten();

			// Kalkulieren
			kalkulierePenalties();

			// Reduzieren der Matrix
			reduziereMatrix();
		}

		System.out.println("Distanz:" + distanz);
		System.out.println("Loesung:" + loesung);

	}

	/**
	 * Kopiert ein Array Wert fuer Wert und gibt die Kopie zurueck
	 * 
	 * @param array
	 * @return
	 */
	private static int[][] arrayCopy(int[][] array) {

		int[][] copiedArray = new int[array.length][array[0].length];
		for (int reihe = 0; reihe < array.length; reihe++) {
			for (int spalte = 0; spalte < array[0].length; spalte++) {
				copiedArray[reihe][spalte] = array[reihe][spalte];
			}
		}
		return copiedArray;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Wenn eine maximale Penalty gefunden wurde wird die Matrix an dieser
	 * Stelle reduziert, indem diese Reihe und Spalte geloescht wird.
	 * Gleichzeitig ist dies eine gefundene Beziehung zwischen 2 Knoten
	 */
	private static void reduziereMatrix() {

		// Initialisiere Maximalen Penaltywert
		int max = 0;

		// Initialisiere Merker fuer Zeile und Spalte des max. Penalty-Werts
		int colMaxPanelty = -1;
		int rowMaxPanelty = -1;

		// finde max Penalty. Bei gleichem Wert wird das zuerst gefundene
		// Maximum genommen
		for (int reihe = 0; reihe < penalties.length; reihe++) {
			for (int spalte = 0; spalte < penalties.length; spalte++) {
				if (penalties[reihe][spalte] > max) {

					// maximaler Penaltywert wird gespeichert
					// sobald ein groesserer Wert gefunden wurde
					max = penalties[reihe][spalte];

					// Zeile und Spalte mit max-Penalty merken
					colMaxPanelty = spalte;
					rowMaxPanelty = reihe;
				}
			}
		}

		// Die gefundenen Max-Werte stellen eine Loesung dar
		// in der Form von Reihe nach Spalte (Festlegung)
		addLoesung(colMaxPanelty, rowMaxPanelty);

		// Die Distanz der gefundenen Loesung wird
		// in der Variablen distance aufaddiert.
		addDistance(colMaxPanelty, rowMaxPanelty);

		// Streiche gefundene Loesung durch setzen von
		// unendlich Werten in der gesamten Zeile und Spalte (DASH=999)
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][colMaxPanelty] = DASH;
			matrix[rowMaxPanelty][i] = DASH;
		}

		// Setze unendlich Wert auf den Rueckweg (reihe und spalte vertauscht)
		// der gefundenen Loesung, da ein Ort nur einmal
		// besucht werden darf
		matrix[colMaxPanelty][rowMaxPanelty] = DASH;

	}

	/**
	 * Addiert die Distanz zu einer bereits ermittelten Distanz in der Variablen
	 * distanz.
	 * 
	 * @param colMaxPanelty
	 * @param rowMaxPanelty
	 */
	private static void addDistance(int colMaxPanelty, int rowMaxPanelty) {
		distanz = distanz + matrixCopy[rowMaxPanelty][colMaxPanelty];

	}

	/**
	 * Fuegt einen String hinzu welcher eine Teilloesung darstellt.
	 * 
	 * @param colMaxPanelty
	 * @param rowMaxPanelty
	 */
	private static void addLoesung(int colMaxPanelty, int rowMaxPanelty) {

		loesung = loesung + buchstaben[rowMaxPanelty] + "->"
				+ buchstaben[colMaxPanelty] + " ";
		trace("Loesung:" + loesung);
	}

	/**
	 * initialisiert und berechnet die Penalties aller Nullen der minimierten
	 * Matrix und speichert das Ergebnis im Array penalties[][]
	 */
	private static void kalkulierePenalties() {
		initPenalties();
		kalkulierePenaltyReihen();
		kalkulierePenaltySpalten();
	}

	/**
	 * berechnet die Penalties der Spalten
	 */
	private static void kalkulierePenaltySpalten() {
		// Merker
		int min1;
		int reiheMitMin1;
		int min2;

		for (int spalte = 0; spalte < matrix.length; spalte++) {

			// Merker fuer jede Reihe neu initialisieren
			min1 = DASH;
			reiheMitMin1 = -1;
			min2 = DASH;

			// Pruefe reihe
			// Suche erstes Minimum und merke die Stelle und Wert
			for (int reihe = 0; reihe < matrix.length; reihe++) {
				if (matrix[reihe][spalte] < min1) {
					min1 = matrix[reihe][spalte];
					reiheMitMin1 = reihe;
				}
			}

			// Suche zweites Minimum und merke die Stelle und Wert
			for (int reihe = 0; reihe < matrix.length; reihe++) {
				if (matrix[reihe][spalte] < min2 && reihe != reiheMitMin1) {
					min2 = matrix[reihe][spalte];
				}
			}

			// Siehe kalkulierePenaltyReihen
			if (min1 == 0) {
				// Die stelle mit der Null erhÃ¤lt Penalty des 2.ten Minimums
				penalties[reiheMitMin1][spalte] = penalties[reiheMitMin1][spalte]
						+ min2;
			}
		}
	}

	/**
	 * berechnet die Penalties der Reihen
	 */
	private static void kalkulierePenaltyReihen() {
		// Merker
		int min1;
		int spalteMitMin1;
		int min2;

		for (int reihe = 0; reihe < matrix.length; reihe++) {

			// Merker fuer jede Reihe neu initialisieren
			min1 = DASH;
			spalteMitMin1 = -1;
			min2 = DASH;

			// Pruefe reihe
			// Suche erstes Minimum und merke die Stelle und Wert
			for (int spalte = 0; spalte < matrix.length; spalte++) {
				if (matrix[reihe][spalte] < min1) {
					min1 = matrix[reihe][spalte];
					spalteMitMin1 = spalte;
				}
			}

			// Suche zweites Minimum und merke die Stelle und Wert
			for (int spalte = 0; spalte < matrix.length; spalte++) {
				if (matrix[reihe][spalte] < min2 && spalte != spalteMitMin1) {
					min2 = matrix[reihe][spalte];

				}
			}

			// Nach dem minimieren ist immer mindestens eine 0 in einer Reihe.
			// Sind mehrere Nullen in einer Reihe ist die Penalty fuer alle
			// Nullen
			// dieser Reihe immer gleich 0.
			// d.h. die Pruefung muss nur durchgefuehrt werden,
			// wenn es nur eine 0 je Reihe gibt.
			// Das zweite gefundene Minimum der Reihe ergibt die Penalty dieser
			// Reihe.
			if (min1 == 0) {
				// Die stelle mit der Null erhaelt Penalty des 2.ten Minimums
				penalties[reihe][spalteMitMin1] = min2;

			}
		}
	}

	/**
	 * minimiert alle Reihen
	 */
	private static void minimiereAlleReihen() {
		trace("-Alle Reihen minimiert");
		for (int i = 0; i < 5; i++) {
			minimiereReihe(i);
		}
	}

	/**
	 * minimiert alle Spalten
	 */
	private static void minimiereAlleSpalten() {
		trace("-Alle Spalten minimiert");
		for (int j = 0; j < 5; j++) {
			minimiereSpalte(j);
		}
	}

	/**
	 * Sucht in der reihe das minimum und zieht von allen anderen Werten der
	 * reihe dieses Minimum ab. Dashes werden ignoriert.
	 * 
	 * @param reihe
	 */
	private static void minimiereReihe(int reihe) {
		
		min = getMinOfRow(reihe);

		for (int j = 0; j < matrix.length; j++) {
			if (matrix[j][reihe] != DASH) {
				matrix[j][reihe] = matrix[j][reihe] - min;
			}
		}
	}

	/**
	 * gibt das  Minimum einer Reihe zurueck
	 * 
	 * @param reihe
	 * @return
	 */
	private static int getMinOfRow(int reihe) {
		//Initialisierung mit einem möglichst großen Wert
		min = Integer.MAX_VALUE;
		
		//Durchsuche alle Werte einer Reihe 
		//bnach dem miniminalen Wert
		for (int j = 0; j < matrix.length; j++) {
			if (matrix[j][reihe] < min) {
				min = matrix[j][reihe];
			}
		}
		return min;
	}

	
	
	
	
	/**
	 * Sucht das Minimum einer Spalte und zieht von allen anderen Werten der
	 * Spalte dieses Minimum ab. Dashes werden ignoriert.
	 * 
	 * @param spalte
	 */
	private static void minimiereSpalte(int spalte) {
		

		min = getMinOfCol(spalte);

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[spalte][i] != DASH) {
				matrix[spalte][i] = matrix[spalte][i] - min;
			}
		}
	}

	/**
	 * Gibt den Index der Spalte mit dem Minimum zurueck.
	 * 
	 * @param spalte
	 * @return
	 */
	private static int getMinOfCol(int spalte) {
		min = DASH;
		
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[spalte][i] < min) {
				min = matrix[spalte][i];
				
			}
		}
		return min;
	}

	/**
	 * Setzt alle Penaltywert auf 0
	 */
	private static void initPenalties() {
		for (int i = 0; i < penalties.length; i++) {
			for (int j = 0; j < penalties.length; j++) {
				penalties[i][j] = 0;
			}
		}
	}

	/**
	 * Gibt ein Array mit zugehoerigen Knotenbeschriftung auf der Konsole aus.
	 * 
	 * @param array
	 */
	private static void ausgabeArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print("\t" + buchstaben[i]);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println();
			System.out.print(buchstaben[i] + " ");
			for (int j = 0; j < array.length; j++) {

				if (array[j][i] == DASH) {
					System.out.print("\t-");
				} else {
					System.out.print("\t" + array[j][i]);
				}
			}
		}
		System.out.println("\n------------------------------------------");
	}

	
	
	/**
	 * Setzt eine Beispielmatrix. Die Anzahld er Zeilen und Spalten muss mit der
	 * Konstanten ANZAHL uebereinstimmen
	 */
	public static void setMatrix() {
		// 1.Reihe
		matrix[0][0] = DASH;
		matrix[1][0] = 3;
		matrix[2][0] = 4;
		matrix[3][0] = 2;
		matrix[4][0] = 8;

		// 2.Reihe
		matrix[0][1] = 3;
		matrix[1][1] = DASH;
		matrix[2][1] = 3;
		matrix[3][1] = 5;
		matrix[4][1] = 7;

		// 3.Reihe
		matrix[0][2] = 4;
		matrix[1][2] = 3;
		matrix[2][2] = DASH;
		matrix[3][2] = 1;
		matrix[4][2] = 6;

		// 4.Reihe
		matrix[0][3] = 2;
		matrix[1][3] = 5;
		matrix[2][3] = 1;
		matrix[3][3] = DASH;
		matrix[4][3] = 1;

		// 5.Reihe
		matrix[0][4] = 8;
		matrix[1][4] = 7;
		matrix[2][4] = 6;
		matrix[3][4] = 1;
		matrix[4][4] = DASH;
	}

	public static void trace(String meldung) {
		if (debug) {
			System.out.println(meldung);
		}
	}

}
