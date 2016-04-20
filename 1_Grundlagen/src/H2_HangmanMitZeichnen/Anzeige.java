package H2_HangmanMitZeichnen;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Anzeige extends JFrame {
	
	//Konstanten
	public static final String AUTHOR = " (c) Hammer";
	public static final double VERSION = 0.1;
	public static final String TITEL = "Hangman "+VERSION + AUTHOR;
	public static final int BREITE = 400;
	public static final int HOEHE = 500;
		
	//Komponenten
	MeinPanel cp;

	//Konstruktor
	public Anzeige(){
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle(TITEL);
		
		//Anfangsgroesse
		setSize(new Dimension(BREITE,HOEHE));
		
		//immer in der Mitte
		setLocationRelativeTo(getParent());
		
		cp = new MeinPanel();
		setContentPane(cp);
	}
}
