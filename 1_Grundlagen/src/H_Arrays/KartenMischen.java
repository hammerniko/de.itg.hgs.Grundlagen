package H_Arrays;
public class KartenMischen {
	
	//Karten eines Spielers[Nr][Karte]
	static String[][] kartenSpieler = new String[3][10];
	static String[] skat = new String[2];
	
	public static void main(String[] args) {
		String[] karten = erstelleKarten();
		karten = mischeKarten(karten);
		geben(karten);
		ausgabeSpielkarten();
		
	}//END MAIN

	public static String[] erstelleKarten() {
		String[] karten = new String[32]; 	
		String[] kartenFarbe = {"Karo ","Herz ","Pik  ","Kreuz"};
		String[] kartenBez = {"7     ","8     ","9     ","Bube ","Dame ","König","Zehn ","As   "};
		
		int nr = 0;
		
		for (int farbe = 0; farbe < kartenFarbe.length; farbe++) {
			for (int bez = 0; bez < kartenBez.length; bez++) {
				
				karten[nr] = kartenFarbe[farbe]+" "+kartenBez[bez];
				nr++;
			}
			
		}
		
		
		return karten;
	}

	public static String[] mischeKarten(String[] karten) {
		
		int anzKarten = karten.length;
		String[] kartenNeu = new String[anzKarten];
		
		//Neue Reihenfolge erzeugen
		boolean[] gezogeneKarten = new boolean[anzKarten];                 
		int[] kartenReihenfolge = new int[anzKarten];
						
		for (int i = 0; i < kartenReihenfolge.length; i++) {
				//Wiederhole bis neue Zahl gezogen wird
			do {
				kartenReihenfolge[i] = (int) (Math.random()*anzKarten+1);
	
			} while (gezogeneKarten[kartenReihenfolge[i]-1]==true);
			
			gezogeneKarten[kartenReihenfolge[i]-1]=true;
			//System.out.println(kartenReihenfolge[i]);
		}//ende for
		
		for (int i = 0; i < kartenNeu.length; i++) {
			kartenNeu[i]=karten[kartenReihenfolge[i]-1];
		}
				
		return kartenNeu;
	}
	
	public static void ausgabeKartenStapel(String[] karten){
		for (int i = 0; i < karten.length; i++) {
			System.out.println(karten[i]);
		}
	}
	
	public static void ausgabeSpielkarten(){
		System.out.println("Spieler1\t "
				  +"Spieler 2 \t "
				  +"Spieler 3  ");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.print(kartenSpieler[0][i]+"\t"
			    		 +" "+kartenSpieler[1][i]+"\t"
				 		 +" "+kartenSpieler[2][i]+"\t\n");
			}
		
		System.out.println();
		System.out.println("Skat:");
		System.out.println("-----------");
		for (int i = 0; i < skat.length; i++) {
			System.out.println(skat[i]);
		}
				
	}
	
	public static void geben(String[] karten){
		int nr=0;
		for (int i = 0; i < kartenSpieler.length; i++) {
			for (int j = 0; j < kartenSpieler[0].length; j++) {
				kartenSpieler[i][j]=karten[nr];
				nr++;
			}
		}
		
		skat[0]=karten[30];
		skat[1]=karten[31];
				
	}
	
	
	
}//END CLASS
