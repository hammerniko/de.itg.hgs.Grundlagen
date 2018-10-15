package A5_Eingabe;

import java.util.Scanner;


public class Eingabe {
	
	public static void main(String[] args){
		//********** EINGABE
		//Objekt der Klasse Scanner erzeugen
		//Zeiger s zeigt auf Objekt im HEAP
		Scanner s = new Scanner(System.in);
				
		//Warten bis auf der Konsole Enter gedrueckt wird
		//Einlesen von Text
		System.out.print("Name:\t");
		String name = s.next(); //Prg wartet auf Enter Taste
		
		//Ganze Zahl einlesen
		int anzahlHandys=0;
		double gewicht=0;
		boolean loop;
		
			System.out.print("Wieviele Handys benutzt Du?");
			do {
				try {
					System.out.print("Wieviele Handys benutzt Du?");
					loop = false;
					anzahlHandys = s.nextInt();
					
				} catch (Exception e) {
					System.out.println("\nBitte nur ganze Zahlen eingeben:");
					
					//eingabepuffer löschen
					s.next();
					
					loop = true;
				}
				
			} while (loop);
			
			
			
			do {
				try {
					System.out.print("Wieviel wiegst Du?");
					gewicht = s.nextDouble();
					loop = false;
				} catch (Exception e) {
					System.out.println("Bitte nur Zahlen eingeben:");
					loop = true;
					
					//eingabepuffer löschen
					s.next();
					
				}
			} while (loop);
		
		
		
		
		//Verarbeitung
		name = "_"+name; 
			
		//AUSGABE
		System.out.println("Dein Name ist:\t"+name);
		System.out.println("Anzahl Handys:\t"+anzahlHandys);
		System.out.println("Dein Gewicht:\t"+gewicht+"kg");
		s.close();
	}
	
	
	

}
