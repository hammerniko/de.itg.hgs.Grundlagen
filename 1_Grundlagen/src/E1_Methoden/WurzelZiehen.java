package E1_Methoden;

/**
 * Wurzelziehen mit dem NŠherungsverfahren
 * nach Heron.
 * @param zahl
 * @return wurzel der Zahl
 */
public class WurzelZiehen {

    public static void main(String[] args) {
        System.out.println(wurzel(90));
    }

    
    public static double wurzel(double zahl) {
       
        double x, a;
        a = zahl;
        x = zahl;
        double fehlertoleranz = 0.0000000001;

        //Die Iterationsmethode funktioniert
        //nur mit natŸrlichen Zahlen
        if (zahl >= 0) {

            //Variablen fŸr die Ergebnisse der Iteration
            double x1, x2;

            // Iteriere solange, bis
            // der Unterschied zwischen 2
            // Iterationen kleiner dem
            // gewŸnschten Fehlerwert ist
            do {
                // Iteration n
                x1 = (x + a / x) / 2;
                x = x1;

                // Iteration n+1
                x2 = (x + a / x) / 2;
                x = x2;
                
            } while (x1 - x2 > fehlertoleranz);
            
        } else {
            //Falls eine Zahl kleiner 0 gewaehlt wurde
            return Double.NaN;
        }

        return x;

    }

}
