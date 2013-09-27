package OOPBeispielSchule;

public class StartKlasse {

    
    public static void main(String[] args) {
        
       Fach[] dieFaecher = new Fach[3];
       
       dieFaecher[0] = new Fach("Deutsch", "D");
       dieFaecher[1] = new Fach("Betriebswirtschaftslehre","BWL","wirtschaftliche Zusammenhänge");

       dieFaecher[0].setBeschreibung("Literatur lesen");
       
       
       
       System.out.println(Fach.getAnzahlFaecher());
       
       System.out.println("----------");
       
      for (int i = 0; i < dieFaecher.length; i++) {
        System.out.println(dieFaecher[i]);
    }
       
    }

}
