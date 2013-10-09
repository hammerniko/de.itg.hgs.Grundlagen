package A5_Eingabe;

import java.util.Scanner;

public class EingabeKonsole {

	public static void main(String[] args) {
		
		//Eingabe
		Scanner s = new Scanner(System.in);
		
		System.out.print("Ihr alter: ");
		int alter = s.nextInt();
		
		System.out.print("Ihre Grš§e in cm: ");
		double groesse = s.nextDouble();
		
		System.out.print("Ihr Name: ");
		String name = s.next();
	
		//Ausgabe
		System.out.println("-------------------------------");
		System.out.println("Sie sind "+alter+" Jahre alt");
		System.out.println("und "+groesse+"cm gro§");
		System.out.println("Ihr Name lautet: "+name);
		
	}

}
