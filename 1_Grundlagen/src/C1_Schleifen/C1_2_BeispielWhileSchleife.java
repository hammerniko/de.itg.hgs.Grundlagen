package C1_Schleifen;

import java.util.Scanner;
/** 
 *  Kopfgetseuerte while Schleife
 *  Wird verwendet wenn die Anzahl Wiederholungen nicht bekannt ist.
 *  Abbruchbedingung: a!=-4
 *  Solange die Abbruchbedingung wahr ergibt, wird wiederholt.
 *  Ist die Abbruchbedingung von Beginn an flasch, wird
 *  die Schleife komplett Ÿbersprungen.
 */
public class C1_2_BeispielWhileSchleife {

    public static void main(String[] args) {

       
		
		int i=10000000;
		
		int anz = 0;
		
		while (i>1) {
			System.out.println("hALLO");
			i=i/5*3+1;
			anz++;
		}
			
		
		
		System.out.println("anzahl"+anz);

	}

    

}
