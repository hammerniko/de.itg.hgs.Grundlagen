package H_Arrays;

public class Namen2 {

    
    public static void main(String[] args) {
        
        //Array deklarieren
        String[] namen = new String[10];
        String[] vornamen = new String[10];
        String merke;
        int pos=0;
        
        //Array initialisieren
        namen[0] = "Meier";
        namen[1] = "Jakobi";
        namen[2] = "MŸller";
        namen[3] = "BŠr";
        namen[4] = "Burger";
        namen[5] = "Keller";
        namen[6] = "Ringer";
        namen[7] = "Bach";
        namen[8] = "Kneip";
        namen[9] = "Mann";
        
        vornamen[0] = "Max";
        vornamen[1] = "Detlef";
        vornamen[2] = "Thomas";
        vornamen[3] = "Martin";
        vornamen[4] = "Michael";
        vornamen[5] = "Tom";
        vornamen[6] = "Ralf";
        vornamen[7] = "Dino";
        vornamen[8] = "Klaus";
        vornamen[9] = "Moritz";
        
        //Array sortieren
        for (int i = 0; i < namen.length-1; i++) {
            for (int j = i+1; j < namen.length; j++) {
                
                
                
                //Alphabetisch sortieren (erst nach Anfangsbuchstabe, dann nach
                //2.tem Buchstaben, wenn erster Buchstabe gleich ist.
                if(namen[i].charAt(0)>namen[j].charAt(0)
                   || (namen[i].charAt(0)==namen[j].charAt(0) &&   namen[i].charAt(1)>namen[j].charAt(1)) 
                        
                        )
                {
                    //tauschen
                    merke = namen[i];
                    namen[i]=namen[j];
                    namen[j]=merke;
                }
                
            }
        }
        
        //Array ausgeben
        for (int i = 0; i < namen.length; i++) {
            System.out.println(namen[i]+" \t"+vornamen[i]);
        }
        
        
        
    }

}
