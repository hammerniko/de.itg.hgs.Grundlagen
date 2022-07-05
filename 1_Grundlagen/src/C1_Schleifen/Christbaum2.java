package C1_Schleifen;

public class Christbaum2 {

	public static void main(String[] args) {
		
		/**
		 * Programmieren Sie diesen Christbaum
		 * mithilfe von Schleifen
		 * 
		System.out.println("      *");
		System.out.println("     ***");
		System.out.println("    *****");
		System.out.println("   *******");
		System.out.println("  *********");
		System.out.println(" ***********");
		System.out.println("*************");
		*/

		//Zeilen
		int anzahlZeilen = 6;
		for (int z = anzahlZeilen; z > 0; z--) {
			
			//Leerzeichen in einer Zeile (Anz Wdh 5,4,3,...)
			for (int lz = z-1; lz>0 ; lz--) {
				System.out.print(" ");
			}
			
			//Sterne in einer Zeile (anz Wdh = 1,3,5,...)
			for (int s = 0; s <=(2*anzahlZeilen)-(2*z) ; s++) {
				System.out.print("*");
			}
			
			System.out.println(); //Zeilenumbruch
			
		}//ende äussere Schleife
		
		
	}

}
