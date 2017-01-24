package A6_Operatoren;

public class A66aZeichenVerschieben {

	public static void main(String[] args) {
		//Eingabe
		char buchstabe = 'a';
		
		//Verarbeitung
		int verschiebung=(int) (Math.random()*26+1);
		buchstabe=(char) (buchstabe+verschiebung);
		
		//Ausgabe
		System.out.println("Verschiebung um:"+verschiebung);
		System.out.println("Neuer Buchstabe:"+buchstabe);

	}

}
