package B1_Verzweigungen;

import java.util.Scanner;

public class TageDesMonats {

    public static void main(String[] args) {
        
        int tage = gibAnzahlTageDesMonats(2, 2004);
        
       System.out.println("Der Monat hat "+tage+" tage.");
    }//Ende main()

    
    
    
    
    
    
    
    
	private static int gibAnzahlTageDesMonats(int monat, int jahr) {
		int tage=0; 
		
		switch (monat) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            tage = 31;
            break;

        case 4:
        case 6:
        case 9:
        case 11:
            tage = 30;
            break;

        case 2:
            if (jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0)) {
            	//Schaltjahr
                tage = 29;
            } else {
            	//kein Schaltjahr
                tage = 28;
            }

        }// Ende Switch
		return tage;
	}
}
