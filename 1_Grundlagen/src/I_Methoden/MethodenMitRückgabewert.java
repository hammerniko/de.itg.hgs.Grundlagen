package I_Methoden;

public class MethodenMitRŸckgabewert {

    public static void main(String[] args) {
        System.out.println("Summe     = " + addiere(4, 22));
        System.out.println("Differenz = " + subtrahiere(4, 22));
        System.out.println("Produkt   = " + multipliziere(4, 22));
        System.out.println("Division  = " + dividiere(4, 0));
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
