package H_Arrays;

public class Lotto {

	public static void main(String[] args) {
		
		
		ausgabeLottozahlen(ziehe6aus49());
		
		
	}//end main
	
	public static int[] sortiereLottoZahlen(int[] dieLottozahlen){
		System.out.println("sortiere...");
		
		for (int i = 0; i < dieLottozahlen.length-1; i++) {
			for (int j = i+1; j < dieLottozahlen.length; j++) {
				
			}
		}
		
		
		
		
		return dieLottozahlen;
	}
	

	public static int[] ziehe6aus49() {
		int[] dieLottoZahlen = new int[6];
		boolean[] gezogeneZahlen = new boolean[49];

		// Zähle von 0 bis 5
		for (int i = 0; i < dieLottoZahlen.length; i++) {
			// Wiederhole solange bis keine vorhandene Zahl
			// gezogen wird
			int z = 0;

			do {
				// ziehe eine Zufallszahl zw. 1 und 49
				dieLottoZahlen[i] = (int) (Math.random() * 49 + 1);
				z++;
				
			} while (gezogeneZahlen[dieLottoZahlen[i] - 1] == true);

			// Merke die gerade gezogene Zahl
			gezogeneZahlen[dieLottoZahlen[i] - 1] = true;
		
		}// end for
		
		dieLottoZahlen = sortiereLottoZahlen(dieLottoZahlen);
	
		return dieLottoZahlen;
	}
	
	public static void ausgabeLottozahlen(int[] dieLottozahlen){
		for (int i = 0; i < dieLottozahlen.length; i++) {
			System.out.println(dieLottozahlen[i]);
		}
	}
	

}//ende class
