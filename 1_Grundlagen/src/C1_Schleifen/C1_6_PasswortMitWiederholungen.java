package C1_Schleifen;

import java.util.Scanner;

public class C1_6_PasswortMitWiederholungen {
	
	static final int MAX_ANZAHL_VERSUCHE = 3;
	
	
	public static void main(String[] args) {
		boolean isLoginOk = false;
		String user;
		String password;
		int anzahlVersuche = 0;
		

		Scanner s = new Scanner(System.in);

		do {
			System.out.println("Erlaubte Versuche: "+(MAX_ANZAHL_VERSUCHE-anzahlVersuche));
			anzahlVersuche++;
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
			
			if(anzahlVersuche>=MAX_ANZAHL_VERSUCHE) {
				break;
			}
			
		} while (isLoginOk==false);

		s.close();
		if(isLoginOk) {
		System.out.println("Passwort akzeptiert.");
		}
		else  {
			System.out.println("anzahl gülter Versuche überschritten");
		}
		

	}
}