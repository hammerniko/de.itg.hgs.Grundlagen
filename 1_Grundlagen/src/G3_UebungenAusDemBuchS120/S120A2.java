package G3_UebungenAusDemBuchS120;

public class S120A2 {
	
	//Statisches Feld, da der Spielstand 
	//von allen Methoden benoetigt wird
	static int[][] spielstand;
	
	
	public static void main(String[] args) {
		
		//Spielstandfeld erstellen
		spielstand = new int[3][3];
		
		//Spielstandfeld initialisieren
		initSpielstand();
		
		//Spielstandfeld ausgeben
		initSpielstand();
	}
	
	
	private static void initSpielstand() {
		//hier beginnt Aufgabe 2
		//spielstand[0][0]= 0;
		//spielstand[0][1]= 0;
		//spielstand[0][2]= 0;
		//spielstand[1][0]= 0;
		//spielstand[1][1]= 0;
		//spielstand[1][2]= 0;
		//spielstand[2][0]= 0;
		//spielstand[2][1]= 0;
		//spielstand[2][2]= 0;
		
		for (int zeile = 0; zeile <= 2; zeile++) {
			for (int spalte = 0; spalte <= 2; spalte++) {
				spielstand[zeile][spalte] = 0;
			}
		}
		
		
		
		
		
		
		
		
	}

}
