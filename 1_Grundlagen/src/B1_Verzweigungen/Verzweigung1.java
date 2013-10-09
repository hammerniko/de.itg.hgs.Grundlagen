package B1_Verzweigungen;

import java.util.Scanner;

public class Verzweigung1 {

    public static void main(String[] args) {

        System.out.println("Kennowrt:");
        Scanner s = new Scanner(System.in);
        String name = s.next();

        if (name.length() >= 5) {
            System.out.println("Ihr Kennwort hat mehr als 5 Zeichen");
            if (name.equals("Maier")) {
                System.out.println("Ihr Name: Maier");
            }

            else {
                System.out.println("SIE HEISSEN NICHT MAIER");

            }

        } else {
            System.out.println("BITTE MIND 5 ZEICHEN");
        }

        System.out.println("Programmende");

    }

}
