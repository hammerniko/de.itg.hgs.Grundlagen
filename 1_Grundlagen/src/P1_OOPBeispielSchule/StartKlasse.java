package P1_OOPBeispielSchule;

public class StartKlasse {

    
    public static void main(String[] args) {
     
     //Schuelerobjekte anlegen
     Schueler dieSchueler[] = new Schueler[3];
     
     dieSchueler[0] = new Schueler("Sdrenka", "Steffen");
     dieSchueler[1] = new Schueler("Widmann", "Manuel");
     dieSchueler[2] = new Schueler("Renault", "Yves");
     
     //Attribute eines Schülers ändern
     dieSchueler[1].setOrt("Hilzingen");
          
     //Klassenobjekte anlegen
     Schulklasse dieSchulklassen[] = new Schulklasse[3];
     dieSchulklassen[0] = new Schulklasse("Tg11-3");
     dieSchulklassen[1] = new Schulklasse("Tg12-3");
     dieSchulklassen[2] = new Schulklasse("Tg13-3");
     
     //Attribute einer Klasse ändern
     dieSchulklassen[1].setBeschreibung("Jahrgangsstufe 1");
     
     //Alle Schueler einer Klasse zuordnen
     for (int i = 0; i < dieSchueler.length; i++) {
        dieSchueler[i].setSchulklasse(dieSchulklassen[1]);
        System.out.println(dieSchueler[i]);
   
    }
     
    //Einen Schüler in eine andere Klasse versetzen
    dieSchueler[1].setSchulklasse(dieSchulklassen[0]);
     
  
    //Ausgabe der Schulklassendaten
    for (int i = 0; i < dieSchulklassen.length; i++) {
        System.out.println(dieSchulklassen[i]);
    }
     
     
    }

}
