package L1_2048;

public class Game2048 {

	public static final int ANZAHL_ZEILE_SPALTE = 4;
	
	
	public static void main(String[] args) {
		newGame();
		
		//Erzeugen eines neuen Fensterobjektes
		Gui dieGui = new Gui();
		
		//Sichtbarmachen des Fensterobjektes
		dieGui.setVisible(true);
		
		
		
	}

	private static void newGame() {
		//Spielfeld generieren und initialisieren
		int[][] sf = new int[ANZAHL_ZEILE_SPALTE][ANZAHL_ZEILE_SPALTE];
		
		//Ermittle Maximum im SF
		int max = getMax(sf);
			
		//Ziehe zufällig eine 2er Potenz mit Max als Höchstwert 2,4,8...
		int wert = calcWert(max);
		
		//Ermittle zufällige position von 0-ANZAHL_ZEILE_SPALTE-1
		int xIndex = getIndexFirstField();
		int yIndex = getIndexFirstField();
		
		
		
		
		
		
		
		
		//Setze den ersten Wert an die zufällig bestimmte position
		sf[xIndex][yIndex]= wert;
				
		//Spielfeld anzeigen
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

	/**
	 * Ermittelt einen zufälligen Index zur Initialisierung des Spiels mit dem ersten besetzten
	 * Feld.
	 * @param anzahlZeileSpalte
	 * @return
	 */
	private static int getIndexFirstField() {
		return (int) (Math.random()*ANZAHL_ZEILE_SPALTE);
	}

	/**
	 * Die Methode erzeigt eine 2er Potenz ab der Zahl 2 bis zum übergebenen Maximum.
	 * Bsp: max = 8. Mögliche Ergebnisse sind: 2,4,8
	 * Bsp: max = 32.Mögliche Ergebnisse sind: 2,4,8,16,32
	 * Bsp: max = 0. Ergebnis ist 2
	 * @param max
	 * @return
	 */
	private static int calcWert(int max) {
		//Anzahl der Möglichkeiten abhängig von max bestimmen
		int n=1;
		if(max>0) {
			n = (int) (Math.log(max)/Math.log(2));
		}
		
		//Zufallszahl erzeugen
		int zz = (int) (Math.random()*n+1);
		
		//Wert als Zweierpotenz erzeugen
		int wert = (int) Math.pow(2, zz);
		
		return wert;
	}


	private static int getMax(int[][] sf) {
		int maxFound=0; //minimaler Wert
		
		for (int i = 0; i < sf.length; i++) {
			for (int j = 0; j < sf.length; j++) {
				if(maxFound<sf[i][j]) {
					maxFound=sf[i][j];
				}
			}
		}
		return maxFound;
	}

}
