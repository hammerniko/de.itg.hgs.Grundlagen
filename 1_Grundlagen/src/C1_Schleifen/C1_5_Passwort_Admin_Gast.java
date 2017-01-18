package C1_Schleifen;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class C1_5_Passwort_Admin_Gast {
	public static void main(String[] args) {
		boolean isAdmin=false;
		boolean isLoginOk = false;
		String user;
		String password;
		
		Scanner s = new Scanner(System.in);
		
		do {
			
			//Eingabe
			System.out.print("Benutzername:");
			user = s.next();
			
			System.out.print("Passwort:");
			password = s.next();
			
			
			//Verarbeitung
			if (user.equals("gast")) {
				if (password.equals("gast")) {
					isLoginOk = true;
					isAdmin=false;
				}
			} else if (user.equals("admin")) {
				if (password.equals("toor")) {
					isLoginOk = true;
					isAdmin=true;
				}
			} else {
				isLoginOk = false;
				System.out.println();
				System.out.println("Falsches Passwort oder Benutzername");
				System.out.println("------------------------------------");
			}
		} while (!isLoginOk);
		System.out.println("Passwort akzeptiert.");
		
		if(isAdmin){
			System.out.println("Hello Admin");
		}
		
	}
}