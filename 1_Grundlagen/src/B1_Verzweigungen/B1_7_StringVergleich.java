package B1_Verzweigungen;

public class B1_7_StringVergleich {

    public static void main(String[] args) {
       //...
        String name = "Hammer";
        name = name + " Nikolai";
        System.out.println(name);
        
        //Vergleich mit equals()
        if (name.equals("Hammer Nikolai")) {
            System.out.println("Das ist wahr");
        }
        else {
            System.out.println("Das ist nicht wahr");
        }
        
        //Vergleich mit ==
        if (name=="Hammer Nikolai") {
            System.out.println("Das ist wahr");
        }
        else {
            System.out.println("Das ist nicht wahr");
        }
        
        
        System.out.println("Pruefung beendet");
    }

}
