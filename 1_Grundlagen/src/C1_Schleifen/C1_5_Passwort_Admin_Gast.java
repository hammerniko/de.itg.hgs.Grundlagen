package C1_Schleifen;
import java.util.Scanner;

public class C1_5_Passwort_Admin_Gast {
	public static void main(String[] args) {
		boolean isAdmin = false;
		boolean isLoginOk = false;
		final int MAX_ANZ_ANMELDUNG = 3;
		int anzAnmeldung = 0;
		String user;
		String password;
		String meldung = "";
		Scanner s = new Scanner(System.in);

		do {
			anzAnmeldung++;

			System.out.print("Benutzername:");
			user = s.next();

			System.out.print("Passwort:");
			password = s.next();

			if (anzAnmeldung >= MAX_ANZ_ANMELDUNG) {
				isAdmin = false;
				isLoginOk = false;
				meldung = "zu viele Fehlversuche";
				break;
			}

			if (user.equals("gast") && password.equals("gast")) {
				isLoginOk = true;
				isAdmin = false;
				meldung="Hello gast";

			} else if (user.equals("admin") && password.equals("toor")) {
				isLoginOk = true;
				isAdmin = true;
				meldung = "Hello admin";
			} else {
				isLoginOk = false;
				System.out.println();
				System.out.println("Falsches Passwort oder Benutzername");
				System.out.println("------------------------------------");
				System.out.println();
			}
		} while (!isLoginOk);

		System.out.println(meldung+" isAdmin:"+isAdmin);
		s.close();
	}
}