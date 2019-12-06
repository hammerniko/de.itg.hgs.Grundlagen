package A6_Operatoren;
/*
Einfache uebungen
zu Operatoren
*/

public class A61_Operatoren_Einfuehrung {

	public static void main(final String[] args) {

		// uebung 2:
		// Deklarieren Sie die Zahl 255 als Hexadezimalzahl
		// und geben Sie diese aus
		// Was stellen Sie fest?
//         int hexadezimalZahl=0x0A;
//         System.out.println("\nDie Hexadezimalzahl:"+hexadezimalZahl);
//         
//         String hex = "0A";
//         int hexZahl = Integer.parseInt(hex, 16);
//         

		// uebung 3:
		// Reihenfolge der Auswertung in Ausdruecken
		// Welchen Wert hat b?
		// Begruenden Sie das Ergebnis.
//		int a = 5;int b=3;
//		a++;
//		b++;
//
//		 System.out.println("\nb: " +a);
//		 System.out.println("\nb: " +b);

		// uebung 4:
		// Welchen Wert hat z4? Begruenden Sie Ihr ergebnis.
//         int a4=13;     //1101
//         int b4=3;      //0011 
//         int z4 = a4&b4;//0001
//         System.out.println("\nz4 "+z4);

		// uebung 5:
		// Welchen Wert hat z5? Begruenden Sie Ihr ergebnis.
//         int a5=11;  //1011
//         int b5=9;   //1001
//         int z5;     //1011 
//         
//         z5=a5|b5;
//         System.out.println("\nz5 "+z5);

		// uebung 6:
		// Welche Ergebnisse ergeben sich bei den Pruefsummen 1-4?

//         boolean pruefSumme1,pruefSumme2,pruefSumme3,pruefSumme4;
//         int a6 = 9;
//         int b6 = 99;
//         pruefSumme1 = a6<10 && b6>10;
//         pruefSumme2 = a6<10 || b6>10;
//         pruefSumme3 = a6<10 && b6<10;
//         pruefSumme4 = a6<10 && b6<10;
//         System.out.println("\npruefSumme1 "+pruefSumme1);
//         System.out.println("pruefSumme2 "+pruefSumme2);
//         System.out.println("pruefSumme3 "+pruefSumme3);
//         System.out.println("pruefSumme4 "+pruefSumme4);
//         

		// uebung 7:
		// Anwenden mathematischer Methoden aus der Klasse Math.*
//         double pi = Math.PI;
//         double wi1 = Math.sin(pi);  //=0
//         double wi2 = Math.cos(pi/2);
//         
//         
//         
//         double alpha = (wi2*360.0) / (2.0*pi);
//         System.out.println(alpha);   
//         
//         
//         double wi3 = Math.sin(pi/4);
//         double wi4 = Math.cos(pi);
//         double wi5 = Math.cos(pi/2);
//         double wi6 = Math.cos(pi/4);
//
//         System.out.println("\nwi1 "+ wi1);
//         System.out.println("wi2 "+ wi2);
//         System.out.println("wi3 "+ wi3);
//         System.out.println("wi4 "+ wi4);
//         System.out.println("wi5 "+ wi5);
//         System.out.println("wi6 "+ wi6);
//         

		// uebung 8: Schreiben Sie ein Programm zur Berechnung eines Winkels
		// aus einem Bogenmass

//         //UeBUNG 9
		int zahl = 15238;
		int komplement = ~15238 + 1;

		System.out.println(zahl);
		System.out.println(komplement);

	}
}
