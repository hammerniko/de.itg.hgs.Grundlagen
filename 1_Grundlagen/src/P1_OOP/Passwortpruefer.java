package P1_OOP;

public class Passwortpruefer {

    String pwd;

    public Passwortpruefer() {
        pwd = "";
        codierePwd();
    }

    public boolean pruefePasswort(String pwd) {
        boolean istPasswortgueltig = false;

        if (pwd.equals(this.pwd)) {
            istPasswortgueltig = true;
        }

        return istPasswortgueltig;
    }

    private void codierePwd() {

        pwd = "tg113";
        char[] buchstaben = pwd.toCharArray();
        pwd = "";
        for (int i = 0; i < buchstaben.length; i++) {
            int ascii = (int) buchstaben[i];
            if (ascii <= 128) {
                ascii=ascii+1+i;
            }
            buchstaben[i] = (char) ascii;
            pwd = pwd + buchstaben[i];

        }
        System.out.println(pwd);

    }

}
