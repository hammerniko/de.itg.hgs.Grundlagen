package E5_Rucksackproblem;

public class RucksackOhneMatrix {

	// Gesamtvolumen des Rucksacks
	static int rVol = 10;
  	
	// Volumina der einzelnen Gegenstände
	static int[] gVol = { 2, 4, 6};

	// Werte der einzelnen Gegenstnde
	static int[] gWert = { 1, 3, 5};
	
		
	// rekursiver Algorithmus
	static int packen(int restVol, int i) {
		System.out.println("aufruf packen("+restVol+","+i+")");
		if (i < gVol.length) {
			
			// Nicht einpacken -> gehe zum nächsten Gegenstand
			int nicht = packen(restVol, i + 1);
			System.out.println("nicht eingepackt: "+i+"("+nicht+")");
			
			// Einpacken
			int drin = 0;
			
			// Wenn der Gegenstand noch reinpasst
			if (restVol - gVol[i] >= 0) {
				System.out.println("einpacken "+i);
				drin = gWert[i] + packen(restVol - gVol[i], i + 1);
				System.out.println("drin berechnet:"+i+"("+drin+")");
				
			}
			
			if(drin>nicht) {
				System.out.println("i="+i+"\tWert drin:"+drin+" > nicht:"+nicht);
				return drin;
			}
			else {
				System.out.println("i="+i+"\tWert nicht:"+nicht+" >= drin:"+drin);
				return nicht;
			}
		}
		
		System.out.println("---------i durchgezählt---------");
		return 0;
	}
	

	public static void main(String[] args) {

		// Den Rucksack packen
		int erg = packen(rVol, 0);
		System.out.println(erg);
		
		

	}

}
