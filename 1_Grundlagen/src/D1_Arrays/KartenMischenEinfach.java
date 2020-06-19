package D1_Arrays;
public class KartenMischenEinfach {

	public static void main(String[] args) {
		String[] karten = {"1","2","3","4", "5","6"};
		int anzkarten = karten.length;
		String[] kartenNeu = new String[anzkarten];
		boolean[] gezogeneKarten = new boolean[anzkarten];
 		
		int z; 
		
		for (int i = 0; i < karten.length; i++) {
					 
			 do {
				 z = (int) (Math.random()*anzkarten+1);
				 
			} while (gezogeneKarten[z-1]==true);
			 
			 kartenNeu[i] = karten[z-1]; 
			 gezogeneKarten[z-1]=true;
			 
			
		 	
			 
			 
		}
		
		
		
 		for (int i = 0; i < gezogeneKarten.length; i++) {
			System.out.println(kartenNeu[i]);
		}
 		
 		
 		
		
		
		
	}

}
