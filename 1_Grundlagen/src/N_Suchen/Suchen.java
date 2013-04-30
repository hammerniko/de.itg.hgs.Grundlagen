package N_Suchen;

public class Suchen {

    /**
     * Sequentielle und Binäre Suche in Feldern
     * Buch S. 102
     * 
     */
    public static void main(String[] args) {
        
        //Zu durchsuchende Felder 
        int[] sortiertesFeld={2,5,9,13,23,43,65};
        int[] unsortiertesFeld={3,67,1,45,7,9,34};
        
        //Gesuchte Werte
        int gesuchterWert = 45;
        int gesuchterWert2 = 43;
        
        //Sequentielle Suche
        int index = sequentielleSuche(unsortiertesFeld,gesuchterWert);
        System.out.println(gesuchterWert+" steht an der Stelle "+index);
        
        //Binaere Suche
        int index2 = binaereSuche(sortiertesFeld, gesuchterWert2);
        System.out.println(gesuchterWert2+" steht an der Stelle "+index2);
    }
    
    /**
     * Durchsucht eine unsortiertes Feld nach einem Wert und
     * gibt den Index zurück, wenn der Wert gefunden wird.
     * Im Fehlerfall wird -1 zurückgegeben
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
    
    /**
    * Durchsucht eine sortiertes Feld nach einem Wert und
    * gibt den Index zurück, wenn der Wert gefunden wird.
    * Im Fehlerfall wird -1 zurückgegeben.
    * Der Suchvorgang geht schneller als die Sequentielle Suche.
    * @param feld
    * @param wert
    * @return
    */
    public static int binaereSuche(int[] sortiertesFeld, int wert){
        int index,untereGrenze,obereGrenze;
        untereGrenze=0;
        obereGrenze=sortiertesFeld.length-1;
        
        while (untereGrenze <= obereGrenze) {
            index = (untereGrenze+obereGrenze)/2;  //index in der Mitte wählen
            
            if(sortiertesFeld[index]==wert)
                return index;
            
            if(wert<sortiertesFeld[index])
                obereGrenze=index-1;
            else
                untereGrenze=index+1;
        }
        return -1;
    }

}
