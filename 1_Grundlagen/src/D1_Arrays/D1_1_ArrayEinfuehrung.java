package D1_Arrays;

public class D1_1_ArrayEinfuehrung {
	
	public static void main(String[] args) {
		
		
 		Object[] dieObjekte = new Object[10];
		
 		dieObjekte[0]="Hammer";
 		dieObjekte[1]=new Integer(5);
		
		
		
	}

	private static void ausgabeArray(int[] pArray) {
		for (int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i]);
		}
		
	}

	private static int[] initArray(int initValue, int[] pArray) {
		
		//Kopie erstellen
		int[] kopie = pArray.clone();
		
		for (int i = 0; i < kopie.length; i++) {
			kopie[i]=initValue;
		}
		System.out.println("-----------------");
		
		return kopie;
	}
}
