package J1_TSP;

public class TSP {

	static int[][] matrix = new int[5][5];
	static int min;
	

	public static void main(String[] args) {
		setMatrix();
		ausgabeMatrix();
		
		
		minimiereAlleReihen();
		
		ausgabeMatrix();

	}

	public static void minimiereAlleReihen() {
		for (int i = 0; i < 5; i++) {
			minimiereReihe(i);
		}
	}

	private static void minimiereReihe(int reihe) {
		min = Integer.MAX_VALUE;
		int indexMin;
		
		for (int j = 0; j < matrix.length; j++) {
			if (matrix[j][reihe] < min) {
				min = matrix[j][reihe];
				indexMin = j;
			}
		}
		
		
		for (int j = 0; j < matrix.length; j++) {
			if(matrix[j][reihe]!=999){
				matrix[j][reihe]=matrix[j][reihe]-min;
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

	public static void setMatrix() {
		// 1.Reihe
		matrix[0][0] = 999; // steht für -
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

}
