package J1_TSPa;

public class TSP {

	public static final int DASH = Integer.MAX_VALUE;
	public static int[][] matrix = new int[5][5];
	public static String[] buchstaben = { "A", "B", "C", "D", "E" };

	
	
	public static void main(String[] args) {

		setMatrix();
		ausgabeArray(matrix);
		
		minimizeAllRows();
		
		ausgabeArray(matrix);

	}

	
	
	
	
	
	
	
	
	
	private static void minimizeAllRows() {
		for (int i = 0; i < matrix.length; i++) {
			minimizeRow(i);
		}
	}

	private static void minimizeRow(int row) {
		int min = getMinOfRow(row);
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][row] != DASH) {
				matrix[i][row] = matrix[i][row] - min;
			}
		}
	}

	private static int getMinOfCol(int col) {
		int min = matrix[col][0];
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[col][i] < min) {
				min = matrix[col][i];
			}
		}
		return min;
	}

	private static int getMinOfRow(int row) {
		//Ersten Wert im Array merken
		int min = matrix[0][row];

		//Zweiter bis letzter Wert vergleichen
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][row] < min) {
				min = matrix[i][row];
			}
		}

		return min;
	}

	public static void setMatrix() {
		// 1.Reihe
		matrix[0][0] = DASH;
		matrix[1][0] = 5;
		matrix[2][0] = 3;
		matrix[3][0] = 2;
		matrix[4][0] = 4;

		// 2.Reihe
		matrix[0][1] = 5;
		matrix[1][1] = DASH;
		matrix[2][1] = 4;
		matrix[3][1] = 1;
		matrix[4][1] = 7;

		// 3.Reihe
		matrix[0][2] = 3;
		matrix[1][2] = 4;
		matrix[2][2] = DASH;
		matrix[3][2] = 2;
		matrix[4][2] = 2;

		// 4.Reihe
		matrix[0][3] = 2;
		matrix[1][3] = 1;
		matrix[2][3] = 2;
		matrix[3][3] = DASH;
		matrix[4][3] = 3;

		// 5.Reihe
		matrix[0][4] = 4;
		matrix[1][4] = 7;
		matrix[2][4] = 2;
		matrix[3][4] = 3;
		matrix[4][4] = DASH;
	}

	private static void ausgabeArray(int[][] array) {

		//Erste Reihe
		for (int i = 0; i < array.length; i++) {
			System.out.print("\t" + buchstaben[i]);
		}
		

		for (int i = 0; i < array.length; i++) {
			System.out.println();
			System.out.print(buchstaben[i] );
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

}
