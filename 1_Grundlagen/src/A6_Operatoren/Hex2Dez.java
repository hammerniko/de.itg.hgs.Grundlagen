package A6_Operatoren;
import java.util.Scanner;

public class Hex2Dez {
	
	public static void main(String[] args) {
		
		//Eingabe & Deklaration
		Scanner s = new Scanner(System.in);
		String hexWert;
		String binWert;
		int dezZahl;
		
		System.out.print("Geben Sie eine Hex-Zahl ein:");
		hexWert = s.nextLine();
		
		//Verarbeitung
		dezZahl = Integer.parseInt(hexWert,16);
		binWert = Integer.toBinaryString(dezZahl);
				

		//Ausgabe
		System.out.println("Die Hexadezimalzahl:\t"+hexWert);
		System.out.println("Dezimalwert:\t\t"+dezZahl);
		System.out.println("Binärwert:\t\t"+binWert);
		
	}

}
