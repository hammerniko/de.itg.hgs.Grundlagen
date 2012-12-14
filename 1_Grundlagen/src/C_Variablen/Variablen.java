package C_Variablen;

public class Variablen {

	public static void main(String[] args) {
		
		//***********************EINGABE
		//deklarieren
		int alter;
		double gewichtDesMenschen;
		String name;
		
		//Wertzuweisung
		alter = 43;
		gewichtDesMenschen=4.4562125456;
		name = "Hammer";
		
		//***********************VERARBEITUNG
		//Variable verändern
		alter = alter+1;
		gewichtDesMenschen=gewichtDesMenschen-1;
		name = name + " Nikolai";
		
		//***********************AUSGABE
		//Variable verwenden
		System.out.println(alter);
		System.out.println(gewichtDesMenschen);
		System.out.println(name);
		

	}

}
