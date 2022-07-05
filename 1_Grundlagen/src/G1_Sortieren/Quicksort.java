package G1_Sortieren;

public class Quicksort {

	public static void main(String[] args) {
		int[] zahlen = { 4, 9, 1, 2, 89, 2 };
		int[] zahlensortiert = quicksort(zahlen, 0, zahlen.length - 1, true);

		System.out.println("---Unsortiertes Array?---");
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i]);
		}

		System.out.println("---Sortiertes Array---");
		for (int i = 0; i < zahlensortiert.length; i++) {
			System.out.println(zahlensortiert[i]);
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int[] quicksort(int[] a, int unten, int oben, boolean firstRun) {

		// Damit das original Array nicht verändert wird
		// wird beim ersten Aufruf eine Kopie des Arrays erstellt.
		// Der eigentliche Sortiervorgang wird dann
		// mit der Kopie nochmal aufgerufen und gestartet
		if (firstRun) {
			int[] kopie = a.clone();
			quicksort(kopie, unten, oben, false);
			return kopie;
		}

		int tmp;
		int i = unten;
		int j = oben;
		int x = a[(unten + oben) / 2];

		do {

			while (a[i] < x) {
				i++;
			}

			while (a[j] > x) {
				j--;
			}

			if (i <= j) {
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				i++;
				j--;
			}

		} while (i <= j);

		if (unten < j) {
			quicksort(a, unten, j, false);
		}
		
		if (i < oben) {
			quicksort(a, i, oben, false);
		}

		return a;

	}

}
