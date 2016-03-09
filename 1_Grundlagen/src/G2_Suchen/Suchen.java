package G2_Suchen;

public class Suchen {

    /**
     * Sequentielle und Binaere Suche in Feldern
     * Buch S. 102
     * 
     */
    public static void main(String[] args) {
        
        //Zu durchsuchende Felder 
        int[] sortiertesFeld={2,5,9,13,23,43,65};
        int[] unsortiertesFeld={3,67,1,45,7,9,34};
        String[] unsortierteNamen = {"Meier","Grobian","Huber"};
        String[] sortierteNamen   = {"Arendt","Burger","Maier"};
        
        //Gesuchte Werte
        int gesuchterWert = 45;
        int gesuchterWert2 = 43;
        String gesuchterName = "Grobian";
        String gesuchterName2 = "Maier";
                
        //Sequentielle Suche
        int index = sequentielleSuche(unsortiertesFeld,gesuchterWert);
        System.out.println("sequentiell:"+gesuchterWert+" steht an der Stelle "+index);
        int indexStr = sequentielleSuche(unsortierteNamen,gesuchterName);
        System.out.println("sequentiell:"+gesuchterName+" steht an der Stelle "+indexStr);
         
        //Binaere Suche
        int index2 = binaereSuche(sortiertesFeld, gesuchterWert2);
        System.out.println("binaer:      "+gesuchterWert2+" steht an der Stelle "+index2);
        int indexStr2 = binaereSuche(sortierteNamen, gesuchterName2);
        System.out.println("binaer:      "+gesuchterName2+" steht an der Stelle "+indexStr2);
    }
    
    /**
     * Durchsucht eine unsortiertes Feld nach einem Wert und
     * gibt den Index zurueck, wenn der Wert gefunden wird.
     * Im Fehlerfall wird -1 zurueckgegeben
     * @param feld
     * @param wert
     * @return
     */
    public static int sequentielleSuche(int[] feld, int wert){
        int k=0;
        while (k<feld.length) {
            if(feld[k]==wert)
                return k;
            k++;
        }
        return -1;
     }
    
    //Ueberladene Methode fuer die Sequentielle Suche in Feldern mit Zeichenketten
    public static int sequentielleSuche(String[] feld, String wert){
        int k=0;
        while (k<feld.length) {
            if(feld[k].equals(wert))
                return k;
            k++;
        }
        return -1;
     }
    
    /**
    * Durchsucht eine sortiertes Feld nach einem Wert und
    * gibt den Index zurueck, wenn der Wert gefunden wird.
    * Im Fehlerfall wird -1 zurueckgegeben.
    * Der Suchvorgang geht schneller als die Sequentielle Suche.
    * @param feld
    * @param wert
    * @return
    */
    public static int binaereSuche(int[] sortiertesFeld, int wert){
        int index;
        int untereGrenze=0;
        int obereGrenze=sortiertesFeld.length-1;
        
        while (untereGrenze <= obereGrenze) {
            index = (untereGrenze+obereGrenze)/2;  //index in der Mitte waehlen
            
            //Falls der Wert gefunden wurde
            if(sortiertesFeld[index]==wert)
                return index;
            //eine Haelfte waehlen, wenn der Wert noch nicht gefunden wurde
            if(wert<sortiertesFeld[index])
                obereGrenze=index-1;
            else
                untereGrenze=index+1;
        }
        return -1;
    }
    
    public static int binaereSuche(String[] sortiertesFeld, String wert){
        int index;
        int untereGrenze=0;
        int obereGrenze=sortiertesFeld.length-1;
        
        while (untereGrenze <= obereGrenze) {
            index = (untereGrenze+obereGrenze)/2;  //index in der Mitte waehlen
            
            //Falls der Wert gefunden wurde
            if(sortiertesFeld[index].equals(wert))
                return index;
            //eine Haelfte waehlen, wenn der Wert noch nicht gefunden wurde
            if(wert.charAt(0)<sortiertesFeld[index].charAt(0))
                obereGrenze=index-1;
            else
                untereGrenze=index+1;
        }
        return -1;
    }
    
}
