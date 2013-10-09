package D1_Arrays;

public class Namen1 {

    
    public static void main(String[] args) {
        
        //Array deklarieren
        String[] namen = new String[10];
        String merke;
        
        //Array initialisieren
        namen[0] = "Dieter";
        namen[1] = "Jakobi";
        namen[2] = "MŸller";
        namen[3] = "BŠr";
        namen[4] = "Neuenburg";
        namen[5] = "Keller";
        namen[6] = "Romminger";
        namen[7] = "Durbach";
        namen[8] = "Kneip";
        namen[9] = "Mann";
        
        //Array sortieren
        for (int i = 0; i < namen.length-1; i++) {
            for (int j = i+1; j < namen.length; j++) {
                if(namen[i].length()>namen[j].length()){
                    
                    //tauschen
                    merke = namen[i];
                    namen[i]=namen[j];
                    namen[j]=merke;
                }
            }
        }
        
        //Array ausgeben
        for (int i = 0; i < namen.length; i++) {
            System.out.println(namen[i]);
        }
        
        
        
    }

}
