package B1_Verzweigungen;

import java.util.Scanner;

public class B1_4_NoteBerechnen {
    
    public static void main(String[] args){
        //EINGABE
    	String meldung="";
        Scanner s = new Scanner(System.in);
        System.out.print("Maximal Punkte:\t\t");
        double pMax = s.nextDouble();
        boolean istEingabeGueltuig=true;
        
        System.out.print("Erreichte Punkte:\t");
        double pErr = s.nextDouble();
        
        double note;       
        
        //VERARBEITUNG 
        //Sind die eingegebenen Werte gueltig?
        if(pMax<=0){
            meldung = meldung + "pMax muss groesser als 0 sein";
            istEingabeGueltuig = false;
        }
        
        if(pErr>pMax){
        	meldung = meldung + "\npErr darf nicht groesser als pMax sein.";
        	istEingabeGueltuig = false;
        }
        if(pErr<0){
        	meldung = meldung + "\npErr darf nicht kleiner als 0 sein.";
        	istEingabeGueltuig = false;
        }
        
       
        if(istEingabeGueltuig){
           note = -5/pMax * pErr + 6;
           meldung = "Ihre Note ist:\t\t"+note;
        }
       
        //Ausgabe
        System.out.println(meldung);
        
        
    }
 }
