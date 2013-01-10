package F_Verzweigungen;

import java.util.Scanner;

public class TageDesMonats {

    public static void main(String[] args) {
        // Eingabe
        Scanner s = new Scanner(System.in);
        int monat, jahr, tage = 0;

        System.out.print("Jahr:");
        jahr = s.nextInt();

        System.out.print("Monat:");
        monat = s.nextInt();

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
                tage = 29;
            } else {
                tage = 28;
            }

        }// Ende Switch
        
       System.out.println("Der Monat hat "+tage+" tage.");
    }//Ende main()
}
