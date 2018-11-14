package A5_Eingabe;

import java.util.Scanner;

public class Eingabe {
	
	
	public static void main(String[] args){
		//********** EINGABE
		//Objekt der Klasse Scanner erzeugen
		//Zeiger s zeigt auf Objekt im HEAP
		Scanner s= new Scanner(System.in);
				
		//Warten bis auf der Konsole Enter gedrueckt wird
		//Einlesen von Text
		System.out.print("Name:\t");
		String name = s.next();
		
		//Ganze Zahl einlesen
		System.out.println("Anzahl Handys:\t");
		int anzahlHandys = s.nextInt();
				
		//Komazahl einlesen
		System.out.println("Dein Gewicht:\t");
		double gewicht = s.nextDouble();
		
		
			
		//AUSGABE
		System.out.println("Dein Name ist:\t"+name);
		System.out.println("Anzahl Handys:\t"+anzahlHandys);
		System.out.println("Dein Gewicht:\t"+gewicht+"kg");
		
		//Eingabedatenstream schliesen
		s.close();
		s=null;
		System.gc();
		
	}
	
	
	

}
