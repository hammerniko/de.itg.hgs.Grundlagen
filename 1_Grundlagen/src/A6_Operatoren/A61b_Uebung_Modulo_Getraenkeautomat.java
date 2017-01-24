package A6_Operatoren;
import java.util.Scanner;


public class A61b_Uebung_Modulo_Getraenkeautomat {
	
	public static void main(String[] args) {
		
		double preis=0;
		double betrag, rest,rueckgeld, kosten;
		int bestellt,anzahlMax, zweiEuro=0,einEuro=0,fuenfzigCent=0,zwanzigCent=0,zehnCent=0,fuenfCent=0,zweiCent=0,cent=0;
		
		System.out.print("Ein Getraenk kostet:\t");
		Scanner s = new Scanner(System.in);
		preis = s.nextDouble();
		
		
		System.out.print("Betrag bezahlt:\t\t");
		betrag = s.nextDouble();
		
		
		//Anzahl Getraenke
		anzahlMax = (int) (betrag / preis);
		
		do {
			System.out.print("Anzahl Getraenke:\t");
			bestellt = s.nextInt();
        } while (bestellt>anzahlMax);
		
		
		//Rueckgeld
		kosten = runden(bestellt * preis);
		rueckgeld = runden(betrag - kosten);
		rest=rueckgeld*100;	
	
		//Anzahl der 2 Euro Muenzen mit Rest in Cent
		zweiEuro = (int) rest/200;
		//Neuer Restbetrag 
		rest = runden(rest%200);
		
		einEuro = (int) rest/100;
		rest = runden(rest%100);
		
		fuenfzigCent = (int) rest/50;
		rest = runden(rest%50);
		
		zwanzigCent = (int) rest/20;
		rest = runden(rest%20);
		
		zehnCent = (int) rest/10;
		rest = runden(rest%10);
		
		fuenfCent = (int) rest/5;
		rest = runden(rest%5);
		
		zweiCent = (int) rest/2;
		rest = runden(rest%2);
		
		cent = (int) runden(rest);
		
		//Ausgabe
		System.out.println("Kosten:\t\t"+kosten);
		System.out.println("Rueckgeld:\t"+rueckgeld);
		System.out.println();
		System.out.println("2 Euro: \t"+zweiEuro);
		System.out.println("1 Euro: \t"+einEuro);
		System.out.println("50 Cent:\t"+fuenfzigCent);
		System.out.println("20 Cent:\t"+zwanzigCent);
		System.out.println("10 Cent:\t"+zehnCent);
		System.out.println("5 Cent: \t"+fuenfCent);
		System.out.println("2 Cent: \t"+zweiCent);
		System.out.println("1 Cent: \t"+cent);
		
		 
		
	}
	
	public static double runden(double zahl){
		zahl = zahl * 100;
		zahl = zahl + 0.5;
		int z = (int) zahl;
		double neueZahl = (double) z/100;
				
		return neueZahl;
	}
}
