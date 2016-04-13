package E1_Methoden;

import java.util.Scanner;

public class Hangman {
	static int highscore = 0;
	static long startZeit = System.currentTimeMillis();
	static long endZeit,zwischenzeit, dauer;
	
	
	public static void main(String[] args) {
		//Varriablen initialisieren
		int anzahl = 0;
		String eingegebeneZeichen="";
		Scanner stream = new Scanner(System.in);
		
		//Wortliste initialisieren
		String wortliste[] = {"windsurfen","sandmann","mauseloch","sprintrennen","weihnachtsmann","feierabend","schule","hirsch","looser","heino"};
		
		//Zufällig ein Wort aus der Liste bestimmen
		String aktWort = gibWort(wortliste);
		//System.out.println(aktWort);
		
		//gefundener Buchstabe = 1, offener Buchstabe = 0
		int[] zustand = new int[aktWort.length()];
			
		
		do {
					
			//Wort ausgeben
			ausgabeWort(aktWort, zustand);
			
			//Buchstabe einlesen
			anzahl++;
			eingegebeneZeichen = eingabeBuchstabe(anzahl, stream);
			
			
			//Ändere den Zustand
			zustand = setzeZustand(aktWort, zustand, eingegebeneZeichen, anzahl);
			
			
		} while (!istWortVollstaendig(zustand));
			
		
		
		setHighscore();
		
		
		System.out.println("Geschafft, Sie haben "+anzahl+" Versuche benötigt");
		System.out.println("Sie haben "+highscore+" Punkte erreicht");
		

	}

	private static void bestimmeDauer() {
		endZeit = System.currentTimeMillis();
		dauer = (endZeit - startZeit)/1000;
	}

	private void init(){
		
	}



	private static String eingabeBuchstabe(int anzahl, Scanner s) {
		String eingegebeneZeichen;
		System.out.print(anzahl+".\nBuchstabe:");
		eingegebeneZeichen = s.next();
		return eingegebeneZeichen;
	}


	private static String gibWort(String[] wortliste) {
		return wortliste[gibIndex(wortliste.length)];
	}
	
	

	public static int[] setzeZustand(String aktWort, int[] zustand, String eingabe, int anzahl) {
		
		//Wenn das eingegebene Wort stimmt
		if(aktWort.equals(eingabe)){
			for (int i = 0; i < zustand.length; i++) {
				zustand[i] = 1;
				betimmeZwischenzeit();
				setHighscore();
							
			}
		}
		
		
		//Wenn nur ein Zeichen eingegeben wurde
		char ersterBuchstabe = eingabe.charAt(0);
		char[] zeichen = aktWort.toCharArray();
		
		for (int i = 0; i < zustand.length; i++) {
			if(zeichen[i]==ersterBuchstabe){
				zustand[i]=1;
				betimmeZwischenzeit();
				setHighscore();
			}
		}
		
		return zustand;
		
	}

	private static void betimmeZwischenzeit() {
		zwischenzeit = System.currentTimeMillis();
		dauer = (zwischenzeit - startZeit)/1000;
	}

	private static void setHighscore() {
		bestimmeDauer();
		highscore = highscore +( 10000 / (int) dauer);
	}


	public static void ausgabeWort(String aktWort, int[] zustand) {
		for (int i = 0; i < zustand.length; i++) {
			if(zustand[i]==0){
				System.out.print("_ ");
			}
			else{
				System.out.print(aktWort.charAt(i)+" ");
			}
			
		}
		System.out.println("Punkte:\n"+highscore);
		
	}


	public static boolean istWortVollstaendig(int[] zustand){
		for (int i = 0; i < zustand.length; i++) {
			if(zustand[i]==0){
				return false;
			}
		}
		
		return true;
			
	}
	
	
	public static int gibIndex(int anzahl){
		int zufallszahl = (int) (Math.random()*anzahl);
		return zufallszahl;
	}

}
