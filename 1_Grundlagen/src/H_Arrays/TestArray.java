package H_Arrays;
public class TestArray {

	
	public static void main(String[] args) {
		
		//Deklaration
		String[] namen = new String[6];
		
			
		//Zuweisung
		namen[0]="Patrick";
		namen[1]="Uli";
		namen[2]="Thorsten";
		namen[3]="Sepp";
		namen[4]="Paul";
		
		
		//Ausgabe
		for (int i = 0; i < namen.length; i=i+2) {
			System.out.println(namen[i]);
		}

	}

}
