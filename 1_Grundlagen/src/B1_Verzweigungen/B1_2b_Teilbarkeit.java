package B1_Verzweigungen;

import java.util.Scanner;
public class B1_2b_Teilbarkeit {
	public static void main(String[] args) {
		//Eingabe
		Scanner sc = new Scanner(System.in);
		String meldung;
		System.out.print("Zu pruefende Zahl:");
		int zahl = sc.nextInt();
		System.out.print("Teiler:");
		int teiler = sc.nextInt();
		
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
