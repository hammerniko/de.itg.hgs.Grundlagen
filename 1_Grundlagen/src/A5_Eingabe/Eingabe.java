package A5_Eingabe;

import java.util.Scanner;


public class Eingabe {
	
	public static void main(String[] args){
		//EINGABE
		//Objekt der Klasse Scanner erzeugen
		//Zeiger s zeigt auf Objekt im HEAP
		Scanner s = new Scanner(System.in);
		
		//Warten bis auf der Konsole Enter gedrueckt wird
		//Einlesen von Text
		System.out.print("Name:\t");
		String name = s.next();
		
		//Einleisen einer ganzen Zahl
		System.out.print("Wieviele Handy(s) hast Du? ");
		int anzahlHandys = s.nextInt();
		
		//Einlesen einer Kommazahl
		System.out.print("Wie groﬂ bist Du (m)? ");
		double groesse = s.nextDouble();
		
		
		//Verarbeitung
		
		
			
		//AUSGABE
		System.out.println("Dein Name ist:"+name);
		System.out.println("Du hast "+anzahlHandys+" Handys");
		System.out.println("Du bist "+groesse+"m groﬂ");

		
		
	}
	
	
	

}
