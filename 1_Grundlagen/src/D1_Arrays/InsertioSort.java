package D1_Arrays;

public class InsertioSort {

	public static void main(String[] args) {
		int[] meineZahlen = {34,45,1,23,78};
		ausgabe(meineZahlen);
		
		meineZahlen = insertionSort(meineZahlen);
		ausgabe(meineZahlen);

	}
	
	private static void ausgabe(int[] meineZahlen) {
		for (int i = 0; i < meineZahlen.length; i++) {
			System.out.print(meineZahlen[i]+" ");
		}
		System.out.println();
		
	}

	public static int[] insertionSort(int[] zahlen){
		int merke;
		int s;
		for (int i = 1; i < zahlen.length; i++) {
			merke = zahlen[i];
			s=0;
			
			//Einfuegestelle suchen
			while (zahlen[s]<merke) {
				s = s+1;
			}
			
			//verschieben
			for (int t = i; t>=s+1; t--) {
				zahlen[t] = zahlen[t-1];
				
			}
			
			//einfuegen
			zahlen[s] = merke;
			
		}
		
		return zahlen;
		
	}

}
