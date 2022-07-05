package F4_JunitTestNotenrechner;

public class Start {

    public static void main(String[] args) {
        
        //Notenrechnerobjekt erstellen
        Notenrechner nr = new Notenrechner();
        
        //Ein Testergebnis des Notenrechnerobjektes speichern
        String testnote = nr.berechneNote(50, 50);
        
        //Ergebnis ausgeben
        System.out.println(testnote);

    }

}
