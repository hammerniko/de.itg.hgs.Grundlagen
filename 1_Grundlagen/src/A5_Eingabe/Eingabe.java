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
		System.out.print("Wieviele Handys benutzt Du?");
		int anzahlHandys = s.nextInt();
		
		//Kommazahl
		System.out.print("Wieviel wiegst Du?");
		double gewicht = s.nextDouble();
		
		//Verarbeitung
		name = "_"+name; 
			
		//AUSGABE
		System.out.println("Dein Name ist:\t"+name);
		System.out.println("Anzahl Handys:\t"+anzahlHandys);
		System.out.println("Dein Gewicht:\t"+gewicht+"kg");
	}
	
	
	

}
