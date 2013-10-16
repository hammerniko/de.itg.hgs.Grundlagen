package P2_OOPBeispielUnidirektionaleAssoziation1ZuN;

public class StartKlasse {

    public static void main(String[] args) {
        
        Kunde kurt = new Kunde("Knudig", "Kurt");
        
        kurt.addKonto(new Konto(1000));
        kurt.addKonto(new Konto(1000,5000));
        
        Kunde hans =new Kunde("Zimmer", "Hans");
        hans.addKonto(new Konto(300));
        
        hans.getKonto(1).setGuthabenZins(1.2);
        
        kurt.removeKonto(2);
        
        kurt.addKonto(new Konto(2000));
        
        System.out.println(kurt);
        System.out.println(hans);
        

    }

}
