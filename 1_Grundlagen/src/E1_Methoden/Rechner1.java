package E1_Methoden;

import java.util.Scanner;

public class Rechner1 {

	public static void main(String[] args) {
		//Eingabe
		Scanner s = new Scanner(System.in);
		System.out.println("Zahl1:");
		double z1 = s.nextDouble();
		
		System.out.println("Zahl2:");
		double z2= s.nextDouble();
		
		
		//Verarbeitung
		double summe = getSumme(z1, z2);
		double differenz = getDifferenz(z1, z2);
		
		
		//Ausgabe
		System.out.println("Summe = "+summe);
		System.out.println("Differenz ="+differenz);
	}
	
	
	
	private static double getDifferenz(double z1, double z2) {
		
		return z2-z1;
	}



	public static double getSumme(double pZ1, double pZ2){
		return pZ1+pZ2;
	}

}
