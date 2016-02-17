package D1_Arrays;

import java.util.Scanner;

public class Getraenkeautomat {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double preis = 0.99;
		double betrag, rest, rueckgeld, kosten;
		int bestellt, anzahlMax;
		// Felder fuer Muenzen
		int[] muenzen = new int[8];
		int[] muenzWerteInCent = { 200, 100, 50, 20, 10, 5, 2, 1 };
		String[] muenzNamen = { " 2 Euro", " 1 Euro", "50 Cent", "20 Cent",
		        "10 Cent", " 5 Cent", " 2 Cent", " 1 Cent" };
		
		Scanner s = new Scanner(System.in);
		System.out.print("Betrag:\t\t");
		betrag = s.nextDouble();
		// Anzahl Getraenke
		anzahlMax = (int) (betrag / preis);
		
		do {
			System.out.print("Anzahl:\t\t");
			bestellt = s.nextInt();
		} while (bestellt > anzahlMax);
		
		// Rueckgeld
		kosten = runden(bestellt * preis);
		rueckgeld = runden(betrag - kosten);
		rest = rueckgeld * 100;
		
		// Muenzen
		for (int i = 0; i < muenzen.length-1; i++) {
			muenzen[i] = (int) rest / muenzWerteInCent[i];
			rest = runden(rest % muenzWerteInCent[i]);
		}
		muenzen[7]=(int) rest;
		
		// Ausgabe
		System.out.println("\nBetrag:\t\t" + betrag+ " Euro");
		System.out.println("Anzahl Getraenke:" + bestellt+" GetrŠnke");
		System.out.println("--------------------------------------");
		System.out.println("Kosten:\t\t" + kosten+" Euro");
		System.out.println("Rueckgeld:\t" + rueckgeld+ " Euro");
		System.out.println("--------------------------------------");
		System.out.println();
		ausgabe(muenzen, muenzNamen);
		
	}

	public static void ausgabe(int[] muenzen, String[] muenzNamen) {
		System.out.println("Ausgabe der Muenzen:");
		for (int i = 0; i < muenzen.length; i++) {
			System.out.println(muenzNamen[i]+": \t"+muenzen[i]);
		}
	}
	
	public static double runden(double zahl){
		
		return Math.rint(zahl*100.0)/100.0;
	}
}
