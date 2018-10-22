package A5_Eingabe;

import java.util.Scanner;

public class Geschwindigkeit {

	public static final double ABSTANDPYLONEN = 50;
	
	public static void main(String[] args) {
		//EINGABE
		Scanner sc = new Scanner(System.in);
		double v,s,t,v_kmh; 
		int anzahlPylonen;
		 
		//test
		
		System.out.print("gemessene Zeit:\t");
		t = sc.nextDouble();
		
		System.out.print("Anzahl Pylonen:\t");
		anzahlPylonen = sc.nextInt();
		
		//Verarbeitung
		s = ABSTANDPYLONEN * anzahlPylonen;
		v = s / t; //in m/s
		v_kmh = v*3.6;
		//AUSGABE
		System.out.println("----------------------------------------");
		System.out.println("\nDie gemessene Zeit ist:\t\t"+t+" sekunden.");
		System.out.println("Die Wegstrecke beträgt:\t\t"+s+" meter.");
		System.out.println("Die Geschwindigkeit beträgt:\t"+v+" m/s");
		System.out.println("Die Geschwindigkeit beträgt:\t"+v_kmh+"km/h");
		

	}

}
