package F4_JunitTestNotenrechner;

public class Notenrechner {
    
    //Objektattribute
    double pErr;
    double pMax;
    double note;
    String meldung;
    
    //Konstanten
    public static final String FEHLER_PERR_GROESSER_PMAX="pErr darf nicht groesser als pMax sein.";
    public static final String FEHLER_PMAX_KLEINER_NULL="pMax muss groesser als 0 sein";   
    public static final String FEHLER_PERR_KLEINER_NULL="pErr muss groesser als 0 sein";   
    public static final String MELDUNG_NOTE="Ihre Note ist:\t\t";   
    
    
    public String berechneNote(double pErr, double pMax){
        this.pErr = pErr;
        this.pMax = pMax;
        
        //VERARBEITUNG 
        if(pMax<=0){
            meldung = FEHLER_PMAX_KLEINER_NULL;
        }
        else if(pErr>pMax){
            meldung = FEHLER_PERR_GROESSER_PMAX;
        }
        else if(pErr<0){
            meldung = FEHLER_PERR_KLEINER_NULL;
        }
        
        else{
           note = -5/pMax * pErr + 6;
           meldung = MELDUNG_NOTE+note;
        }
        return meldung;
    }
 }
