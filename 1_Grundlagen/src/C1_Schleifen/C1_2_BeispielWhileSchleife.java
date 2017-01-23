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

       
		
		int i=1000000;
		
		int anz = 0;
		
		do {
			System.out.println("hALLO");
			i=i/5*3+1;
			anz++;
		}while (i>=10 );
		
		System.out.println("anzahl"+anz);

	}

    

}
