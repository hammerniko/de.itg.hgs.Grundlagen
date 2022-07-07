package K2_TICTACTOE_mit_minimax_VideoTut;

/**
 * TicTAcToe mit MinMax Algorithmus
 * 
 * @author hr
 *
 */
public class TTT {

	public static int minimumX=-1; //opt. x Position für nächsten Zug des PC 
	public static int minimumY=-1; //opt. y Position für nächsten Zug des PC 
	public static final int NICHT_FERTIG = -1;
	public static final int PC = 1; // Computer verwendet min() 
	public static final int S2 = 2; // Person verwendet max()
	public static final int FREI = 0;
	public static final int S1_GEWONNEN = 0;
	public static final int PC_GEWONNEN = 2;
	public static final int UNENTSCHIEDEN = 1;
	public static int[][] sf = { 
			{ 2, 0, 0 }, 
			{ 0, 0, 0 }, 
			{ 0, 0, 0 }};

	public static void main(String[] args) {
		ausgabe();
 
		System.out.println(min());
		System.out.println(minimumX);
		System.out.println(minimumY);
	}
	private static void ausgabe() {
		char z = '-';
		for (int y = 0; y < sf.length; y++) {
			for (int x = 0; x < sf.length; x++) {

				if (sf[y][x] == PC)
					z = 'O'; //Computer
				else if (sf[y][x] == S2)
					z = 'X'; //Spieler
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
			if (sf[i][0] == PC && sf[i][1] == PC && sf[i][2] == PC)
				return S1_GEWONNEN;
			if (sf[0][i] == PC && sf[1][i] == PC && sf[2][i] == PC)
				return S1_GEWONNEN;
			if (sf[0][0] == PC && sf[1][1] == PC && sf[2][2] == PC)
				return S1_GEWONNEN;
			if (sf[0][2] == PC && sf[1][1] == PC && sf[2][0] == PC)
				return S1_GEWONNEN;
			if (sf[i][0] == S2 && sf[i][1] == S2 && sf[i][2] == S2)
				return PC_GEWONNEN;
			if (sf[0][i] == S2 && sf[1][i] == S2 && sf[2][i] == S2)
				return PC_GEWONNEN;
			if (sf[0][0] == S2 && sf[1][1] == S2 && sf[2][2] == S2)
				return PC_GEWONNEN;
			if (sf[0][2] == S2 && sf[1][1] == S2 && sf[2][0] == S2)
				return PC_GEWONNEN;
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
	
	/**
	 * Wählt die Position die für den zugeordneten Spieler das
	 * Maximum von der Auswertung liefert.
	 * @return 2 bester Zug für Spieler S2
	 * @return 0 schlechtester Zug für Spieler S2
	 * @return 1 unentschieden
	 */
	public static int max() {
		int maximalwert = -999;
		int wert;
		if (auswertung() != NICHT_FERTIG)
			return auswertung();

		for (int y = 0; y < sf.length; y++) {
			for (int x = 0; x < sf.length; x++) {
				if (sf[y][x] == FREI) {
					sf[y][x] = S2;
					wert = min();
					if (wert >= maximalwert) {
						maximalwert = wert;
					}
					sf[y][x] = FREI;
				}
			}
		}

		return maximalwert;
	}

	
	 /**
	 * Wählt die Position die für den PC das
	 * Minimum von der Auswertung liefert.
	 * @return 0 bester Zug für Spieler S1
	 * @return 2 schlechtester Zug für Spieler S1
	 * @return 1 unentschieden
	 */
	private static int min() {
		int minimalwert = 255;
		int wert;
		if (auswertung() != NICHT_FERTIG)
			return auswertung();

		for (int y = 0; y < sf.length; y++) {
			for (int x = 0; x < sf.length; x++) {
				if (sf[y][x] == FREI) {
					sf[y][x] = PC;
					wert = max();
					if (wert <= minimalwert) {
						minimalwert = wert;
						minimumX = x;
						minimumY = y;
					}
					sf[y][x] = FREI;
				}
			}
		}
		return minimalwert;
	}
}
