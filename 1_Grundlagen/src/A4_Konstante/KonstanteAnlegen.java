package A4_Konstante;

public class KonstanteAnlegen {

    
    public static void main(String[] args) {
       
        //Eingabe
        final double ERDFALLBESCHLEUNIGUNG = 9.81;
        double kraft;
        double masse=10;
          
        
        //Verarbeitung
        kraft = masse * ERDFALLBESCHLEUNIGUNG;
        
        //Ausgabe
        System.out.println(kraft);
        
        

    }

}
