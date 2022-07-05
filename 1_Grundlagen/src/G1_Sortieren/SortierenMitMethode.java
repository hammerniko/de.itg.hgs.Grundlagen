package G1_Sortieren;

public class SortierenMitMethode {

	public static void main(String[] args) {
		//Array anlegen mit 5 Zahlen
		int[] z = {9,5,12,3,1};
				
		//Ausgabe des originalen Arrays
		ausgabe(z);
		
		//Neues Array wird sortiertes array zugewiesen
		int[] sortedZ = sort(z);
		
		//Ausgabe des Sortierten Arrays
		ausgabe(sortedZ);
	}
	
	private static int[] sort(int[] z) {
		
		//Clone des Arrays erstellen
		int[] copy = z.clone();
		int merke;
		//Clone sortieren
		for (int j = 0; j < copy.length; j++) {
			for (int i = j+1; i < copy.length; i++) {
				if(copy[i]<copy[j]) {
					merke = copy[j];
					copy[j]=copy[i];
					copy[i]=merke;
				}
			}
		}	
		
		//Sortierten Clone zurückgeben
		return copy;
	}
	
	private static void ausgabe(int[] z) {
		for (int i = 0; i < z.length; i++) {
			System.out.print(z[i]+",");
		}
		System.out.println("\n-----");
	}

}
