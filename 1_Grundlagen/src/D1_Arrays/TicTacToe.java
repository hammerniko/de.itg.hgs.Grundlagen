package D1_Arrays;

import java.util.Scanner;

public class TicTacToe {

	//Variablen
	public static int aktuellerSpieler;
	
	// Konstanten
	public static final int SPIELER_1 = 1;
	public static final int SPIELER_2 = -1;
	public static final int ANZ_ZEILESPALTE = 3;
	public static final int INITWERT = 0;

	// Statisches Spielfeld (von allen Methoden aufrufbar)
	static int[][] sf = new int[ANZ_ZEILESPALTE][ANZ_ZEILESPALTE];

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int feldNr;
		
		
		// initialisieren des Spielfeldes
		initSpielfeld();

		// Ausgabe des Spielfeldes
		ausgabeSpielfeld();

		//Spieler1 gibt Wert ein auf Pos 8
		aktuellerSpieler = SPIELER_1;
		
		do {
		
			//Eingabe
			do {
				System.out.println("Eingabe Spieler "+aktuellerSpieler+":");
				feldNr = s.nextInt();
			} while (setzeFeld(feldNr)==false);
			
			//Ausgabe des Spielfeldes
			ausgabeSpielfeld();
	
			//Spielerwechsel
			wechsleSpieler();

		} while (pruefeObGewonnen()==false);
		
	
		wechsleSpieler();
		//Ausgabe Gewinner
		System.out.println("Spieler "+aktuellerSpieler+ " hat gewonnen");
		
	}

	
	
	private static void wechsleSpieler() {
		aktuellerSpieler = aktuellerSpieler * -1;
	}



	private static boolean pruefeObGewonnen() {
		//Prüfsummen bilden und merken
		int[] sum = new int[8];
		sum[0]=sf[0][0]+sf[0][1]+sf[0][2];
		sum[1]=sf[1][0]+sf[1][1]+sf[1][2];
		sum[2]=sf[2][0]+sf[2][1]+sf[2][2];
		sum[3]=sf[0][0]+sf[1][0]+sf[2][0];
		sum[4]=sf[0][1]+sf[1][1]+sf[2][1];
		sum[5]=sf[0][2]+sf[1][2]+sf[2][2];
		sum[6]=sf[0][0]+sf[1][1]+sf[2][2];
		sum[7]=sf[2][0]+sf[1][1]+sf[0][2];
		
		for (int i = 0; i < sum.length; i++) {
			if(Math.abs(sum[i])==3) {
				return true;
			}
		}
		
		return false;
	}



	private static boolean setzeFeld(int feldNr) {
		boolean setzenOK=false;
		int zeile=-1, spalte=-1;
		switch (feldNr) {
		case 1: zeile=2; spalte=0;break;
		case 2: zeile=2; spalte=1;break;
		case 3: zeile=2; spalte=2;break;
		case 4: zeile=1; spalte=0;break;
		case 5: zeile=1; spalte=1;break;
		case 6: zeile=1; spalte=2;break;
		case 7: zeile=0; spalte=0;break;
		case 8: zeile=0; spalte=1;break;
		case 9: zeile=0; spalte=2;break;

		default:
			break;
		}
		
		if(sf[zeile][spalte]==INITWERT) {
			setzenOK = true;
			sf[zeile][spalte]=aktuellerSpieler;
		}
		
		return setzenOK;
		
	}



	/**
	 * Gibt das Spielfeld auf der Konsole aus
	 */
	private static void ausgabeSpielfeld() {
		for (int zeile = 0; zeile < sf.length; zeile++) {
			for (int spalte = 0; spalte < sf[0].length; spalte++) {
				System.out.print("|");
				int feldwert = sf[zeile][spalte];
				
				if (feldwert==SPIELER_1) {
					System.out.print("X");
				}
				else if (feldwert==SPIELER_2) {
					System.out.print("O");
				}
				else {
					System.out.print(" ");
			}
			System.out.print("|");
			}
			System.out.println();
		}
		System.out.println("---");

	}

	
	
	
	/**
	 * Initialisiert das Spielfeld Array mit dem Wert 0
	 * @author Hr
	 */
	private static void initSpielfeld() {
		for (int zeile = 0; zeile < sf.length; zeile++) {
			for (int spalte = 0; spalte < sf[0].length; spalte++) {
				sf[zeile][spalte] = INITWERT;
			}
		}
	}// end initSpielfeld

}
