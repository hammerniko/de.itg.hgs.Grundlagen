package E_Operatoren;


public class Quadrat 
	{
	public static void main(String[] argv)
	 	{
		
		double a = Double.parseDouble (argv[0]); 
		double b = Double.parseDouble (argv[1]); 
		double c = Double.parseDouble (argv[2]);
		
		double p = (b/a);
		double q = (c/a);
		double d = ((p*p)/4-q);	
		
			if (d < 0)
				{
				System.out.println ("Kleiner 0, kein Ergebnis!");
				}
				
			else if (d == 0)
				{
				double x = - (p/2);
				System.out.println ("X = " + x);
				}
				
			else 
				{
				double x1 = - (p/2) + Math.sqrt(d);
				double x2 = - (p/2) - Math.sqrt(d);
				System.out.println ("X1 = " + x1 + ", X2 = " + x2);	
				}
		}			
	}
