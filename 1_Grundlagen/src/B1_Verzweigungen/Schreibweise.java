package B1_Verzweigungen;

public class Schreibweise {

    public static void main(String[] args) {
        
        boolean istPasswortGesetzt;
        
        
        //..Passwortabfrage
        
        istPasswortGesetzt = true;
        
        //...
        int a = 5;
        String name = "Hammer";
        name = name + " Nikolai";
        System.out.println(name);
        
        if (name.equals("Hammer Nikolai")) {
            System.out.println("Das ist wahr");
        }
        
        else {
            System.out.println("Das ist nicht wahr");
        }
        
        
        System.out.println("Pruefung beendet");
    }

}
