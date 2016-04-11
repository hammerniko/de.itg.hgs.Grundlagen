package E1_Methoden;

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		//Varriable
		String eingegebeneZeichen;
		char buchstabe;
		int anzahl = 0;
		
		//Wortliste
		String wort[] = {"windsurfen","sandmann","mauseloch","sprintrennen","weihnachtsmann","feierabend","schule",};
		
		//Zufällig ein Wort aus der Liste bestimmen
		String aktWort = (wort[gibIndex()]);
		
		//gefundener Buchstabe = 1, offener Buchstabe = 0
		int[] zustand = new int[aktWort.length()];
		
		//Eingabestrom öffnen
		Scanner s = new Scanner(System.in);
		
		do {
					
			//Wort ausgeben
			ausgabeWort(aktWort, zustand);
			
			//Buchstabe einlesen
			anzahl++;
			System.out.print(anzahl+".\nBuchstabe:");
			eingegebeneZeichen = s.next();
			
			
			//Ändere den Zustand
			zustand = setzeZustand(aktWort, zustand, eingegebeneZeichen);
			
			
		} while (!istWortVollstaendig(zustand));
			
		
		System.out.println("Geschafft, Sie haben "+anzahl+" Versuche benötigt");
		
		

	}
	
	
	public static int[] setzeZustand(String aktWort, int[] zustand, String eingWort) {
		
		//Wenn das eingegebene Wort stimmt
		if(aktWort.equals(eingWort)){
			for (int i = 0; i < zustand.length; i++) {
				zustand[i] = 1;
			}
		}
		
		
		//Wenn nur ein Zeichen eingegeben wurde
		char b = eingWort.charAt(0);
		char[] zeichen = aktWort.toCharArray();
		
		for (int i = 0; i < zustand.length; i++) {
			if(zeichen[i]==b){
				zustand[i]=1;
			}
		}
		
		return zustand;
		
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
		System.out.println("\n");
		
	}


	public static boolean istWortVollstaendig(int[] zustand){
		for (int i = 0; i < zustand.length; i++) {
			if(zustand[i]==0){
				return false;
			}
		}
		
		return true;
			
	}
	
	
	public static int gibIndex(){
		int zufallszahl= (int) (Math.random()*4+1);
		return zufallszahl-1;
	}

}
