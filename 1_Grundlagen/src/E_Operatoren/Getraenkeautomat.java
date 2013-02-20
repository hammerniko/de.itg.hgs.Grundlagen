package E_Operatoren;
import java.text.Format;
import java.util.Scanner;


public class Getraenkeautomat {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double preis = 0.99;
		double betrag, rest,rueckgeld, kosten;
		int bestellt,anzahlMax, zweiEuro=0,einEuro=0,fuenfzigCent=0,zwanzigCent=0,zehnCent=0,fuenfCent=0,zweiCent=0,cent=0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Betrag:\t\t");
		betrag = s.nextDouble();
		
		//Anzahl GetrŠnke
		anzahlMax = (int) (betrag / preis);
		
		do {
			System.out.println("Anzahl:\t\t");
			bestellt = s.nextInt();
        } while (bestellt>anzahlMax);
		
		
		//RŸckgeld
		kosten = bestellt * preis;
		rueckgeld = betrag - kosten;
		rest=rueckgeld*100;	
		
		//MŸnzen
		zweiEuro = (int) rest/200;
		rest = rest%200;
		einEuro = (int) rest/100;
		rest = rest%100;
		fuenfzigCent = (int) rest/50;
		rest = rest%50;
		zwanzigCent = (int) rest/20;
		rest = rest%20;
		zehnCent = (int) rest/10;
		rest = rest%10;
		fuenfCent = (int) rest/5;
		rest = rest%5;
		zweiCent = (int) rest/2;
		rest = rest%2;
		cent = (int) rest;
		
		
		//Ausgabe
		System.out.println("Betrag:\t\t"+betrag);
		System.out.println("Anzahl GetrŠnke:"+bestellt);
		System.out.println("Kosten:\t\t"+kosten);
		System.out.println("RŸckgeld:\t"+rueckgeld);
		System.out.println();
		System.out.println("2 Euro:"+zweiEuro);
		System.out.println("1 Euro:"+einEuro);
		System.out.println("50 Cent:"+fuenfzigCent);
		System.out.println("20 Cent:"+zwanzigCent);
		System.out.println("10 Cent:"+zehnCent);
		System.out.println("5 Cent:"+fuenfCent);
		System.out.println("2 Cent:"+zweiCent);
		System.out.println("1 Cent:"+cent);
		
		
		
	}
}
