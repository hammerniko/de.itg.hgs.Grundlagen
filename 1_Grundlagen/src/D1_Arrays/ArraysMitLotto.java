package D1_Arrays;
public class ArraysMitLotto {

	public static void main(String[] args) {
		
		//Array für 6 Lottozahlen erstellen
		boolean[] gezogeneZahlen = new boolean[49];                 
		int[] lottoZahlen = new int[6];
		
		//6 Lottozahlen ziehen
		for (int i = 0; i < lottoZahlen.length; i++) {
			//Zufallszahl zwischen 1 un 49 erstellen (keine doppelt)
			do {
				lottoZahlen[i] = (int) (Math.random()*49+1);
			} while (gezogeneZahlen[lottoZahlen[i]-1]);
			
			//Merken einer gezogenen Lottozahl
			gezogeneZahlen[lottoZahlen[i]-1]=true;
						
			//Ausgabe der Lottozahlen
			System.out.println(lottoZahlen[i]);
		}//ende for
	}//END MAIN
}//END CLASS
