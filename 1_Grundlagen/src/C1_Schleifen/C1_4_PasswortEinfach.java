package C1_Schleifen;
import java.util.Scanner;

public class C1_4_PasswortEinfach {
	public static void main(String[] args) {

		boolean isLoginOk = false;
		String user;
		String password;

		Scanner s = new Scanner(System.in);

		do {
			System.out.print("Benutzername:");
			user = s.next();

			System.out.print("Passwort:");
			password = s.next();

			if (user.equals("root") && password.equals("toor")) {
				isLoginOk = true;
			} else {
				isLoginOk = false;
				System.out.println();
				System.out.println("Falsches Passwort oder Benutzername");
				System.out.println("------------------------------------");
			}
		} while (isLoginOk==false);

		s.close();
		System.out.println("Passwort akzeptiert.");

	}
}