package D1_Arrays;

public class SortierenDurchAustauschen {

	public static void main(String[] args) {

		// Eingabe
		int merke;
		int[] zahl = { 3, 2, 1, 7, 5 ,78,0,13};
		
		

		// Verarbeitung
		for (int i = 0; i < zahl.length - 1; i++) {
			 for (int j = i + 1; j < zahl.length; j++) {
				 ausgabe(zahl); 
				
				if (zahl[i] > zahl[j]) {
					
					//Tausche
					merke = zahl[i];
					zahl[i] = zahl[j];
					zahl[j] = merke;
					
				}
				
			}
			 
		}
		
		
		//Ausgabe
		ausgabe(zahl);

		
	}

	private static void ausgabe(int[] z) {
		for (int i = 0; i < z.length; i++) {
			System.out.print(z[i]+" ");
		}
		System.out.println();
	}

	

}
