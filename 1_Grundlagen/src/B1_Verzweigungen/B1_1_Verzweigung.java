package B1_Verzweigungen;

import java.util.Scanner;

public class B1_1_Verzweigung {

    public static void main(String[] args) {

        // EINGABE
        double gewicht = 30;
        String meldung="";

        // VERARBEITUNG
        if (gewicht == 30) {
            meldung="Das gewicht ist genau 30 kg";
        }
        else{
        	meldung="Das Gewicht entspricht nicht 30kg";
        }
         
        
        //Ausgabe
        System.out.println(gewicht);
        System.out.println(meldung);

    }

}
