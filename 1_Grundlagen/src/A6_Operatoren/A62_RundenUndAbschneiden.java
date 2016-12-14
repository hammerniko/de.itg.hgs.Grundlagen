package A6_Operatoren;

public class A62_RundenUndAbschneiden {

	public static void main(String[] args) {
	
	//Eingabe
	double number = 2.379632;
	double cutNumber;
	double roundedNumber;
	
	//Verarbeitung
	//abschneiden auf 2 Stellen nach dem Komma
	cutNumber = (int) (number * 100);
	cutNumber = (double) (cutNumber / 100);
	
	//runden auf 2 Stellen nach dem Komma
	roundedNumber = (int) ((number+0.005)*100);
	roundedNumber = (double) (roundedNumber / 100);
	
	//ausgabe
	System.out.println("abgeschnitten:\t"+cutNumber);
	System.out.println("gerundet:\t"+roundedNumber);
	
	
	}
}
