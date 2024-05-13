package A4_Konstante;

public class KonstanteAnlegen implements Physik{
	 
    public static void main(String[] args) {
       
        // Eingabe
    	//final macht aus einer VAriablen eine Konstante
    	//Konstanten werden komplett in Grossbuchstaben geschrieben
    	//Werte Konstanten koennen nicht mehr geaendert werden
    	
        double kraft;
        double masse=10;
        
        //Verarbeitung
        kraft = masse * NORMALFALLBESCHLEUNIGUNG;
     
        //Ausgabe
        System.out.println(kraft);

    }

}
