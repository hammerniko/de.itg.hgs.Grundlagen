package E1_Methoden;

/*
 * Iterative Methode um primzahlen von 2 bis k 
 * auszugeben.
 * 
 */

public class Primzahlen {
	
	public static void main(String[] args) {
		
		for (int k = 2; k < 10000; k++) {
			if(istPrimzahl(k)){
				System.out.println(k);
			}
		}				
	}

	private static boolean istPrimzahl(int i) {
		
		boolean value = true;
		int teiler = i;
		
		do {
			teiler = teiler - 1;			
			if(i%teiler == 0){
				value = false;
			}
			
		} while (teiler > 2);
		
		return value;
	}
	
	
}
