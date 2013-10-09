package C1_Schleifen;

import java.util.Scanner;

public class Beispiel {

    public static void main(String[] args) {

        // //Kopfgesteuerte ZŠhlschleife
        for (int i = 100; i >= 1; i = i - 15) {
            System.out.println("Hallo" + i);
        }

        // Kopfgetseuerte while Schleife
        // Anzahl Wiederholungen nicht bekannt
        int a = 100;
        while (a != -4) {
            a = a / 8 + 1 - 5;
            System.out.println(a);
        }

        // Fussgesteuerte Schleife
        // Anzahl der Wiederholungen ist mindestens 1
        String passwort, benutzer;
        Scanner s = new Scanner(System.in);
        boolean loginKorrekt = false;

        do {
            System.out.println("Benutzername:");
            benutzer = s.next();

            System.out.println("Passwort:");
            passwort = s.next();

            if (benutzer.equals("gast") && passwort.equals("hgs")) {
                loginKorrekt = true;
            } else {
                loginKorrekt = false;
            }

        } while (!loginKorrekt);

        System.out.println("Passwort akzeptiert");

    }

}
