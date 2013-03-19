package G_Schleifen;
import java.util.Scanner;

public class Passwort {
	public static void main(String[] args) {
		boolean istRechteingeschraenkt, istLoginKorrekt = false;
		String benutzername, passwort;
		Scanner s = new Scanner(System.in);
		do {
			System.out.print("Benutzername:");
			benutzername = s.next();
			System.out.print("Passwort:");
			passwort = s.next();
			if (benutzername.equals("gast")) {
				if (passwort.equals("gast")) {
					istLoginKorrekt = true;
				}
			} else if (benutzername.equals("admin")) {
				if (passwort.equals("toor")) {
					istLoginKorrekt = true;
				}
			} else {
				istLoginKorrekt = false;
				System.out.println();
				System.out.println("Falsches Passwort oder Benutzername");
				System.out.println("------------------------------------");
			}
		} while (!istLoginKorrekt);
		System.out.println("Passwort akzeptiert.");
	}
}