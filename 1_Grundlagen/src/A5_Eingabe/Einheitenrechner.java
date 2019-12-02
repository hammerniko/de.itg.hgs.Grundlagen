package A5_Eingabe;

import java.util.Scanner;

public class Einheitenrechner implements Laengeneinheiten {

	

	public static void main(String[] args) {
		
		//Eingabe
		Scanner s = new Scanner(System.in);
		System.out.print("Messwert in m:" + "\t\t");
		double messwert1 = s.nextDouble(); // in meter
		System.out.println("--------------------");
		double wertinmm;

		// VERARBEITUNG
		wertinmm = messwert1 * METER_IN_MILLIMETER;

		// AUSGABE
		System.out.println("Messwert in Meter:\t" + messwert1 + "m");
		System.out.println("Wert in mm:\t\t" + wertinmm + "mm");
		
		s.close();

	}

}
