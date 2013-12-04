package P7_DreiSchichtenArchitektur;

public class Steuerung {
	
	//Assoziation auf Gui
	Gui dieGui;
	
	public Steuerung(Gui gui) {
		
		//Wenn Steuerung aus der Gui erzeugt wird,
		//wird ein Zeiger von der Gui mit an die Steuerung Ÿbergeben
		//Ab jetzt haben Gui und Steuerung eine bidirektionale Assoziation
	    dieGui = gui;
    }

	public void erzeugeLinie(int x1, int y1, int x2, int y2){
		Linie linie = new Linie(x1, y1, x2, y2);
		
		
	}
	
}
