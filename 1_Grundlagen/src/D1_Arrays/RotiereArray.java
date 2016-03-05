package D1_Arrays;

public class RotiereArray {

	public static void main(String[] args) {

		String[][] tabelle = new String [3][3];
		
		tabelle = initTabelle();
		ausgabe(tabelle);

		tabelle = rotiere(tabelle);
		ausgabe(tabelle);
		
		

	}

	private static String[][] rotiere(String[][] tabelle) {
		int anz = tabelle.length;
		
		String[][] tabNeu = new String[anz][anz];
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static String[][] initTabelle() {
		String[][] tabelle = new String[3][3];

		tabelle[0][0] = "A";
		tabelle[1][0] = "B";
		tabelle[2][0] = "C";
		
		tabelle[0][1] = "D";
		tabelle[1][1] = "E";
		tabelle[2][1] = "F";
		
		tabelle[0][2] = "G";
		tabelle[1][2] = "H";
		tabelle[2][2] = "I";
						
		return tabelle;
	}

	public static void ausgabe(String[][] feld) {
		for (int y = 0; y < feld.length; y++) {
			for (int x = 0; x < feld.length; x++) {
				System.out.print(feld[x][y] + " ");
			}
			System.out.println();
		}
		System.out.println("------------------");
	}

}
