package P5b_AufgabePoymorphismus;

public class Startklasse {

    
    public static void main(String[] args) {
        Mitarbeiter dieMitarbeiter[] = new Mitarbeiter[2];
        
        dieMitarbeiter[0] = new Lehrer("Gohm", "Fritz");
        
        Hausmeister hm = new Hausmeister("Fuhrmann", "Andreas");
        hm.setAnzahlStunden(55);
        
        dieMitarbeiter[1] = hm;
        
       
        
        for (int i = 0; i < dieMitarbeiter.length; i++) {
            System.out.println(dieMitarbeiter[i].gehaltBerechnen());
        }
        

    }

}
