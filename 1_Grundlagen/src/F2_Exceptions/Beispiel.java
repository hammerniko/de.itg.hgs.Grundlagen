package F2_Exceptions;

public class Beispiel {
	
	public static void main(String[] args) {
		
		double ergebnis=0;
		try {
			//kritischer Code
			ergebnis = 3/0;
	        
        } catch (Exception e) {
        	e.printStackTrace();
        	//wird ausgefuehrt, wenn im try-Block
        	//eine Exception auftritt
	        System.out.println("Teilen durch 0 ist nicht erlaubt.");
        }
		finally{
			//wird immer ausgefuehrt
			System.out.println("done");
		}
		System.out.println(ergebnis);
		
		
	}
}
