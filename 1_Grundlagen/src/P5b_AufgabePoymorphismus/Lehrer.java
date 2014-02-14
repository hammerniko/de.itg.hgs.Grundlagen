package P5b_AufgabePoymorphismus;

public class Lehrer extends Mitarbeiter {
    String kuerzel;
    String gehaltsgruppe; 
    
    public Lehrer(String name, String vorname) {
        super(name, vorname);
        gehaltsgruppe = "A13";
    }


    
    
    
    @Override
    public double gehaltBerechnen() {
        double wert=0;
        
        if(gehaltsgruppe.equals("A13")){
            wert = 2800;
        }
        return wert;
    }

}
