package F_Verzweigungen;

import java.util.Scanner;

public class NoteLinear {

    public static void main(String[] args) {

        // EINGABE
        Scanner s = new Scanner(System.in);
        double punkteErreicht, punkteMax, note;
        String meldung;

        System.out.print("Punkte maximal:\t");
        punkteMax=s.nextDouble();
        
        System.out.print("Punkte erreicht:\t");
        punkteErreicht=s.nextDouble();
        
        //VERARBEITUNG
        if(punkteMax>punkteErreicht && punkteMax>0 && punkteErreicht>=0){
            note = -5/punkteMax * punkteErreicht + 6;
            meldung = "Ihre Note: \t"+note;
        }
        else{
            meldung = "ungültige Eingabe";
        }
        
        //AUSGABE
        System.out.println(meldung);
        
    }

}
