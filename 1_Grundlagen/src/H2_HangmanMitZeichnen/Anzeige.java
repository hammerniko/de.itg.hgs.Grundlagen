package H2_HangmanMitZeichnen;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Anzeige extends JFrame {
	
	//Konstanten 
	public static final String TITEL = "Hangman";
		
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
