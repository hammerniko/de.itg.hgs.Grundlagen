package C1_Schleifen;
import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		boolean istEmailKorrekt = false;
		String email;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println();
			System.out.print("Email:");
			email = s.next();
			
			if(email.contains("@") && (email.contains(".de") || email.contains(".com"))){
				istEmailKorrekt=true;
			}
			else {
				System.err.println("Fehler in der Email:"+email);
				System.out.println("--------------------");
			}
					
			
			
		} while (!istEmailKorrekt);
		
		System.out.println("Email akzeptiert.");
	}
}