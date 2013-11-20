package P52_AufgabePoymorphismus;

public class Lehrer extends Mitarbeiter {

    public Lehrer(String name, String vorname) {
        super(name, vorname);
        gehaltsgruppe = "A13";
    }


    String kuerzel;
    String gehaltsgruppe;
    
    
    @Override
    public double gehaltBerechnen() {
        double wert=0;
        
        if(gehaltsgruppe.equals("A13")){
            wert = 2800;
        }
        return wert;
    }

}
