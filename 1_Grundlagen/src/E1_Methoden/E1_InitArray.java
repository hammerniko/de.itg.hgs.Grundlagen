package E1_Methoden;

/**
 * Einfache Methode zur Initialisierung eines eindimensionalen Arrays
 * 
 * @author hr
 *
 */
public class E1_InitArray {

    public static void main(String[] args) {
        int[] lotto = { 1, 4, 13, 25, 33, 35 };
        int[] lotto2 = new int[10];

        lotto2 = getRandomArray(3, 99);

        printArray(lotto);
        printArray(lotto2);

    }

    /**
     * Erzeugt ein Array mit anzahl Elementen welche einen zufaelligen Wert
     * haben der zwischen 1 und dem maxWert liegt
     * 
     * @param anzahl
     *            Die Anzahl der Elemente des Arrays
     * 
     * @param maxWert
     *            Der maximale Zufallswert
     * 
     * @return array Das Array mit Zufallszahlen welches zurueckgegeben wird.
     */
    private static int[] getRandomArray(int anzahl, int maxWert) {
        int zz;
        int[] array = new int[anzahl];

        for (int i = 0; i < array.length; i++) {
            zz = (int) (Math.random() * maxWert + 1);
            array[i] = zz;
        }

        return array;
    }

    /**
     * 
     * @param feld
     *            Array welches der Methode uebergeben wird
     * @param wert
     *            Wert mit welchem das Array initialisiert wird.
     * 
     * @return initialisiertesFeld Initialisiertes Array
     */
    public static int[] initArray(int[] feld, int wert) {

        // Ein neues Array mit derselben Groesse wie feld
        // wird angelegt, da sonst das uebergebene Array veraendert wird.
        int laenge = feld.length;
        int[] initialisiertesFeld = new int[laenge];

        // Initialisieren
        for (int i = 0; i < laenge; i++) {
            initialisiertesFeld[i] = wert;
        }

        // Bei dfer Rueckgabe eines Arrays wird nur der
        // Arrayname angegeben. Der Datentyp muss mit dem
        // Rueckgabewert der Methode uebereinstimmen.
        return initialisiertesFeld;
    }

    /**
     * Gibt den Inhalt eines Arrays in einer Zeile aus.
     * 
     * @param feld
     */
    public static void printArray(int[] feld) {
        for (int i = 0; i < feld.length; i++) {
            System.out.print(feld[i] + " ");
        }
        System.out.println();

    }

}
