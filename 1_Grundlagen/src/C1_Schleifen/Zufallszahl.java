package C1_Schleifen;

public class Zufallszahl {

	/**
	 * Die Methode Math.random() erzeugt eine Zufallszahl zwischen
	 * 0.0 und 0.99.
	 * Die kleinstmšgliche zufallszahl 0.0 * 100 + 1 fŸhrt zu dem Ergebnis zufallszahl = 1
	 * Die grš§tmšgliche zufallszahl 0.99 * 100 = 99.99 --> 99.99 + 1 = 100.99 --> (int) (100.99) = 100
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
       
        int zufallfzahl;
        
        /**
         * Erzeuge eine Zufallszahl zwischen 1 und 100
         * Wiederhole, solange die Zahl ungleich 53 ist.
         */
        do {
            zufallfzahl= (int) (Math.random()*100+1);
            System.out.println(zufallfzahl);
        } while (zufallfzahl!=53);
       
        
        
        

    }

}
