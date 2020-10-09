package E4_Backtracking_sudoku;

public class SolveSudoku {

	
	static int[][] s = new int[9][9];
	
	
	
	
	public static void main(String[] args) {
		//zu lösendes Sudoku initialisieren
		initSudoku();
		
		//Spielfeld anzeigen
		ausgabeSudoku();
		
		//Lösen
		solveSudoku(0,0);
		
		//Spielfeld anzeigen
		ausgabeSudoku();

	}

	
	
	private static boolean solveSudoku(int y, int x) {
		//Ergebnis
		boolean zahlGefunden = true;
		int zahl;
		
		//solange es TL gibt
		zahl = sucheTL(y, x);
	
		if(zahl != -1) {
			
			//wähle TL
			s[y][x] = zahl;
			
			//wenn Ziel erreicht
			if(gibAnzahlFreieFelder() == 0) {
				//Lösung
				return true;
			}
			else {
				//sonst Rekursionsschritt -> suche nächste leere Zelle
				//hier weitermachen....
				if(x<=7 && s[y][x+1]==0 ) {
					solveSudoku(y, x+1);
				}
				
				if(y<=7 && s[y+1][x]==0) {
					solveSudoku(y+1, x);
				}
				
				
				
				
				
				
				
				
			}
			
			return true;
			
		}
		
		else {
			//sonst Sackgasse;
			System.out.println("Sackgasse bei:"+x+" "+y+" zahl"+zahl);
			return false;
		}
	}

	private static int sucheTL(int y, int x) {
		for (int z = 1; z <=9; z++) {
			if(
			s[y][x]==0 
			&& pruefeReihe(y,z) 
			&& pruefeSpalte(x,z) 
			&& pruefeQuadrat(y,x,z)) {
			return z;
			}
		}
		
		return -1;
	}

	private static int gibAnzahlFreieFelder() {
		int anzahl=0;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if(s[i][j]==0) {
					anzahl++;
				}
			}
		}
		return anzahl;
	}


	private static boolean pruefeQuadrat(int reihe, int spalte, int zahl) {
		
		int startreihe,startspalte;
		
		//Start indizes des Quadrats ermitteln
		if(reihe>=0 && reihe <=2) {
			startreihe=0;
		}
		else if(reihe>2 && reihe <=5) {
			startreihe=3;
		}
		else {
			startreihe=6;
		}
		
		if(spalte>=0 && spalte <=2) {
			startspalte = 0;
		}
		else if(spalte>2 && spalte <=5) {
			startspalte = 3;
		}
		else {
			startspalte = 6;
		}
		
		for (int j = startreihe; j < startreihe+2; j++) {
			for (int i = startspalte; i < startspalte+2; i++) {
				if(s[j][i]==zahl) {
					return false;
				}
			}
	    }
		
		//System.out.println("Quadrat prüfung ok"+reihe+spalte+" zahl:"+zahl);
		return true;
		
	}


	private static boolean pruefeSpalte(int spalte, int zahl) {
		for (int j = 0; j < s.length; j++) {
			if(s[j][spalte]==zahl) {
				return false;
			}
		}
		return true;
	}


	private static boolean pruefeReihe(int reihe, int zahl) {
			for (int i = 0; i < s.length; i++) {
			if(s[reihe][i]==zahl) {
				return false;
			}
		}
		return true;
	}


	private static void ausgabeSudoku() {
		int wx = 0;
		//Erste Trennlinie
		augabeLinie();
		for (int y = 0; y < s.length; y++) {
			//Zeilenumbruch
			System.out.println();
			
			if(y==3 || y==6) {
				augabeLinie();
				System.out.println();
			}
			for (int x = 0; x < s.length; x++) {
			
				if(wx==0 || wx==3|| wx==6) {
					System.out.print("|");
				}
				System.out.print(" "+s[y][x]+" ");
				wx++;
				if(wx>=9) {
					System.out.print("|");
					wx=0;
				}
			}
		}
		//letzte Linie
		System.out.println();
		augabeLinie();
		System.out.println();
	}

	private static void augabeLinie() {
		System.out.print("-------------------------------");
	}




	private static void initSudoku() {
		
		//        1            2           3           4           5           6           7           8           9
		s[0][0] = 0; s[0][1] = 0;s[0][2] = 0;s[0][3] = 0;s[0][4] = 0;s[0][5] = 0;s[0][6] = 7;s[0][7] = 2;s[0][8] = 8;
		s[1][0] = 2; s[1][1] = 7;s[1][2] = 8;s[1][3] = 0;s[1][4] = 0;s[1][5] = 3;s[1][6] = 0;s[1][7] = 1;s[1][8] = 0;
		s[2][0] = 0; s[2][1] = 9;s[2][2] = 0;s[2][3] = 0;s[2][4] = 0;s[2][5] = 0;s[2][6] = 6;s[2][7] = 4;s[2][8] = 0;
		s[3][0] = 0; s[3][1] = 5;s[3][2] = 0;s[3][3] = 0;s[3][4] = 6;s[3][5] = 0;s[3][6] = 2;s[3][7] = 0;s[3][8] = 0;
		s[4][0] = 0; s[4][1] = 0;s[4][2] = 6;s[4][3] = 0;s[4][4] = 0;s[4][5] = 0;s[4][6] = 3;s[4][7] = 0;s[4][8] = 0;
		s[5][0] = 0; s[5][1] = 1;s[5][2] = 0;s[5][3] = 0;s[5][4] = 5;s[5][5] = 0;s[5][6] = 0;s[5][7] = 0;s[5][8] = 0;
		s[6][0] = 1; s[6][1] = 0;s[6][2] = 0;s[6][3] = 7;s[6][4] = 0;s[6][5] = 6;s[6][6] = 0;s[6][7] = 3;s[6][8] = 4;
		s[7][0] = 0; s[7][1] = 0;s[7][2] = 0;s[7][3] = 5;s[7][4] = 0;s[7][5] = 4;s[7][6] = 0;s[7][7] = 0;s[7][8] = 0;
		s[8][0] = 7; s[8][1] = 0;s[8][2] = 9;s[8][3] = 1;s[8][4] = 0;s[8][5] = 0;s[8][6] = 8;s[8][7] = 0;s[8][8] = 5;
		
		
	}

}
