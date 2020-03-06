
package C1_Schleifen;


public class Ggt {
	public static void main (String [] argv) {
		
		    //EINGABE
			int a=45;
			int b=27;
			
			//VERARBEITUNG
			int c=a;
			int d=b;
			while (c!=d) {
				if (c<d) d-=c;
				else c-=d;
			}
			
			//AUSGABE
			System.out.println("Der groesste gemeinsame Teiler von "+a+" und "+b+" ist: "+c);
		
	}
}
			
		
