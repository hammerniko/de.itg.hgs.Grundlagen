package G2_Suchen;

public class suchen2 {

	public static void main(String[] args) {
		//Array mit Zahlen
		int[] zahlen = {1,4,7,6,9,74};
		
		//Minimum bestimmen und speichern
		int min = getMinimum(zahlen);
		
		//Maximum bestimmen
		int max = getMaximum(zahlen);
		
		//Durchschnitt bestimmen
		double avg = getAvg(zahlen);
		
		//Index von Wert w
		int w = 9;
		int index = getIndexOf(w, zahlen);
		
		
		//Ausgabe
		System.out.println("Minimum:\t"+min);
		System.out.println("Maximum:\t"+max);
		System.out.println("Durchschnitt:\t"+avg);
		System.out.println("Index von "+w+":\t"+index);


	}

	private static int getIndexOf(int i, int[] zahlen) {
		for (int j = 0; j < zahlen.length; j++) {
			if(i==zahlen[j]) {
				return j;
			}
		}
		return -1;
	}

	private static double getAvg(int[] zahlen) {
		double sum=0;
		for (int i = 0; i < zahlen.length; i++) {
			sum+=zahlen[i];
		}
		return sum/zahlen.length;
	}

	private static int getMaximum(int[] zahlen) {
		int maxfound = zahlen[0];
		for (int i = 0; i < zahlen.length; i++) {
			if(zahlen[i]>maxfound) {
				maxfound=zahlen[i];
			}
		}
		return maxfound;
	}

	private static int getMinimum(int[] zahlen) {
		int minfound = zahlen[0];
		for (int i = 0; i < zahlen.length; i++) {
			if(zahlen[i]<minfound) {
				minfound=zahlen[i];
			}
		}
		return minfound;
	}

}
