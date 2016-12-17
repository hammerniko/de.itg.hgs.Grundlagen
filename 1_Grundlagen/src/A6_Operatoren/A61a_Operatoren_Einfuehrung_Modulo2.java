package A6_Operatoren;
/**Uebung:
 * Letzte Ziffer einer Zahl speichern und anschliessend
 * die letzte Ziffer der Zahl abtrennen 
 * **/

public class A61a_Operatoren_Einfuehrung_Modulo2 {

	public static void main(String[] args) {
		
		//Eingabe
		int zahlenCode = 123;
		
		//Verarbeitung
		int letzteZiffer = zahlenCode % 10;
		int neueZahl = zahlenCode / 10;
		
		//Ausgabe
		System.out.println("zu k�rzender Code:\t"+zahlenCode);
		System.out.println("Letzte Ziffer:\t\t"+letzteZiffer);
		System.out.println("Gek�rzter Code:\t\t"+neueZahl);
	}

}
