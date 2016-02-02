package D1_Arrays;

public class NamenAlsTabelle {

	public static final int ZEILEN = 5;
	public static final int SPALTEN = 2;
	
	public static void main(String[] args) {
		//Array Deklarieren String[<zeilen>][<spalten>]
		
		
		
		String[][] tg113 = new String[ZEILEN][SPALTEN];
		
		//Array initialisieren
		//Zeile 0
		tg113[0][0] = "Hammer"; //Spalte 0
		tg113[0][1] = "Nikolai";//Spalte 1
		
		//Zeile 1
		tg113[1][0] = "Meier"; 	//Spalte 0
		tg113[1][1] = "Niko";	//Spalte 1
		
		//Zeile 2
		tg113[2][0] = "Mueller";//Spalte 0
		tg113[2][1] = "Tom";	//Spalte 1
		
		//Zeile 3
		tg113[3][0] = "Philip";	//Spalte 0
		tg113[3][1] = "Dragan";	//Spalte 1
		
		//Zeile 4
		tg113[4][0] = "Balboa";	//Spalte 0
		tg113[4][1] = "Rocky";	//Spalte 1
		
		
		
		
				
		//Ausgabe des zweidimensionalen Arrays
		for (int z = 0; z < ZEILEN; z++) {
			
			for (int s = 0; s < SPALTEN; s++) {
				System.out.print(tg113[z][s]+"\t");
			}
			System.out.println();
		}		
				
	}

}
