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

     
		
		int i=0;
		int anz = 0;
		
		//Wiederhole solange, bis eine 6 geworfen wird
		while (i!=6) {
			
			//Zufällige Zahl zwischen 1 und 6
			i = (int) (Math.random()*10+1);
			System.out.println("Gewuerfelt:"+i);
			
			//Anzahl würfe um 1 erhöhen
			anz++;
		}
		
		System.out.println("anzahl Würfe: "+anz);

	}

    

}
