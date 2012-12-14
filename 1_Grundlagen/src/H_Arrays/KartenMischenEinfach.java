package H_Arrays;
public class KartenMischenEinfach {

	public static void main(String[] args) {
		String[] karten = {"HerzAS","Herz7","Herz8","HerzBube", "HerzKönig","HerzDame"};
		int anzkarten = karten.length;
		String[] kartenNeu = new String[anzkarten];
		boolean[] gezogeneKarten = new boolean[anzkarten];
 		
		int z; 
		
		for (int i = 0; i < 3; i++) {
					 
			 do {
				 z = (int) (Math.random()*anzkarten+1);
				 
			} while (gezogeneKarten[z-1]==true);
			 
			 kartenNeu[i] = karten[z-1]; 
			 gezogeneKarten[z-1]=true;
			 
			 System.out.println(kartenNeu[i]);
		 	
			 
			 
		}
		
		
		
 		
 		
 		
		
		
		
	}

}
