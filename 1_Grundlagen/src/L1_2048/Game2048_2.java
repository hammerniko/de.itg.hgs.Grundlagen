package L1_2048;

public class Game2048_2 {
	
	private static final int ANZAHL_ZEILE_SPALTE = 4;

	public static void main(String[] args) {
		
		newGame();
		
	}

	private static void newGame() {
		int[][] sf = new int[ANZAHL_ZEILE_SPALTE][ANZAHL_ZEILE_SPALTE];
		
		//Ermittle das Maximum aller Spielsteine
		int max = getMax(sf);
		
		//ziehe zufällig eine 2er Potenz mit Max als Höchstwert 2,4,8,...
		int wert = calcWert(max);
		
		//Ermittle zufällige Startposition von 0-ANZAHL_ZEILE_SPALTE-1
		int xIndex = getIndexFirstField();
		int yIndex = getIndexFirstField();
	
		//setzen des Startwertes auf Startposition
		sf[yIndex][xIndex]= wert;
		
		//ausgabe des Spielfeldes
		ausgabe(sf);
	}

	private static void ausgabe(int[][] sf) {
		for (int y = 0; y < sf.length; y++) {
			for (int x = 0; x < sf.length; x++) {
				System.out.print(sf[x][y]+"\t");
			}
			System.out.println();
		}
	}
	
	
	

	private static int getIndexFirstField() {
		return  (int) (Math.random()*ANZAHL_ZEILE_SPALTE);
	}

	private static int calcWert(int max) {
		//Anzahl der Möglichkeiten abhängig von max bestimmen
				int n=2;
				if(max>0) {
					n = (int) (Math.log(max)/Math.log(2));
				}
				
				//Zufallszahl erzeugen
				int zz = (int) (Math.random()*n+1);
				
				//Wert als Zweierpotenz erzeugen
				int wert = (int) Math.pow(2, zz);
				
				return wert;
	}

	private static int getMax(int[][] spielfeld) {
		int maxErg = 0;
		
		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld.length; j++) {
				if(spielfeld[i][j]>maxErg) {
					maxErg = spielfeld[i][j];
				}
			}
		}
						
		return maxErg;
	}

}
