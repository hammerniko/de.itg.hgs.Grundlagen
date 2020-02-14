package B1_Verzweigungen;

import java.util.Scanner;
public class B1_2b_Teilbarkeit {
	public static void main(String[] args) {
		//Eingabe
		String meldung;
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte Zahl eingeben: ");
		int zahl = s.nextInt();
		
		System.out.println("Bitte Teiler eingeben:");
		int teiler = s.nextInt();
		
		//Verarbeitung
		if(zahl%teiler==0){
			meldung=zahl+" ist durch "+teiler+" ohne Rest teilbar";
		}
		else{
			meldung=zahl+" ist nicht durch "+teiler+" ohne Rest teilbar";
		}
		//Ausgabe
		System.out.println(meldung);
	}
}
