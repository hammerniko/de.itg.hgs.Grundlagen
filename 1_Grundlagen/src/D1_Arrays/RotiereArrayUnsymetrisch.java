package D1_Arrays;

public class RotiereArrayUnsymetrisch {

	public static void main(String[] args) {

		int[][] tabelle = new int[3][4];

		//erste Zeile
		tabelle[0][0] = 1;
		tabelle[1][0] = 1;
		tabelle[2][0] = 1;
		
		//zweite Zeile
		tabelle[0][1] = 2;
		tabelle[1][1] = 2;
		tabelle[2][1] = 2;
		
		//dritte Zeile
		tabelle[0][2] = 3;
		tabelle[1][2] = 3;
		tabelle[2][2] = 3;
		
		//vierte Zeile
		tabelle[0][3] = 4;
		tabelle[1][3] = 4;
		tabelle[2][3] = 4;
		
		ausgabe(tabelle);
		
		int[][] tabelle90 = rotiere(tabelle);
		ausgabe(tabelle90);
		
		int[][] tabelle180 = rotiere(tabelle90);
		ausgabe(tabelle180);
		


	}

	private static int[][] rotiere(int[][] feld) {
		int x = feld.length;   
		int y = feld[0].length; 
		
		//rotiertes Array 
		int[][] tabNeu = new int[y][x];
				
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				tabNeu[j][x-1-i]= feld[i][j];
			}
		}
		
		return tabNeu;
	}

	
	public static void ausgabe(int[][] feld) {
		int dim1 = feld.length;
		int dim2 = feld[0].length;
				
		for (int i = 0; i < dim1; i++) {
			
			//Von links nach rechts
			for (int j = 0; j < dim2; j++) {
				System.out.print(feld[i][j]);
			}
			
			System.out.println();
			
		}
		
		System.out.println("------------");
	}
	

}
