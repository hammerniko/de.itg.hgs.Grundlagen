package I_Methoden;
public class EinfuehrungMethoden {
	// Hauptprogramm 
	// Nach der Ausgabe wird jede Methode einmal aufgerufen
	public static void main(String[] args) {
		System.out.println("Hallo hier bin ich");
		zeichneLinie();
		zeichneLinie(80);
		zeichneLinie(80, '*');
	}

	// Einfache Methode, ohne RŸckgabewert
	public static void zeichneLinie() {
		System.out.println("-------------------------");
	}

	// Einfache Ÿberladene Methode mit †bergabeparameter
	// ohne RŸckgabewert
	// Zeichnet eine Linie definierter LŠnge
	public static void zeichneLinie(int anzahlStriche) {
		for (int i = 0; i < anzahlStriche; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	// Einfache Ÿberladene Methode mit mehreren †bergabeparametern
	// ohne RŸckgabewert
	// Zeichnet eine Linie definierter LŠnge mit einem definierten Zeichen
	public static void zeichneLinie(int anzahlStriche, char zeichen) {
		for (int i = 0; i < anzahlStriche; i++) {
			System.out.print(zeichen);
		}
		System.out.println();
	}
}
