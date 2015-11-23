package B1_Verzweigungen;

import java.util.Scanner;

public class NoteBerechnen {
    
    public static void main(String[] args){
        //EINGABE
        Scanner s = new Scanner(System.in);
        System.out.print("Maximal Punkte:");
        double maxPunkte = s.nextDouble();
        
        System.out.print("Erreichte Punkte:");
        double errPunkte = s.nextDouble();
        double note;       
        
        //VERARBEITUNG & AUSGABE
        //maxPunkte und errPunkte gueltig?
        if(maxPunkte>0 && errPunkte<=maxPunkte && errPunkte>0){
            note = -5/maxPunkte*errPunkte+6;
            System.out.println("Ihre Note ist: "+note);
        }
        else{
            System.out.println("Ungueltige Werte");
        }
    }
 }
