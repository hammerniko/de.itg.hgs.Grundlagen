package A5_Eingabe;

import java.util.Scanner;

public class Wochentag {

	public static void main(String[] args) {
		// Eingabe
		Scanner sc = new Scanner(System.in);
		System.out.println("Tag (TT):");
		int tag = sc.nextInt();

		System.out.println("Monat (MM):");
		int monat = sc.nextInt();

		System.out.println("Jahr (YYYY):");
		int jahr = sc.nextInt();

		int anzahlJahre;
		int wochentagNr; // 0=Sonntag, 1=Montag ,...
		int anzSchaltjahre = 0;
		int anzahlTage = 0;
		int tageDerMonate = 0;
		String wochentag="";
		
		// Verabreitung
		anzahlJahre = (jahr - 1900);
		anzSchaltjahre = anzahlJahre / 4;
		anzahlTage = 365 * anzahlJahre + anzSchaltjahre;

		switch (monat) {
		case 1:
			tageDerMonate = 0;
			anzahlTage--;
			break;
		case 2:
			tageDerMonate = 31;
			break;
		case 3:
			tageDerMonate = 31 + 28;
			break;
		case 4:
			tageDerMonate = 31 + 28 + 31;
			break;
		case 5:
			tageDerMonate = 31 + 28 + 31 + 30;
			break;
		case 6:
			tageDerMonate = 31 + 28 + 31 + 30 + 31;
			break;
		case 7:
			tageDerMonate = 31 + 28 + 31 + 30 + 31 + 30;
			break;
		case 8:
			tageDerMonate = 31 + 28 + 31 + 30 + 31 + 30 + 31;
			break;
		case 9:
			tageDerMonate = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
			break;
		case 10:
			tageDerMonate = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			break;
		case 11:
			tageDerMonate = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			break;
		case 12:
			tageDerMonate = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31
					+ 30;
			break;
		}
		
		anzahlTage = anzahlTage + tageDerMonate + tag ;
		wochentagNr = anzahlTage % 7;
		
		switch (wochentagNr) {
		case 0: wochentag="Sonntag"; break;
		case 1: wochentag="Montag"; break;
		case 2: wochentag="Dienstag"; break;
		case 3: wochentag="Mittwoch"; break;
		case 4: wochentag="Donnerstag"; break;
		case 5: wochentag="Freitag"; break;
		case 6: wochentag="Samstag"; break;
			
			
		}
		
		
		System.out.println(anzahlTage);
		System.out.println(tageDerMonate);
		System.out.println(wochentagNr);
		System.out.println(wochentag);

	}
}