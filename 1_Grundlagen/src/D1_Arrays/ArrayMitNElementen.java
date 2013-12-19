package D1_Arrays;

import java.util.Arrays;

public class ArrayMitNElementen {
    
    public static void main(String[] args) {
        
        String[] teilnehmerSport = new String[6];
        
        
        teilnehmerSport[0] = "Tom";
        teilnehmerSport[1] = "Tim";
        teilnehmerSport[2] = "Tobi";
        teilnehmerSport[3] = "Teo";
        teilnehmerSport[4] = "Thilo";
      
        //AUSGABE
        for (int i = 0; i < teilnehmerSport.length; i++) {
            System.out.println(teilnehmerSport[i]);
        }
        
    }

}
