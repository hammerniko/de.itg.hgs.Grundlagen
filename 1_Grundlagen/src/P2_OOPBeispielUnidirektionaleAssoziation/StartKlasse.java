package P2_OOPBeispielUnidirektionaleAssoziation;

public class StartKlasse {

  
    public static void main(String[] args) {
        //Erzeugen der Objekte
        Schueler s1 = new Schueler();
        Schulklasse tg113 = new Schulklasse();
        
        //Setzen einer Assoziation
        s1.setSchulklasse(tg113);
        

    }

}
