package D1_Arrays;

public class RotiereArray {

	public static void main(String[] args) {

		//3x3 Tabelle initialisieren und ausgeben
		int[][] tabelle = initTabelle();
		ausgabe(tabelle);

		//Tabelle rotieren und ausgeben
		tabelle = rotiere(tabelle);
		ausgabe(tabelle);
		
		

	}

	private static int[][] rotiere(int[][] tabelle) {
		int anz = tabelle.length;
		
		int[][] tabNeu = new int[anz][anz];
		int x2, y2;
		x2 = 0;

		for (int y = 0; y < anz; y++) {
			y2 = anz-1;
			for (int x = 0; x < anz; x++) {
				tabNeu[x][y] = tabelle[x2][y2];
				y2--;
			}
			x2++;
		}

		return tabNeu;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static int[][] initTabelle() {
		int[][] tabelle = new int[3][3];

		tabelle[0][0] = 3;
		tabelle[1][0] = 5;
		tabelle[2][0] = 7;
		
		tabelle[0][1] = 1;
		tabelle[1][1] = 9;
		tabelle[2][1] = 12;
		
		tabelle[0][2] = 2;
		tabelle[1][2] = 6;
		tabelle[2][2] = 0;
						
		return tabelle;
	}

	public static void ausgabe(int[][] feld) {
		for (int y = 0; y < feld.length; y++) {
			for (int x = 0; x < feld.length; x++) {
				System.out.print(feld[x][y] + " ");
			}
			System.out.println();
		}
		System.out.println("------------------");
	}

}
