package D1_Arrays;

import java.util.Scanner;

public class TicTacToe2 {
	
	//Konstante
	public static final int SPIELER_1 = 1;
	public static final int SPIELER_2 = -1;
	public static final int FREI = 0;
	public static final int ANZ_ZEILE_SPALTE=3;
	
	//Klassenvariable
	public static int[][] sf = new int[ANZ_ZEILE_SPALTE][ANZ_ZEILE_SPALTE];
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		//Variablen
		int aktuellerSpieler;
		
		//initialisieren des Spielfeldes
		initSpielfeld();
		
		//Ausgabe des Spielfeldes
		ausgabeSpielFeld();
				
		//Spieler wählen
		aktuellerSpieler = SPIELER_1;
		
		
		do {
			//Eingabe Spielstand simulieren
			//Spieler ein drueckt Ziffer
			eingabe(aktuellerSpieler);
			
			//Ausgabe
			ausgabeSpielFeld();
			
			//wechsle Spieler
			aktuellerSpieler = aktuellerSpieler * -1;
			
		} while (!pruefeObGewonnen());
		
		//wechsle Spieler
		aktuellerSpieler = aktuellerSpieler * -1;
		System.out.println(aktuellerSpieler+" hat gewonnen");
		
		s.close();
	}


	private static void eingabe(int aktuellerSpieler) {
		int ziffer=-1;
		
		do {
			//einlesen der Ziffer vom ziffernblock
			System.out.println("Spieler: "+aktuellerSpieler);
			ziffer = s.nextInt();
		} while (!setzeFeld(ziffer,aktuellerSpieler));
		
	}
	
	private static boolean setzeFeld(int ziffer, int aktSpieler) {
		boolean setzenOK=false;
		int zeile=-1, spalte=-1;
		switch (ziffer) {
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
		
		if(sf[zeile][spalte]==FREI) {
			setzenOK = true;
			sf[zeile][spalte]=aktSpieler;
		}
		
		return setzenOK;
	}


	private static void ausgabeSpielFeld() {
		char spielerZeichen;
		for (int i = 0; i < sf.length; i++) {
			for (int j = 0; j < sf[0].length; j++) {
				
				if(sf[i][j]==SPIELER_1) {
					spielerZeichen='x';
				}
				else if(sf[i][j]==SPIELER_2) {
					spielerZeichen='o';
				}
				else {
					spielerZeichen=' ';
				}
				
				
				
				System.out.print(spielerZeichen+" | ");
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		
	}

	/**
	 * Setzt alle Spielfelder auf den Wert 0
	 * @author hr
	 */
	private static void initSpielfeld() {
		for (int i = 0; i < sf.length; i++) {
			for (int j = 0; j < sf[0].length; j++) {
				sf[i][j]=FREI;
			}
		}
	}


	private static boolean pruefeObGewonnen() {
		
		int[] summe = new int[8];
		summe[0]=sf[0][0]+sf[0][1]+sf[0][2];
		summe[1]=sf[1][0]+sf[1][1]+sf[1][2];
		summe[2]=sf[2][0]+sf[2][1]+sf[2][2];
		summe[3]=sf[0][0]+sf[1][0]+sf[2][0];
		summe[4]=sf[0][1]+sf[1][1]+sf[2][1];
		summe[5]=sf[0][2]+sf[1][2]+sf[2][2];
		summe[6]=sf[0][0]+sf[1][1]+sf[2][2];
		summe[7]=sf[2][0]+sf[1][1]+sf[0][2];
		
		for (int i = 0; i < summe.length; i++) {
			if(Math.abs(summe[i])==ANZ_ZEILE_SPALTE) {
				return true;
			}
		}
		
		
		
		return false;
	}

}
