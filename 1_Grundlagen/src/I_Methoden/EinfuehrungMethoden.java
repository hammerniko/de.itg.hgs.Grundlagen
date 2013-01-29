package I_Methoden;

public class EinfuehrungMethoden {

    // Hauptprogramm
    public static void main(String[] args) {
       System.out.println("Hallo hier bin ich");
        zeichneLinie();
        zeichneLinie(80);
        zeichneLinie(80,'*');
   }

    // Einfache Methode, ohne RŸckgabewert
    public static void zeichneLinie() {
        System.out.println("-------------------------");
    }
    
    //Einfache Ÿberladene Methode mit †bergabeparameter
    //ohne RŸckgabewert
    public static void zeichneLinie(int anzahlStriche){
        for (int i = 0; i < anzahlStriche; i++) {
            System.out.print("-");
        }
        System.out.println();
     }
    
    public static void zeichneLinie(int anzahlStriche, char zeichen){
        for (int i = 0; i < anzahlStriche; i++) {
            System.out.print(zeichen);
        }
        System.out.println();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
