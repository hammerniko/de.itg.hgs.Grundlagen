package B1_Verzweigungen;

import java.util.Scanner;

public class B1_4_NoteBerechnen {
    
    public static void main(String[] args){
        //EINGABE
    	String meldung="";
        Scanner s = new Scanner(System.in);
        System.out.print("Maximal Punkte:\t\t");
        double pMax = s.nextDouble();
        
        System.out.print("Erreichte Punkte:\t");
        double pErr = s.nextDouble();
        double note;       
        
        //VERARBEITUNG 
        //Sind die eingegebenen Werte gueltig?
        if(pMax<=0){
            meldung = "pMax muss groesser als 0 sein";
        }
        else if(pErr>=pMax){
        	meldung = "pErr darf nicht groesser als pMax sein.";
        }
        else if(pErr<0){
        	meldung = "pErr darf nicht kleiner als 0 sein.";
        }
        
        else{
           note = -5/pMax * pErr + 6;
           meldung = "Ihre Note ist:\t\t"+note;
        }
       
        //Ausgabe
        System.out.println(meldung);
        
        
    }
 }
