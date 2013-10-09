package D1_Arrays;
public class A2 {

	static int[][] tabelle = new int[3][11];
	public static void main(String[] args) {
		
		for (int x = 0; x <= 10; x++) {
			tabelle[0][x]=x; 	//1ste Spalte
			tabelle[1][x]=x*x;  //2te Spalte
			tabelle[2][x]=x*x*x;
		}
		
		ausgabe();


	}

	private static void ausgabe() {
		for (int x = 0; x <=10; x++) {
			for (int y = 0; y <= 2; y++) {
				System.out.print(tabelle[y][x]+"\t");
			}
			System.out.println();
			
		}
		
	}

}
