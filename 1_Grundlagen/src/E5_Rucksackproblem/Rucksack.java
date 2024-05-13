package E5_Rucksackproblem;

public class Rucksack {

	//Gesamtvolumen des Rucksacks
	static int rVol = 30;
	
	//Volumina der einzelnen Gegenstände
	static int[] gVol = {5,5,6,9,6,11,12,15,17,30};
	
	//Werte der einzelnen Gegenstnde
	static int[] gWert = {7,7,6,5,10,5,14,17,20,21};
	
	
	//Für dynamische Programmierung
	//Ergebnis für jeden Volumenwert speichern
	static int matrix[][];
	
	/*Initialisieren der Matrix mit -1
	 *-1 ist ein Wert, der bei den Gegenständen nicht vorkommen kann
	 */
	static int[][] initMatrix() {
		int[][] m = new int[rVol+1][gVol.length];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = -1;
			}
		}
		return m;
	}

	//rekursiver Algorithmus
	static int packen(int restVol, int i) {
		
		if (i < gVol.length) {
			
			System.out.println("Restvol:"+restVol+"\ti"+i);
			if(matrix[restVol][i]!=-1) {
				return matrix[restVol][i];
			}
		
			// Nicht einpacken -> gehe zum nächsten Gegenstand
			int nicht = packen(restVol, i + 1);
				
			//Einpacken
			int drin = 0;
			
			//Wenn der Gegenstand noch reinpasst
			if (restVol - gVol[i] >= 0) {
					drin = gWert[i]+packen(restVol-gVol[i], i+1);
			}
			
			
			if(nicht>drin) {
				matrix[restVol][i]= nicht;
			}
			else {
				matrix[restVol][i] = drin;
			}
			return matrix[restVol][i];
		}

		
		
		return 0;
	}
	
	static void printGrid(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
	
	static void findG(int maxWert) {
		int aktVol = 0;
		for (int i = 0; i < matrix.length; i++) {
			if(matrix[i][0]==maxWert) {
				aktVol = i;
			}
		}
		
		for (int i = 0; i < gVol.length; i++) {
			if(aktVol-gVol[i]>= 0 && matrix[aktVol-gVol[i]][i+1]==matrix[aktVol][i]-gWert[i]) {
				System.out.println(i+" ");
				aktVol = aktVol-gVol[i];
			}
		}
		
	}

	public static void main(String[] args) {
		//Zwischenspeicher initialisieren
		matrix = initMatrix();

		//Den Rucksack packen
		int erg = packen(rVol, 0);
		System.out.println(erg);

		//Zwischenspeicher ausgeben
		printGrid(matrix);
		
		//Die gepackten Gegenstnde ausgeben
		findG(erg);
	}
	
	
	
	

}
