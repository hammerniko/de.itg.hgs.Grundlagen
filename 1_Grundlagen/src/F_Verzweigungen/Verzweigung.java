package F_Verzweigungen;

import java.util.Scanner;

public class Verzweigung {

    public static void main(String[] args) {

        // EINGABE
        Scanner s = new Scanner(System.in);
        System.out.print("Gewicht: ");
        double gewicht = s.nextDouble();

        // VERARBEITUNG
        System.out.println(gewicht);

        if (gewicht == 30) {
            System.out.println("Das gewicht ist genau 30 kg");
        }
         
        else {
            System.out.println("Gewicht hat einen anderen Wert als 30kg");
        }

        System.out.println("Programmende");

    }

}
