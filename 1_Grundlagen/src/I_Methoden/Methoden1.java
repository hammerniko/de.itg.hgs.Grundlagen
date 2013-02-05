package I_Methoden;

public class Methoden1 {

    public static void main(String[] args) {
        zeichneLinie();
        zeichneLinie(30);
        zeichneLinie(25,'x');
    }

    public static void zeichneLinie(int anzahl, char zeichen) {
        for (int i = 0; i < anzahl; i++) {
            System.out.print(zeichen);
        }
        System.out.println();
    }

    public static void ausgabeHallo() {
        System.out.println("Hallo");
    }

    public static void zeichneLinie() {
        System.out.println("-----------");
    }

    public static void zeichneLinie(int anzahl) {
        for (int i = 0; i < anzahl; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}
