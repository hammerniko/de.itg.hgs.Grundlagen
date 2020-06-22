package D1_Arrays;
public class KartenMischenEinfach {

	static String[] karten = {"1","2","3","4", "5","6"};
	static int anzkarten = karten.length;
	static String[] kartenNeu = new String[anzkarten];
	static boolean[] gezogeneKarten = new boolean[anzkarten];
	
	
	public static void main(String[] args) {
		
 		
		mischeKarten();
		
		
		
 		for (int i = 0; i < gezogeneKarten.length; i++) {
			System.out.println(kartenNeu[i]);
		}
 		
 		
 		
		
		
		
	}


	
	
	
	
	public static void mischeKarten() {
		int z; 
		
		for (int i = 0; i < karten.length; i++) {
					 
			 do {
				 z = gibZufallszahl();
				 
			} while (gezogeneKarten[z-1]==true);
			 
			 kartenNeu[i] = karten[z-1]; 
			 gezogeneKarten[z-1]=true;
			 
			
		 	
			 
			 
		}
	}






	public static int gibZufallszahl() {
		int z;
		z = (int) (Math.random()*anzkarten+1);
		return z;
	}

}
