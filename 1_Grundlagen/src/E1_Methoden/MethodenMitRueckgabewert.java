package E1_Methoden;

public class MethodenMitRueckgabewert {

    public static void main(String[] args) {
        //Eingabe
        double zahl1 = 4;
        double zahl2 = 11;
        
        //Verarbeitung
        double summe     = addiere(zahl1, zahl2);
        double differenz = subtrahiere(zahl1, zahl2);
        double produkt   = multipliziere(zahl1, zahl2);
        double teil  = dividiere(zahl1, zahl2);
        
        //Ausgabe
        System.out.println("Zahlen:   \t"+zahl1+" "+zahl2);
        System.out.println("Summe=    \t"+summe);
        System.out.println("Differenz=\t"+differenz);
        System.out.println("Produkt=  \t"+produkt);
        System.out.println("Geteilt=  \t"+teil);
    }

    public static double addiere(double zahl1, double zahl2) {
        double returnValue;
        returnValue = zahl1 + zahl2;
        return returnValue;
    }

    
    
    
    
    
    
    
    
    
    
    
    public static double subtrahiere(double zahl1, double zahl2) {
        double returnValue;
        returnValue = zahl1 - zahl2;
        return returnValue;
    }

    public static double multipliziere(double zahl1, double zahl2) {
        double returnValue;
        returnValue = zahl1 * zahl2;
        return returnValue;
    }

    public static double dividiere(double zahl1, double zahl2) {
        double returnValue;
        returnValue = zahl1 / zahl2;

        return returnValue;
    }

}
