package D1_Arrays;

public class Lotto3 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		lotto = gibLottozahlen();
		
		ausgabeArray(lotto);

	}

	private static void ausgabeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

	private static int[] gibLottozahlen() {
		int[] l = new int[6];
		
		
		l[0]=5;
		l[1]=1;
		l[2]=3;
		l[3]=45;
		l[4]=25;
		l[5]=35;
		
		
		
		
		return l;
	}

}
