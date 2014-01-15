package E1_Methoden;

public class Rechner {

    public static void main(String[] args) {
        int ergebnis = addiere(3, 4);
        ausgabe(ergebnis);
   }
    
    public static int addiere(int z1, int z2){
        //Eingabe
        int returnValue;
        
        //Verarbeitung
        returnValue = z1+z2;
        
        //RŸckgabe
        return returnValue;
    }
    
        
    public static void ausgabe(int wert){
        System.out.println(wert);
    }
    

}
