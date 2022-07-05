package E1_Methoden;

import java.util.Scanner;


public class E1_1_EinfuehrungMethoden {

	public static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {

		//Eingabe
		zeichneLinie(25);
		double z1 = input("Zahl1:");
		double z2 = input("Zahl2:");
		
		//Verarbeitung
		double summe=gibSumme(z1,z2);
		double diff	=gibDifferenz(z1,z2);
		double prod	=gibProdukt(z1,z2);
		double quot	=gibQuotient(z1,z2);
		
		//Ausgabe
		zeichneLinie(25);
		System.out.println("Summe\t\t= "+summe);
		System.out.println("Differenz\t= "+diff);
		System.out.println("Produkt\t\t= "+prod);
		System.out.println("Quotient\t= "+quot);
		
		s.close();
	}//Ende Main


	private static double input(String eingabetext) {
		System.out.print(eingabetext);
		double z1=s.nextDouble();
		return z1;
	}

	
	

	/**
	 * Methode zum zeichnen einer Linie
	 * @param anzahl
	 */
	private static void zeichneLinie(int anzahl) {
		for (int j = 0; j < anzahl; j++) {
			System.out.print("-");
		}
		System.out.println();
	}


	/**
	 * Methode zum addieren von zwei Zahlen
	 * @param pZahl1
	 * @param pZahl2
	 * @return
	 */
	public static double gibSumme(double pZahl1, double pZahl2) {
		return pZahl1 + pZahl2;
	}
	
	/**
	 * Methode zum subtrahieren zweier Zahlen
	 * @param pZahl1
	 * @param pZahl2
	 * @return
	 */
	public static double gibDifferenz(double pZahl1, double pZahl2) {
		return pZahl1 - pZahl2;
	}

	/**
	 * Methode zum multiplizieren zweier Zahlen
	 * @param pZahl1
	 * @param pZahl2
	 * @return
	 */
	public static double gibProdukt(double pZahl1, double pZahl2) {
		return pZahl1 * pZahl2;
	}
	
	/**
	 * Methode zum Dividieren zweier Zahlen. Ein Division durch 0 ist nicht 
	 * erlaubt und ergibt NaN.
	 * @param pZahl1
	 * @param pZahl2
	 * @return
	 */
	public static double gibQuotient(double pZahl1, double pZahl2) {
		double erg;
		if(pZahl2!=0){
			erg = pZahl1 / pZahl2;
		}
		else{
			erg = Double.NaN;
		}
		return erg;
	}
	

}//Ende Klasse
