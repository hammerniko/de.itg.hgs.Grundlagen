package D1_Arrays;

public class ZweidimensionalesArray {

	public static void main(String[] args) {
		
		//Direkte initialisierung
		int[][] tabelle = initArray();
			
		//Werte ändern
		aendernTabellenwert(tabelle, 2,3,100);
						
		//TODO Ausgabe auf der Konsole
		ausgabeArray(tabelle);
	}

	
	
	
	
	
	
	
	private static void aendernTabellenwert(int[][] t, int zeile, int spalte, int wert) {
		t[zeile][spalte]=wert;
	}

	private static void ausgabeArray(int[][] tabelle) {
		for (int i = 0; i < tabelle.length; i++) {
			for (int j = 0; j < tabelle[0].length; j++) {
				
				System.out.print(tabelle[i][j]+" ");
				
			}
			System.out.println();
		}
	}

	private static int[][] initArray() {
		int[][] tabelle = {
				{1,2,3,4},
				{53,24,15,13},
				{60,72,83,21}
				
		};
		return tabelle;
	}

}
