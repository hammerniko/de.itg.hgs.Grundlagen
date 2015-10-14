package A5_Eingabe;

import java.util.Scanner;


public class Eingabe {
	
	public static void main(String[] args){
		
		//EINGABE
		
		//Objekt der Klasse Scanner erzeugen
		//Zeiger s zeigt auf Objekt im HEAP
		Scanner s = new Scanner(System.in);
			
		
		//Warten bis auf der Konsole Enter gedrueckt wird
		System.out.print("Name:\t");
		String name = s.next();
		
		System.out.print("Groesse:\t");
		int groesse = s.nextInt(); 
				
		System.out.print("Gewicht:\t");
		double gewicht = s.nextInt();
		
		
		
		//AUSGABE
		System.out.println(name);
		System.out.println(groesse);
		System.out.println(gewicht);
		
		
	}
	
	
	

}
