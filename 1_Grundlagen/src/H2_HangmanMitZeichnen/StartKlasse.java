package H2_HangmanMitZeichnen;

public class StartKlasse {

	public static void main(String[] args) {
		
		
		//Variable
		int zahl = 5;
	
		
		String name = new String("Hammer");
		System.out.println(name.length());
		
		
		//Objekt der Anzeige
		Anzeige meineAnzeige = new Anzeige();
		meineAnzeige.setVisible(true);
		
		Test derTest = new Test();
		Test derTest2 = new Test();
		derTest.setTestNr(5);
		
		
		System.out.println(derTest.getTestNr());
		System.out.println(derTest2.getTestNr());

	}

}
