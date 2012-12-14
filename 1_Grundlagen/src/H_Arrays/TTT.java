package H_Arrays;
public class TTT {
	
	//Klassenvariable
	static int[][] spielFeld = new int[3][3];
	static int[] summe = new int[8];
	
	//***************Hauptprogramm*************************************
	public static void main(String[] args) {
		
		initSpielFeld();
		setSpielStand();	
		ausgabeSpielFeld();
		pruefeObGewonnen();
		
	}//Ende *************Mainmethode***********************************
	
	//neue Methode zur Initialisierung des Spielfeldes
	public static void initSpielFeld(){
		//quelltext, was die Methode tun soll.
		System.out.println("initSpielFeld ausgeführt");
		spielFeld[0][0] = 0; spielFeld[0][1] = 0; spielFeld[0][2] = 0;
		spielFeld[1][0] = 0; spielFeld[1][1] = 0;  spielFeld[1][2] = 0;
		spielFeld[2][0] = 0; spielFeld[2][1] = 0;  spielFeld[2][2] = 0;
	}
	
	public static void ausgabeSpielFeld(){
		System.out.println(""+spielFeld[0][0]+"\t"+spielFeld[0][1]+"\t"+spielFeld[0][2]);
		System.out.println(""+spielFeld[1][0]+"\t"+spielFeld[1][1]+"\t"+spielFeld[1][2]);
		System.out.println(""+spielFeld[2][0]+"\t"+spielFeld[2][1]+"\t"+spielFeld[2][2]);
	}
	
	public static void setSpielStand(){
		spielFeld[0][0] = -1; spielFeld[0][1] = -1; spielFeld[0][2] = 1;
		spielFeld[1][0] = 1; spielFeld[1][1] = 1;  spielFeld[1][2] = +1;
		spielFeld[2][0] = 1; spielFeld[2][1] = -1;  spielFeld[2][2] = 0;
	}
	
	public static void pruefeObGewonnen(){
		//Prüfung...
		System.out.println("prüfe...");
		int gewinner=0;
		
		for (int i = 0; i <= 2; i++) {
			summe[0] += spielFeld[0][i];
			summe[1] += spielFeld[1][i];
			summe[2] += spielFeld[2][i];
			summe[3] += spielFeld[i][0];
			summe[4] += spielFeld[i][1];
			summe[5] += spielFeld[i][2];
			summe[6] += spielFeld[i][i];
			summe[7] += spielFeld[2 - i][i];
		}//end for summen bilden
		
		for (int i = 0; i <= 7; i++) {
			if (Math.abs(summe[i]) == 3) {
				gewinner = summe[i] / 3;
				break;
			}//end if
		}//end for summen prüfen

		System.out.println(""+gewinner+" hat gewonnen");
	}

}
