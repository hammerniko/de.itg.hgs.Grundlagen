package D1_Arrays;

public class MinSort {

	public static void main(String[] args) {
		int z1[] = { 1, 5, 0, 10, 4 };
		ausgabeZahlen(z1);
		System.out.println("----------");
			int z2[] = minSort(z1);

	}

	public static int[] minSort(int[] zahlen) {
	int z[] = zahlen.clone();
		int merke;
		int minIndex;
		
		//Suche index mit Minimalem Wert
		for (int i = 0; i < z.length-1; i++) {
			
			//erste Zahl mit minimalem Index festlegen
			minIndex = i;
			
			for (int j = i+1; j < z.length; j++) {
						if(z[j]<z[minIndex]) {
						minIndex = j;
				}
			}
			
			//setze Zahl mit Mininmum an Pos i
			merke = z[i];
			z[i] = z[minIndex];
			z[minIndex] = merke;
			
			System.out.print("i="+i+" ");
			ausgabeZahlen(z);
		}
		return z;
	}
	
	
	
	
	public static void ausgabeZahlen(int[] z) {
		for (int i = 0; i < z.length; i++) {
			System.out.print(z[i]+" ");
		}
		System.out.println();
	}

}
