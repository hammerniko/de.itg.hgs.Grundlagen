package F_Verzweigungen;

import java.util.Scanner;

public class GeradeZahl {
    
    public static void main(String[] args){
        //EINGABE
        Scanner s = new Scanner(System.in);
        System.out.print("Zu prüfende Zahl: ");
        double zahl = s.nextDouble();
        String meldung="";
        
        //VERARBEITUNG
        if(zahl%2==0){
            meldung="Die Zahl ist gerade";
        }
        else{
            meldung="Die Zahl ist ungerade";
        }
        
        //AUSGABE
        System.out.println(meldung);
        
        
        
        
    }

}
