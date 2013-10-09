package D1_Arrays;

public class A1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final int ZEILEMAX=4;
		final int SPALTEMAX=2;
		
		String[][] meineKlasse = new String[ZEILEMAX][SPALTEMAX];
		
		meineKlasse[0][0]="Hans";
		meineKlasse[0][1]="Maier";
				
		meineKlasse[2][0]="Peter";
		meineKlasse[2][1]="Müller";
		
		for (int zeile = 0; zeile < ZEILEMAX; zeile++) {
			for (int spalte = 0; spalte < SPALTEMAX; spalte++) {
				System.out.print(meineKlasse[zeile][spalte]+" ");
			}
			System.out.println();
		}
			
		
		
	}

}
