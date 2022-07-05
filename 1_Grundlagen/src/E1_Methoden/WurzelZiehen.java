package E1_Methoden;

/**
 * Wurzelziehen mit dem Naeherungsverfahren
 * nach Heron.
 * @author nikolaihammer
 * @param zahl
 * @return wurzel der Zahl
 */
public class WurzelZiehen {

    public static void main(String[] args) {
    	
    	//Zahl aus der die Wurzel gezogen werden soll
    	double z = 2;
    	
    	//Methode nach Heron
        double w1 = wurzel(z);
        
        //Methode aus Java-Bibliothek
        double w2 = Math.sqrt(z);
        
        System.out.println("w1="+w1);
        System.out.println("w2="+w2);
        
    }
   
    
    
    
    
    
    
    
    
    public static double wurzel(double zahl) {
       
        double x, a;
        a = zahl;
        x = zahl;
        double fehlertoleranz = 0.0000000000000000001;

        //Die Iterationsmethode funktioniert
        //nur mit natuerlichen Zahlen
        if (zahl >= 0) {

            //Variablen fuer die Ergebnisse der Iteration
            double x1, x2;

            // Iteriere solange, bis
            // der Unterschied zwischen 2
            // Iterationen kleiner dem
            // gewuenschten Fehlerwert ist
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
