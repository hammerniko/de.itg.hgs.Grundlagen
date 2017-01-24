package J1_TSP;

public class TSP {

	static boolean debug = true;
	static int[][] matrix = new int[5][5];
	static int[][] penalties = new int[5][5];
	static int min;
	static int indexMaxPenaltyReihe;
	static int indexMaxPenaltySpalte;

	public static void main(String[] args) {
		setMatrix();
		ausgabeMatrix();

		minimiereAlleReihen();
		minimiereAlleSpalten();

		kalkulierePenaltiesMax();
		ausgabePenalties();
		
		ausgabeMatrix();

	}

	private static void kalkulierePenaltiesMax() {
		initPenalties();
		
		int min1=999;
		int spalteMitMin1=-1;
		int min2=999;
		int spalteMitMin2=-1;
		
		int reihe = 4;
		
		//Prüfe reihe 
		//Suche erstes Minimum und merke die Stelle und Wert
		for (int spalte = 0; spalte < matrix.length; spalte++) {
			if(matrix[reihe][spalte]<min1){
				min1=matrix[reihe][spalte];
				spalteMitMin1 = spalte;
			}
		}
		
		//Suche zweites Minimum und merke die Stelle und Wert
		for (int spalte = 0; spalte < matrix.length; spalte++) {
			if(matrix[reihe][spalte]<min2 && spalte != spalteMitMin1){
				min2=matrix[reihe][spalte];
				spalteMitMin2 = spalte;
			}
		}
		
		//Wenn eine Null in der Reihe gefunden wurde
		if(min1==0){
			//Die stelle mit der Null erhält Penalty des 2.ten Minimums
			penalties[reihe][spalteMitMin1]=min2;
		}
		
		trace(""+min1);
		trace(""+min2);
		

	}

	private static void minimiereAlleReihen() {
		trace("Alle Reihen minimiert");
		for (int i = 0; i < 5; i++) {
			minimiereReihe(i);
		}
	}

	private static void minimiereAlleSpalten() {
		trace("Alle Spalten minimiert");
		for (int j = 0; j < 5; j++) {
			minimiereSpalte(j);
		}
	}

	private static void minimiereReihe(int reihe) {
		min = Integer.MAX_VALUE;
		int indexMin;

		indexMin = getMinOfRow(reihe);

		for (int j = 0; j < matrix.length; j++) {
			if (matrix[j][reihe] != 999) {
				matrix[j][reihe] = matrix[j][reihe] - min;
			}
		}

	}

	private static int getMinOfRow(int reihe) {
		min = 999;
		int indexMin = -1;
		for (int j = 0; j < matrix.length; j++) {
			if (matrix[j][reihe] < min) {
				min = matrix[j][reihe];
				indexMin = j;
			}
		}
		return indexMin;
	}

	private static void minimiereSpalte(int spalte) {
		min = Integer.MAX_VALUE;
		int indexMin;

		indexMin = getMinOfCol(spalte);

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[spalte][i] != 999) {
				matrix[spalte][i] = matrix[spalte][i] - min;
			}
		}

	}

	private static int getMinOfCol(int spalte) {
		min = 999;
		int indexMin = -1;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[spalte][i] < min) {
				min = matrix[spalte][i];
				indexMin = i;
			}
		}
		return indexMin;
	}

	private static void initPenalties() {
		for (int i = 0; i < penalties.length; i++) {
			System.out.println();
			for (int j = 0; j < penalties.length; j++) {
				penalties[i][j] = 0;
			}
		}

	}

	private static void ausgabeMatrix() {

		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i] == 999) {
					System.out.print("-\t");
				} else {
					System.out.print(matrix[j][i] + "\t");
				}
			}
		}
		System.out.println("\n-------------------------------------");
	}
	
	private static void ausgabePenalties() {

		for (int i = 0; i < penalties.length; i++) {
			System.out.println();
			for (int j = 0; j < penalties.length; j++) {
				
					System.out.print(penalties[i][j] + "\t");
				
			}
		}
		System.out.println("\n-------------------------------------");
	}

	public static void setMatrix() {
		// 1.Reihe
		matrix[0][0] = 999; // steht f�r -
		matrix[1][0] = 7;
		matrix[2][0] = 12;
		matrix[3][0] = 3;
		matrix[4][0] = 4;

		// 2.Reihe
		matrix[0][1] = 7;
		matrix[1][1] = 999;
		matrix[2][1] = 9;
		matrix[3][1] = 4;
		matrix[4][1] = 1;

		// 3.Reihe
		matrix[0][2] = 12;
		matrix[1][2] = 9;
		matrix[2][2] = 999;
		matrix[3][2] = 1;
		matrix[4][2] = 8;

		// 4.Reihe
		matrix[0][3] = 3;
		matrix[1][3] = 4;
		matrix[2][3] = 1;
		matrix[3][3] = 999;
		matrix[4][3] = 7;

		// 5.Reihe
		matrix[0][4] = 4;
		matrix[1][4] = 1;
		matrix[2][4] = 8;
		matrix[3][4] = 7;
		matrix[4][4] = 999;
	}

	public static void trace(String meldung) {
		if (debug) {
			System.out.println(meldung);
		}
	}

}
