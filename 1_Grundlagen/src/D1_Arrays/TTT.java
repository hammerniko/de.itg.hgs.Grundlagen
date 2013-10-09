package D1_Arrays;

import java.util.Scanner;
import org.omg.CosNaming.IstringHelper;

public class TTT {
	
	//Klassenvariable
	static int[][] spielFeldDaten = new int[3][3];
	static String[][] ausgabeSpielfeld= new String[3][3]; 
	static int[] summe = new int[8];
	
	//Spielstatus
	static final int FREI = 0;
	static final int X = 1;
	static final int O = -1;
	static final int UNENTSCHIEDEN = 2;
	
	//Startzustand
	static int aktuellerSpieler = X;
	static int aktuellerStatus = 0;
	static int anzahlFreierFelder=0;
	
	static Scanner s;
	static int x,y; //fŸr Umrechnung Ziffernblockeingabe in 2 Dim. Array
	
	
	//***************Hauptprogramm*************************************
	public static void main(String[] args) {
		s = new Scanner(System.in);
		initSpielFeld();
		zeigeBegruessung();
		
		do {
			setzeFeld();
			wechsleSpieler();
			ausgabeSpielFeld();			
			
		}while(Math.abs(pruefeObGewonnen())!=1 && anzahlFreierFelder>0);
		
		
		ausgabeErgebnis();
		
		
		
	}//Ende *************Mainmethode***********************************

	private static void ausgabeErgebnis() {
	    if(aktuellerStatus==UNENTSCHIEDEN){
			System.out.println("UNENTSCHIEDEN");
		}
		else{
			System.out.println("Spieler "+aktuellerStatus+" hat gewonnen.");
		}
    }
	
	private static void wechsleSpieler() {
	    aktuellerSpieler = aktuellerSpieler*-1;
	    
    }

	private static boolean setzeFeld() {
		boolean gesetzt=false;
		boolean istEingabeGueltig=true;
		System.out.println("Geben Sie Ihr Feld ein:");
		System.out.println("Spieler "+aktuellerSpieler+":");
	    int feldNr = s.nextInt();
	    switch (feldNr) {
		case 1: x=0; y=2;break;
		case 2: x=1; y=2;break;
		case 3: x=2; y=2;break;
		case 4: x=0; y=1;break;
		case 5: x=1; y=1;break;
		case 6: x=2; y=1;break;
		case 7: x=0; y=0;break;
		case 8: x=1; y=0;break;
		case 9: x=2; y=0;break;
		
		default:  istEingabeGueltig = false;
		
	    }
	    if(spielFeldDaten[y][x]==FREI && istEingabeGueltig){
			spielFeldDaten[y][x]=aktuellerSpieler;
			gesetzt=true;
	    }
	    else{
	    	setzeFeld();
	    	
	    }
	    setzeAusgabeFeld(y, x);
	    return gesetzt;
	}

    

	private static void zeigeBegruessung() {
	    System.out.println("Tic TAc Toe 1.0");
	    System.out.println("***************");
	    System.out.println();
    }

	//neue Methode zur Initialisierung des Spielfeldes
	private static void initSpielFeld(){
		for (int i = 0; i < spielFeldDaten.length; i++) {
	        for (int j = 0; j < spielFeldDaten.length; j++) {
	        	spielFeldDaten[i][j] = FREI;
	        	setzeAusgabeFeld(i,j);
            }
        }
	}
	
	private static void setzeAusgabeFeld(int i, int j) {
	   switch (spielFeldDaten[i][j]) {
	   case 1: ausgabeSpielfeld[i][j]="X";break;
	   case -1: ausgabeSpielfeld[i][j]="O";break;
	   case 0: ausgabeSpielfeld[i][j]=" ";break;
	
	   }
	
    }

	private static void ausgabeSpielFeld(){
		setAnzahlFreieFelder();
		System.out.println();
		System.out.println("|-----------|");
		System.out.println("| "+ausgabeSpielfeld[0][0]+" | "+ausgabeSpielfeld[0][1]+" | "+ausgabeSpielfeld[0][2]+" |");
		System.out.println("|-----------|");
		System.out.println("| "+ausgabeSpielfeld[1][0]+" | "+ausgabeSpielfeld[1][1]+" | "+ausgabeSpielfeld[1][2]+" |");
		System.out.println("|-----------|");
		System.out.println("| "+ausgabeSpielfeld[2][0]+" | "+ausgabeSpielfeld[2][1]+" | "+ausgabeSpielfeld[2][2]+" |");
		System.out.println("|-----------|");
		System.out.println();
	}
	
	private static void setSpielStand(){
		spielFeldDaten[0][0] = -1; spielFeldDaten[0][1] = -1; spielFeldDaten[0][2] = 1;
		spielFeldDaten[1][0] = 1; spielFeldDaten[1][1] = 1;  spielFeldDaten[1][2] = +1;
		spielFeldDaten[2][0] = 1; spielFeldDaten[2][1] = -1;  spielFeldDaten[2][2] = 1;
		
	}
	
	private static int pruefeObGewonnen(){
		
		if (anzahlFreierFelder==0) {
	        aktuellerStatus = UNENTSCHIEDEN;
        }
		else{
		for (int i = 0; i < summe.length; i++) {
	        summe[i]=0;
        }
		
		
		
		for (int i = 0; i <= 2; i++) {
			summe[0] += spielFeldDaten[0][i];
			summe[1] += spielFeldDaten[1][i];
			summe[2] += spielFeldDaten[2][i];
			summe[3] += spielFeldDaten[i][0];
			summe[4] += spielFeldDaten[i][1];
			summe[5] += spielFeldDaten[i][2];
			summe[6] += spielFeldDaten[i][i];
			summe[7] += spielFeldDaten[2 - i][i];
		}//end for summen bilden
		
		for (int i = 0; i <= 7; i++) {
			if (Math.abs(summe[i]) == 3) {
				aktuellerStatus = summe[i] / 3;
				
				break;
			}//end if
		}//end for summen prüfen

		}
		return aktuellerStatus;
	}
	
	private static void setAnzahlFreieFelder(){
		anzahlFreierFelder=0;
		for (int i = 0; i < spielFeldDaten.length; i++) {
	        for (int j = 0; j < spielFeldDaten.length; j++) {
	            if(spielFeldDaten[i][j]==FREI){
	            	anzahlFreierFelder++;
	            }
            }
        }
	}
	

}
