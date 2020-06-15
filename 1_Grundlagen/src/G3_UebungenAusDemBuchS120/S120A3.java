package G3_UebungenAusDemBuchS120;

public class S120A3 {
	
	public static void main(String[] args) {
		
		//Einfacher 6-stelliger Beispielcode
		int zifferncode = 123456;
				
		//VERARBEITUNG
		int ersteZiffer = gibErsteZiffer(zifferncode);
		int letzteZiffer = gibLetzteZiffer(zifferncode);
				
		//AUSGABE
		System.out.println(ersteZiffer);
		System.out.println(letzteZiffer);
				
	}

	
	
	
	private static int gibLetzteZiffer(int zifferncode) {
		// hier beginnt Aufgabe 3 Teil 1
		return zifferncode%100;
	}

	private static int gibErsteZiffer(int zifferncode) {
		// hier beginnt Aufgabe 3 Teil 2
		return zifferncode/10000;
	}

}
