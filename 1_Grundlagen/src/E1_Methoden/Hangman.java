package E1_Methoden;

import java.util.Scanner;

public class Hangman {
    static int highscore = 0;
    static long startZeit = System.currentTimeMillis();
    static long endZeit, zwischenzeit, dauer;
    
    static final int RICHTIG = 1;
    static final int FALSCH = 0;

    public static void main(String[] args) {
        // Varriablen initialisieren
        int anzahl = 0;
        String zeichen = "";
        Scanner s = new Scanner(System.in);

        // Wortliste initialisieren
        String wortliste[] = { "windsurfen", "sandmann", "mauseloch", "sprintrennen", "weihnachtsmann", "feierabend",
                "schule", "hirsch", "looser", "heino" };

        // Zufällig ein Wort aus der Liste bestimmen
        String aktWort = gibWort(wortliste);

        // gefundener Buchstabe = 1, offener Buchstabe = 0
        int[] zustand = new int[aktWort.length()];

        do {
            
        
        // Wort ausgeben
        zeigeWort(aktWort, zustand);

        // Buchstabe einlesen
        anzahl++;
        zeichen = "";
        System.out.print(anzahl + ".\nBuchstabe:");
        zeichen = s.next();

        // Ändere den Zustand
        zustand = setzeZustand(aktWort, zustand, zeichen, anzahl);
        
        } while (!istWortVollstaendig(zustand));
        
        System.out.println("Hurra");
        
    }

    private static void bestimmeDauer() {
        endZeit = System.currentTimeMillis();
        dauer = (endZeit - startZeit) / 1000;
    }

    private static String eingabeBuchstabe(int anzahl, Scanner s) {
        String eingegebeneZeichen;
        System.out.print(anzahl + ".\nBuchstabe:");
        eingegebeneZeichen = s.next();
        return eingegebeneZeichen;
    }

    private static String gibWort(String[] dieListe) {
        int zz = (int) (Math.random() * dieListe.length);
        return dieListe[zz];
    }

    public static int[] setzeZustand(String aktWort, int[] zustand, String eingabe, int anzahl) {

        // Wenn das eingegebene Wort stimmt
        if (aktWort.equals(eingabe)) {
            for (int i = 0; i < zustand.length; i++) {
                zustand[i] = 1;
             }
        }

        // Wenn nur ein Zeichen eingegeben wurde
        char ersterBuchstabe = eingabe.charAt(0);
        char[] zeichen = aktWort.toCharArray();

        for (int i = 0; i < zustand.length; i++) {
            if (zeichen[i] == ersterBuchstabe) {
                zustand[i] = RICHTIG;
             }
        }

        return zustand;

    }

    private static void betimmeZwischenzeit() {
        zwischenzeit = System.currentTimeMillis();
        dauer = (zwischenzeit - startZeit) / 1000;
    }

    private static void setHighscore() {
        bestimmeDauer();
        highscore = highscore + (10000 / (int) dauer);
    }

    public static void zeigeWort(String wort, int[] zustand) {

        for (int i = 0; i < zustand.length; i++) {
            if (zustand[i] == 0) {
                System.out.print("_ ");
            } else {
                System.out.print(wort.charAt(i) + " ");
            }
        }

    }

    public static boolean istWortVollstaendig(int[] zustand) {
        for (int i = 0; i < zustand.length; i++) {
            if (zustand[i] == 0) {
                return false;
            }
        }

        return true;

    }

}
