package G_Schleifen;

public class Zufallszahl {

    public static void main(String[] args) {
       
        int zufallfzahl;
        
        do {
            zufallfzahl= (int) (Math.random()*100+1);
            System.out.println(zufallfzahl);
        } while (zufallfzahl>20);
       
        
        
        

    }

}
