package C1_Schleifen;

public class Tannenbaum {

    /**
     * Erzeuge eine Tannenbaumkrone aus "*"-Zeichen mit einer
     * beliebigen Anzahl von Sternenreihen.
     */
    public static void main(String[] args) {
    	
    	//Initialisierung
        String luecke;
        String stern;
        String zeile = "";
        int anzahlSterne = 0;
        int anzahlReihen=10;

        //Erzeuge eine Anzahl von Reihen
        for (int i = 0; i <= anzahlReihen; i++) {
        	luecke = "";
            stern = "*";
        	
        	
        	//Erzeuge LŸcken 
            for (int j = anzahlReihen - i; j > 0; j--) {
                luecke = luecke + " ";
            }
            
            //Erzeuge Sterne
            anzahlSterne = i * 2;
            for (int k = 0; k < anzahlSterne; k++) {
                stern = stern + "*";
            }

            //Bilde eine Zeile aus LŸcken und Sternen
            zeile = luecke + stern;
            
            //Zeilenumbruch 
            System.out.println(zeile);
            

        }

    }
}
