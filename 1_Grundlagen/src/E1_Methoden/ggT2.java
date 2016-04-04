package E1_Methoden;

public class ggT2 {

	public static void main(String[] args) {
		System.out.println(ggT(12, 18));
	}
	
	
	
	public static int ggT(int z1, int z2){
		int merke = 0;
		
		for (int i = 1; i <= z1; i++) {
			
			if(z1%i==0 && z2%i==0){
				merke = i;
			}
			
		}
		
		
		
		
		return merke;
		
	}

}
