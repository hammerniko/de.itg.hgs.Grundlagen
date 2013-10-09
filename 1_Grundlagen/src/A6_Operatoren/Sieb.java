package A6_Operatoren;


public class Sieb 
	{
	public static void main(String[] argv)
	 	{
		int n = Integer.parseInt (argv[0]); 
		
		int zahlenreihe[] = new int[n-1];
		
		for (int i=0; i<(n-1); ++i) 
			{
			zahlenreihe[i]=i+2;
			}
		
		boolean bool[] = new boolean [n-1];
		
		for (int i=0; i<(n-1); ++i) 
			{
			if (bool[i])
			continue;
			for (int j=i+1;j<(n-1);++j)
				{
				if (zahlenreihe[j] % zahlenreihe[i] == 0)
					{
					bool[j]=true;
					}
				}
			}
		for (int i=0; i<(n-1); ++i) 
			{
			if (!bool[i])
				System.out.print (zahlenreihe[i]+", ");
			}
		
							
				
		
		}			
	}
	
