package A6_Operatoren;

import java.util.Scanner;


public class A63_Zahlensysteme_Dez2Hex {

	public static void main(String[] args) {
		//Eingabe
		Scanner s = new Scanner(System.in);
		int dezimalzahl;
		
		System.out.print("Dezimalzahl:\t");
		dezimalzahl = s.nextInt();
		
		//Verarbeitung mit Wrapper Klasse
		String hex = Integer.toHexString(dezimalzahl);
		String bin = Integer.toBinaryString(dezimalzahl);
		
		//Ausgabe
		System.out.println("Hexadezimal:\t"+hex);
		System.out.println("Binaerwert:\t"+bin);
	}

}
