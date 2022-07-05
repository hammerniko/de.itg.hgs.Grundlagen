package D1_Arrays;

public class Lotto1 {

	public static void main(String[] args) {
		
		//Eingabe
		int[] lotto = new int[6];
				
		//Verarbeitung
		lotto = zieheLottozahlen();
		
		//Ausgabe
		ausgabeLottozahlen(lotto);
		
	}


	
	
	
	
	
	
	

	public static int[] zieheLottozahlen() {
		
		final int LEER = 0;
		
		//Array welches alle moeglichen Lottokugelwerte enthaelt
		int[] lottoZahlenMenge = new int[49];
		
		//index der letzten Kugel
		int letzteKugel = lottoZahlenMenge.length-1;
		
		//Erste Kugel hat den Wert 1, letzte Kugel hat den Wert 49
		initLottozahlenmenge(lottoZahlenMenge);
		
		//Array welches die gefundenen Lottozahlen bekommen soll.
		int[] lotto = new int[6];
		
		//Variable fuer die Zufallszahl
		int zz;
		
		//Variable um eine position einer gefundenen Lottozahl zu merken
		int merke;
		
		//Wiederhole fuer jede Lottozahl einmal
		for (int i = 0; i < lotto.length; i++) {
			
			//Position der gezogenen Lottozahl
			zz = gibZufallszahl(letzteKugel-i);
			
			//Letztes Element des Array lottoZahlenmenge merken
			merke=lottoZahlenMenge[letzteKugel-i];
			
			//Lottozahl speichern
			lotto[i]=lottoZahlenMenge[zz];
			
			//An die Stelle der gez. Lottozahl den Inhalt der letzten Zahl schreiben
			lottoZahlenMenge[zz]=merke;
			
			//Letzte Stelle ungueltig markieren
			lottoZahlenMenge[letzteKugel-i]=LEER;
		}
		
		return lotto;
	}



	


	private static void initLottozahlenmenge(int[] lottoZahlenMenge) {
		for (int i = 0; i < lottoZahlenMenge.length; i++) {
			lottoZahlenMenge[i]=i+1;
		}
		
		
	}



	public static int gibZufallszahl(int max) {
		int zz = (int) (Math.random()*max+1);
		return zz;
	}

	

	private static void ausgabeLottozahlen(int[] pLottozahlen) {
		for (int i = 0; i < pLottozahlen.length; i++) {
			System.out.println(pLottozahlen[i]);
		}
	}

}
