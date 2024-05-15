package h4_lambda;

/**
 * KA1_lambda
 */
public class KA1_lambda_A2 {

    interface Rectangle{
        public double getArea(double length, double width);
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
       
        System.out.println("Rechteck berechnen");
        double l = 3;
        double w = 4;
        System.out.println("Breite\t=\t"+w+" cm");
        System.out.println("Länge\t= \t"+l+" cm");
        
        
        Rectangle rectangle  = (length,width) -> length*width;
        double area =rectangle.getArea(l,w);
        System.out.println("Area\t=\t"+area+" cm²");
      
    }
    
    /**
     * Addiert 2 Zahlen im Kommaformat und gibt das Ergebnis als
     * Kommazahl zurück
     * 
     * @author hr
     * 
     * @param zahl1
     * Erste Zahl 
     * 
     * @param zahl2
     * Zweite Zahl
     * 
     * @return
     * Ergebnis der Addition
     */
    public double addiere(double zahl1, double zahl2) {
    	return zahl1+zahl2;
    }
}