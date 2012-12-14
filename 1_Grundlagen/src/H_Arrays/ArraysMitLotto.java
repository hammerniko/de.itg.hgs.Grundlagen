package H_Arrays;
public class ArraysMitLotto {

	public static void main(String[] args) {
			
		boolean[] gezogeneZahlen = new boolean[49];                 
		int[] lottoZahlen = new int[6];
				
		for (int i = 0; i < lottoZahlen.length; i++) {
						
			//Wiederhole bis neue Zahl gezogen wird
			do {
				lottoZahlen[i] = (int) (Math.random()*49+1);
	
			} while (gezogeneZahlen[lottoZahlen[i]-1]==true);
			
			gezogeneZahlen[lottoZahlen[i]-1]=true;
			System.out.println(lottoZahlen[i]);
		}//ende for
	}//END MAIN
}//END CLASS
