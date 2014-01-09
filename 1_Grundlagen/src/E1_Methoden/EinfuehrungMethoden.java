package E1_Methoden;
public class EinfuehrungMethoden {
	// Hauptprogramm 
	// Nach der Ausgabe wird jede Methode einmal aufgerufen
	public static void main(String[] args) {
	    
	    //Erste Anweisung im Hauptprogramm
		System.out.println("Hallo hier bin ich");
		
		//Methoden aufrufen
		zeichneLinie();
		zeichneLinie(20);
		zeichneLinie(15,'x');
		
		//Nach bearbeitung der Methode
		//kehrt das PRogramm hierher zurück
		System.out.println("Ende");
	}//Ende main
	
	
	
	
	// Einfache Methode, ohne Rückgabewert
	public static void zeichneLinie() {
		System.out.println("x-------------------------");
	}//Ende zeichneLinie()

	
	
	// Einfache überladene Methode mit Übergabeparameter
	// ohne Rückgabewert
	// Zeichnet eine Linie definierter Länge
	public static void zeichneLinie(int anzahlStriche) {
	    
		for (int i = 0; i < anzahlStriche; i++) {
			System.out.print("-");
		}
		
		System.out.println();
	}
	
	

	// Einfache überladene Methode mit mehreren Übergabeparametern
	// ohne Rückgabewert
	// Zeichnet eine Linie definierter Länge mit einem definierten Zeichen
	public static void zeichneLinie(int anzahlStriche, char zeichen) {
		for (int i = 0; i < anzahlStriche; i++) {
			System.out.print(zeichen);
		}
		System.out.println();
	}
}
