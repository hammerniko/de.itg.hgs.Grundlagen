package G_Schleifen;
import java.util.Scanner;

public class Email2 {
	public static void main(String[] args) {
		boolean istEmailKorrekt = false;
		int anzahlVersuche=0;
		String email;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println();
			System.out.print("Email:");
			email = s.next();
			anzahlVersuche++;
			
			if(anzahlVersuche>=3){
				break;
			}
			
			if(email.contains("@") && (email.contains(".de") || email.contains(".com"))){
				istEmailKorrekt=true;
				System.out.println("Email akzeptiert.");
			}
			else {
				System.err.println("Fehler in der Email:"+email);
				System.out.println("--------------------");
			}
					
			
			
		} while (!istEmailKorrekt);
		
		System.out.println("Programmende");
	}
}