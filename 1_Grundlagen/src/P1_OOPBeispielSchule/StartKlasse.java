package P1_OOPBeispielSchule;

public class StartKlasse {

    
    public static void main(String[] args) {
     
     Schueler dieSchueler[] = new Schueler[3];
     
     dieSchueler[0] = new Schueler("Sdrenka", "Steffen");
     dieSchueler[1] = new Schueler("Widmann", "Manuel");
     dieSchueler[2] = new Schueler("Renault", "Yves");
     
     dieSchueler[1].setOrt("Hilzingen");
     
     
     
     Schulklasse tg113 = new Schulklasse("Tg11-3");
     Schulklasse tg123 = new Schulklasse("Tg12-3");
     tg123.setBeschreibung("Jahrgangsstufe 1");
     
     for (int i = 0; i < dieSchueler.length; i++) {
        dieSchueler[i].setSchulklasse(tg123);
   
    }
     
    dieSchueler[1].setSchulklasse(tg113); 
     
    for (int i = 0; i < dieSchueler.length; i++) {
        System.out.println(dieSchueler[i]); ;
   
    }
     
    }

}
