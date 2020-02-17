package C1_Schleifen;

import java.util.Scanner;

public class C1_1_BeispielForSchleife {

    public static void main(String[] args) {

        /**
         * Kopfgesteuerte Zaehlschleife (Rueckwaertszaehlen)
         * Sie wird verwendet, wenn die Anzahl der Wiederholgungen
         * bekannt ist. 
         * Startwert i=100 
         * Abbruchbedingung: solange  i>=1 wahr ist, wird gezaehlt
         * Schrittweite: i wird bei jeder Wiederholung um 1 erniedrigt.
         */
    	int z=5;
    	
        for (z = 5; z <= 80; z++) {
        	
        	
            System.out.println("z:" + z);
            
            
        }
        
       z=5;
//        for
//        
//        /**
//         * Kopfgesteuerte ZŠhlschleife (VorwŠrtszŠhlen)
//         * Sie wird verwendet, wenn die Anzahl der Wiederholgungen
//         * bekannt ist. 
//         * Startwert i=0 
//         * Abbruchbedingung: solange  i<=100 wahr ist, wird gezŠhlt
//         * Schrittweite: i wird bei jeder Wiederholung um 2 erhšhtt.
//         */
//    	int i;
//    	
//        for (i = 10; i > 0; i--) {
//        	if(i==5){
//        				break;
//        	}
//            System.out.println("Anzahl:" + i);
//        }
//        
//        
//        System.out.println("Ende bei "+i);
//        
    }

}
