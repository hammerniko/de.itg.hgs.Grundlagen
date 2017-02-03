package TSPMitGUIundMVC;

import java.util.Observable;

/**
 * sendet setCahnged() und notifyObservers, wenn sich etwas ändert
 * 
 * @author nh
 *
 */
public class ModelTSP extends Observable {

	private String meldung="";
	private String[] buchstaben = {"A","B","C","D","E","F","G","H","I"};
 	private int anzahl;
	private final int DASH = 99999;
	private int[][] matrix;
	private int[][] matrixCopy;
	private int[][] penalties;
	private int min;
	private String loesung = "";
	private int distanz = 0;

	public  void berechneTSP() {
		init();

		// Eingabe Init
		matrixCopy = arrayCopy(matrix);

		// ********************************** TSP Algorithmus
		for (int i = 0; i < anzahl; i++) {

			// Minimieren
			minimiereAlleReihen();
			minimiereAlleSpalten();

			// Kalkulieren
			kalkulierePenalties();

			// Reduzieren der Matrix
			reduziereMatrix();
			
			meldung = "GefundeneLoesung:"+loesung;
			
			//Benachrichtige Observer
			setChanged();
			notifyObservers();

		}
	}

	public void init() {
		loesung = "";
		distanz = 0;
	}

	/**
	 * Kopiert ein Array Wert fuer Wert und gibt die Kopie zurueck
	 * 
	 * @param array
	 * @return
	 */
	private int[][] arrayCopy(int[][] array) {

		int[][] copiedArray = new int[array.length][array[0].length];
		for (int reihe = 0; reihe < array.length; reihe++) {
			for (int spalte = 0; spalte < array[0].length; spalte++) {
				copiedArray[reihe][spalte] = array[reihe][spalte];
			}
		}
		return copiedArray;
	}

	/**
	 * Wenn eine maximale Penalty gefunden wurde Wird die Matrix an dieser
	 * Stelle reduziert, indem diese Reihe und Spalte gelöscht wird.
	 * Gleichzeitig ist dies eine gefundene Beziehung zwischen 2 Knoten
	 */
	private void reduziereMatrix() {

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
	private void addDistance(int colMaxPanelty, int rowMaxPanelty) {
		distanz = distanz + matrixCopy[rowMaxPanelty][colMaxPanelty];

	}

	/**
	 * Fuegt einen String hinzu welcher eine Teilloesung darstellt.
	 * 
	 * @param colMaxPanelty
	 * @param rowMaxPanelty
	 */
	private void addLoesung(int colMaxPanelty, int rowMaxPanelty) {
		String nameKnotenVon = buchstaben[rowMaxPanelty];
		String nameKnotenNach = buchstaben[colMaxPanelty];

		loesung = loesung + nameKnotenVon + "->" + nameKnotenNach + " ";
		

	}

	/**
	 * initialisiert und berechnet die Penalties aller Nullen der minimierten
	 * Matrix und speichert das Ergebnis im Array penalties[][]
	 */
	private void kalkulierePenalties() {
		initPenalties();
		kalkulierePenaltyReihen();
		kalkulierePenaltySpalten();
	}

	/**
	 * berechnet die Penalties der Spalten
	 */
	private void kalkulierePenaltySpalten() {
		// Merker
		int min1;
		int reiheMitMin1;
		int min2;

		for (int spalte = 0; spalte < matrix.length; spalte++) {

			// Merker für jede Reihe neu initialisieren
			min1 = DASH;
			reiheMitMin1 = -1;
			min2 = DASH;

			// Prüfe reihe
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
				// Die stelle mit der Null erhält Penalty des 2.ten Minimums
				penalties[reiheMitMin1][spalte] = penalties[reiheMitMin1][spalte]
						+ min2;
			}
		}
	}

	/**
	 * berechnet die Penalties der Reihen
	 */
	private void kalkulierePenaltyReihen() {
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
	private void minimiereAlleReihen() {
		
		for (int i = 0; i < matrix.length; i++) {
			minimiereReihe(i);
		}
	}

	/**
	 * minimiert alle Spalten
	 */
	private void minimiereAlleSpalten() {
		
		for (int j = 0; j < matrix.length; j++) {
			minimiereSpalte(j);
		}
	}

	/**
	 * Sucht in der reihe das minimum und zieht von allen anderen Werten der
	 * reihe dieses Minimum ab. Dashes werden ignoriert.
	 * 
	 * @param reihe
	 */
	private void minimiereReihe(int reihe) {

		min = getMinOfRow(reihe);

		for (int j = 0; j < matrix.length; j++) {
			if (matrix[j][reihe] != DASH) {
				matrix[j][reihe] = matrix[j][reihe] - min;
			}
		}
	}

	/**
	 * gibt den Index mit dem Minimum einer Reihe zurueck
	 * 
	 * @param reihe
	 * @return
	 */
	private int getMinOfRow(int reihe) {
		min = DASH;

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
	private void minimiereSpalte(int spalte) {

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
	private int getMinOfCol(int spalte) {
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
	private void initPenalties() {
		for (int i = 0; i < penalties.length; i++) {
			for (int j = 0; j < penalties.length; j++) {
				penalties[i][j] = 0;
			}
		}
	}

	public void setMatrix(int[][] pMatrix) {
		anzahl = pMatrix.length;
		matrix = pMatrix;

		matrixCopy = new int[anzahl][anzahl];
		penalties = new int[anzahl][anzahl];
		init();
	}

	public String getMeldung() {
		// TODO Auto-generated method stub
		return null;
	}

}
