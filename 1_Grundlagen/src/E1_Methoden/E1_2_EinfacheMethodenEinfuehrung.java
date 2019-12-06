package E1_Methoden;

public class E1_2_EinfacheMethodenEinfuehrung {

	public static final int BREITE = 45;
	
	public static void main(String[] args) {
		//Eingabe
		double zahl1 = 3;
		double zahl2 = 27;
		
		
		//Verarbeitung
		double summe = getSum(zahl1, zahl2);
		double differenz = getDiff(zahl1,zahl2);
		double produkt = getProdukt(zahl1,zahl2);
		double quotient = getQuotient(zahl1,zahl2);
		double potenz  = getPotenz(zahl1,zahl2);
		double nteWurzel = getWurelN(zahl1,zahl2);
		
		//Ausgabe
		ausgabeZahlen(zahl1, zahl2);
		zeichneLinie(BREITE,'-');
		
		ausgabeErgebnis(zahl2, summe, differenz, produkt, quotient, potenz, nteWurzel);
		zeichneLinie(BREITE, '=');
		
	}//end main

	public static void ausgabeErgebnis(double zahl2, double summe, double differenz, double produkt, double quotient,
			double potenz, double nteWurzel) {
		System.out.println("Summe\t\t\t= "+summe);
		System.out.println("Differenz\t\t= "+differenz);
		System.out.println("Produkt\t\t\t= "+produkt);
		System.out.println("Quotient\t\t= "+quotient);
		System.out.println("Potenz\t\t\t= "+potenz);
		System.out.println("n.te Wurzel aus "+zahl2+"\t= "+nteWurzel);
	}

	public static void ausgabeZahlen(double zahl1, double zahl2) {
		System.out.println("zahl1:\t\t= "+zahl1);
		System.out.println("zahl1:\t\t= "+zahl2);
	}

	private static double getWurelN(double zahl1, double zahl2) {
		// TODO Auto-generated method stub
		return Math.pow(zahl2, 1/zahl1);
	}

	private static double getPotenz(double zahl1, double zahl2) {
		return Math.pow(zahl1, zahl2);
	}

	private static void zeichneLinie(int i,char zeichen) {
		for (int j = 0; j < i; j++) {
			System.out.print(zeichen);
		}
		System.out.println();
		
	}

	private static double getQuotient(double zaehler, double nenner) {
		//Ungueltiger Rueckgabe-Wert bleibt erhalten,
		//wenn der Nenner = 0 ist
		double erg=Double.NaN;
		
		//Nur wenn der Nenner groesser als 0 ist
		//darf gerechnet werden
		if(nenner!=0){
			erg = zaehler/nenner;
		}
		
		//Rueckgabe des Ergebnisses
		return erg;
	}

	private static double getProdukt(double zahl1, double zahl2) {
		return zahl1*zahl2;
	}

	private static double getDiff(double zahl1, double zahl2) {
		return zahl1-zahl2;
	}

	private static double getSum(double zahl1, double zahl2) {
		return zahl1+zahl2;
	}//end getSum

	

}// End class
