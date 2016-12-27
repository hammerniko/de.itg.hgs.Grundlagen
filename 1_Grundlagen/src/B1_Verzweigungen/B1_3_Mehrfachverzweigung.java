package B1_Verzweigungen;

/**
 * In diesem Beispiel wird der Unterschied zwischen
 * mehreren If-Verzwiegungen und einer If-else if-else Verzweigung
 * verdeutlicht.
 * @author hr
 *
 */

public class B1_3_Mehrfachverzweigung {

    //Hauptprogramm
    public static void main(String[] args) {
       
        //Eingabe
        double gewicht = 80; 
        String meldungElseIf="";
        String meldungIf="";
        
        
        //Verarbeitung
        //Prüfung mit if else if und else
        if (gewicht > 100 ) {
        	meldungElseIf="schwer";
        }
        else if(gewicht >90){
        	meldungElseIf="üppig";
        }
        else{
        	meldungElseIf="normal";
        }
       
        
        //prüfung mit mehreren if
        if (gewicht > 100 ) {
        	meldungIf="schwer";
        }
        
        if(gewicht >90 ){
        	meldungIf="üppig";
        }
        else{
        	meldungIf="normal";
        }
       
        
        //Ausgabe
        System.out.println("Ergebnis mit else if:\t\t"+meldungElseIf);
        System.out.println("Ergebnis mit mehreren if:\t"+meldungIf);
        
 
    }
}
