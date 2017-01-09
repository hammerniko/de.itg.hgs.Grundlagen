package B1_Verzweigungen;
import java.util.Scanner;

public class B1_5a_Zeugnisnote {

    public static void main(String[] args) {
        
        //Eingabe
        Scanner s = new Scanner(System.in);
        double kommaNote; 
        String zeugnisNote="";
        
        System.out.print("Kommanote:\t\t");
        kommaNote=s.nextDouble();
        
        //Verarbeitung
        if(kommaNote<1 || kommaNote>6){
        	zeugnisNote="Unueltig";
        }
        else if(kommaNote<1.5){
            zeugnisNote="Sehr Gut";
        }
        else if(kommaNote<2.5){
            zeugnisNote="Gut";
        }
        else if(kommaNote<3.5){
            zeugnisNote="Befriedigend";
        }
        else if(kommaNote<4.5){
            zeugnisNote="Ausreichend";
        }
        else if(kommaNote<5.5){
            zeugnisNote="Mangelhaft";
        }
        else {
            zeugnisNote="Ungenuegend";
        }
       
        
        //Ausgabe
        System.out.println("Ihre Zeugnisnote:\t"+zeugnisNote);
        

    }

}
