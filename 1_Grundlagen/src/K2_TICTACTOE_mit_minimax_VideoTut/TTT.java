package K2_TICTACTOE_mit_minimax_VideoTut;

/**
 * TicTAcToe mit MinMax Algorithmus
 * 
 * @author hr
 *
 */
public class TTT {

	public static final int NICHT_FERTIG = -1;
	public static final int S1 = 1; // verwendet min()
	public static final int S2 = 2; // verwendet max()
	public static final int FREI = 0;
	public static final int S1_GEWONNEN = 0;
	public static final int S2_GEWONNEN = 2;
	public static final int UNENTSCHIEDEN = 1;
	public static int[][] sf = { 
			{ 0, 1, 0 }, 
			{ 2, 2, 1 }, 
			{ 2, 2, 1 } };

	public static void main(String[] args) {
		ausgabe();

		System.out.println(min());
	}

	private static void ausgabe() {
		char z = '-';
		for (int i = 0; i < sf.length; i++) {
			for (int j = 0; j < sf.length; j++) {

				if (sf[i][j] == S1)
					z = 'O';
				else if (sf[i][j] == S2)
					z = 'X';
				else
					z = '-';

				System.out.print(z + " ");
			}
			System.out.println();
		}

	}

	/**
	 * Die Auswertung prüft ob ein Spieler gewonnen hat und gibt dann die Bewertung
	 * des Spieles zurück.
	 * 
	 * @return 0 wenn S1 gewonnen hat
	 * @return 2 wenn S2 gewonnen hat
	 * @return 1 wenn es Unentschieden ist
	 * @return -1 wenn das Spiel noch offen ist
	 */
	public static int auswertung() {

		// Gewinner prüfen
		for (int i = 0; i < sf.length; i++) {
			if (sf[i][0] == S1 && sf[i][1] == S1 && sf[i][2] == S1)
				return S1_GEWONNEN;
			if (sf[0][i] == S1 && sf[1][i] == S1 && sf[2][i] == S1)
				return S1_GEWONNEN;
			if (sf[0][0] == S1 && sf[1][1] == S1 && sf[2][2] == S1)
				return S1_GEWONNEN;
			if (sf[0][2] == S1 && sf[1][1] == S1 && sf[2][0] == S1)
				return S1_GEWONNEN;
			if (sf[i][0] == S2 && sf[i][1] == S2 && sf[i][2] == S2)
				return S2_GEWONNEN;
			if (sf[0][i] == S2 && sf[1][i] == S2 && sf[2][i] == S2)
				return S2_GEWONNEN;
			if (sf[0][0] == S2 && sf[1][1] == S2 && sf[2][2] == S2)
				return S2_GEWONNEN;
			if (sf[0][2] == S2 && sf[1][1] == S2 && sf[2][0] == S2)
				return S2_GEWONNEN;
		}

		// Auf leere Felder prüfen
		for (int i = 0; i < sf.length; i++) {
			for (int j = 0; j < sf.length; j++) {
				if (sf[i][j] == FREI) {
					return NICHT_FERTIG;
				}
			}
		}

		// Wenn kein freies Feld unf kein Gewinner
		return UNENTSCHIEDEN;

	}

	public static int max() {
		int maximalwert = -999;
		int wert;
		if (auswertung() != NICHT_FERTIG)
			return auswertung();

		for (int i = 0; i < sf.length; i++) {
			for (int j = 0; j < sf.length; j++) {
				if (sf[i][j] == FREI) {
					sf[i][j] = S2;
					wert = min();
					if (wert > maximalwert) {
						maximalwert = wert;
					}
					sf[i][j] = FREI;
				}
			}
		}

		return maximalwert;
	}

	private static int min() {
		int minimalwert = 999;
		int wert;
		if (auswertung() != NICHT_FERTIG)
			return auswertung();

		for (int i = 0; i < sf.length; i++) {
			for (int j = 0; j < sf.length; j++) {
				if (sf[i][j] == FREI) {
					sf[i][j] = S1;
					wert = max();
					if (wert < minimalwert) {
						minimalwert = wert;
						
					}
					sf[i][j] = FREI;
				}

			}
		}

		return minimalwert;
	}
}
