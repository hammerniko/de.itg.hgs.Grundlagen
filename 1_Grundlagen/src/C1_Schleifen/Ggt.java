package C1_Schleifen;


public class Ggt {
	public static void main (String [] argv) {
		
			int a=1350;
			int b=125;	
			int c=a;
			int d=b;
			while (c!=d) {
				if (c<d) d-=c;
				else c-=d;
			}
			System.out.println("Der groesste gemeinsame Teiler von "+a+" und "+b+" ist: "+c);
		
	}
}
			
		
