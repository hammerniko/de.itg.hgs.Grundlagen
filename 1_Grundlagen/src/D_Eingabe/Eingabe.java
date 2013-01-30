package D_Eingabe;
import java.util.Scanner;

public class Eingabe {
	
	public static void main(String[] args){
		
		//EINGABE
		Scanner s = new Scanner(System.in);
		
		//Warten bis auf der Konsole Enter gedrückt wird
		System.out.print("Name:\t");
		String name = s.next();
		
		System.out.print("Größe:\t");
		int groesse = s.nextInt();
		
		System.out.print("Gewicht:\t");
		double gewicht = s.nextDouble();
		
		
		
		//AUSGABE
		System.out.println(name);
		System.out.println(groesse);
		System.out.println(gewicht);
		
		
	}
	
	
	

}
