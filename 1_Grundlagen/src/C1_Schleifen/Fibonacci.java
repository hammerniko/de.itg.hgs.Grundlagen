package C1_Schleifen;
public class Fibonacci {
	
	public static void main(String[] args) {
	    
		int neuGeborene=1,einMonatAlt=0,zweiMonateUndAelter=0,anzKan;
		
		for (int monat = 0; monat < 16; monat++) {
			
			//Ausgabe des aktuellen Falles
			anzKan=neuGeborene+einMonatAlt+zweiMonateUndAelter;
			System.out.println("Monat:"+monat+"  \tng:"+neuGeborene+"\t1m:"+einMonatAlt+"\t2m"+zweiMonateUndAelter+"\tAnzahl:"+anzKan);
			
			//Nach der Ausgabe folgt die VerŠnderung fŸr den Folgemonat
			zweiMonateUndAelter=zweiMonateUndAelter+einMonatAlt;
			einMonatAlt=neuGeborene;
			neuGeborene=zweiMonateUndAelter;
					
		}
	}

}
