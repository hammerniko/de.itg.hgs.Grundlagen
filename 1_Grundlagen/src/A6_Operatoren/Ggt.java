package A6_Operatoren;


public class Ggt {
	public static void main (String [] argv) {
		if (argv.length!=0){
			int a=Integer.parseInt(argv[0]);
			int b=Integer.parseInt(argv[1]);	
			int c=a;
			int d=b;
			while (c!=d) {
				if (c<d) d-=c;
				else c-=d;
			}
			System.out.println("Der groesste gemeinsame Teiler von "+a+" und "+b+" ist: "+c);
		}
		else System.out.println("Bitte zwei Parameter angeben");
		
	}
}
			
		
