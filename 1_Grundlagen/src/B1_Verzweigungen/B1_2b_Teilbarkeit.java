package B1_Verzweigungen;

import java.util.Scanner;
public class B1_2b_Teilbarkeit {
	public static void main(String[] args) {
		//Eingabe
		String meldung;
		int zahl = 123693;
		int teiler = 3;
		
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
