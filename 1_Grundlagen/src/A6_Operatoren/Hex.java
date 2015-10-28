package A6_Operatoren;

import java.util.Scanner;


public class Hex {

	public static void main(String[] args) {
		//Eingabe
		Scanner s = new Scanner(System.in);
		int dezimalzahl;
				
		System.out.print("Dezimalzahl:\t");
		dezimalzahl = s.nextInt();
		
		//Verarbeitung
		String hex = Integer.toHexString(dezimalzahl);
		
		//Ausgabe
		System.out.println("Hexadezimal:\t0x"+hex);
	}

}
