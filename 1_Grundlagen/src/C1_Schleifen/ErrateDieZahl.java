package C1_Schleifen;

import java.util.Scanner;


public class ErrateDieZahl {
	
	public static void main(String[] args) {
		
	    //Eingabe
		Scanner s = new Scanner(System.in);
		
		int anzahlVersuche = 0;
		int zz,zahl,diff,diffVorher=100;
		
		zz = (int) (Math.random()*100+1);
		
		
		do {
			System.out.println("-----------------");
			System.out.print("Raten Sie: ");
			zahl = s.nextInt();
			
			diff = Math.abs(zz-zahl);
			//System.out.println(zz+" "+zahl+" "+diff);
			
			if(diff<diffVorher){
				diffVorher = diff;
				System.out.println("heiss");
			}
			else if (diff==diffVorher){
				System.out.println("lauwarm");
				
			}
			else{
				System.out.println("kalt");
			}
			
			anzahlVersuche++;
					
		} while (diff != 0);
		
		System.out.println("Sie haben gewonnen mit "+anzahlVersuche+" Versuchen");
		
	}

}
