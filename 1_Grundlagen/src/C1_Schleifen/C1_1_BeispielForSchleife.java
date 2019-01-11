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
    	
    	
//        for (int i = 10; i > 1; i=i-1) {
//        	
//        	
//            System.out.println("i:" + i);
//            
//            
//        }
        
       
        
        
        /**
         * Kopfgesteuerte Zählschleife (Vorwärtszählen)
         * Sie wird verwendet, wenn die Anzahl der Wiederholgungen
         * bekannt ist. 
         * Startwert i=0 
         * Abbruchbedingung: solange  i<=100 wahr ist, wird gezählt
         * Schrittweite: i wird bei jeder Wiederholung um 2 erhöhtt.
         */
    	int i;
    	
        for (i = 10; i > 0; i--) {
        	if(i==5){
        				break;
        	}
            System.out.println("Anzahl:" + i);
        }
        
        
        System.out.println("Ende bei "+i);
        
    }

}
