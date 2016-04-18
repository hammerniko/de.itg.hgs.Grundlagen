package H1_GUIEinfachZeichnen;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Anzeige extends JFrame {
	
	//Konstanten 
	public static final String TITEL = "Mein erstes Fenster";
		
	//Komponenten
	MeinPanel cp;

	//Konstruktor
	public Anzeige(){
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle(TITEL);
		
		cp = new MeinPanel();
		setContentPane(cp);
		
	}
	
}
