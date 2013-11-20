package P5b_AufgabePoymorphismus;

public class Hausmeister extends Angestellte {

    double zulageNachtdienst;
    static final double UEBERSTUNDENSATZ = 40;
    
    public Hausmeister(String name, String vorname) {
        super(name, vorname);
        stundenlohn = 15.80;
        
    }

    

    @Override
    public double gehaltBerechnen() {
        double wert = 0;
        if(anzahlStunden>=40){
            wert = 40 * stundenlohn + (anzahlStunden-40)*UEBERSTUNDENSATZ;
        }
        else{
            wert = anzahlStunden * stundenlohn;
        }
        
        return wert;
    }
    
    
    
    
}
