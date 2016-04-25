package H3_HangmanMitZeichnen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Anzeige extends JFrame {
	
	//Assoziation
	Hangman derHangman;
	
	//Konstanten
	public static final String AUTHOR = " (c) Hammer";
	public static final double VERSION = 0.1;
	public static final String TITEL = "Hangman "+VERSION + AUTHOR;
	public static final int BREITE = 400;
	public static final int HOEHE = 500;
		
	//Komponenten
	JPanel contentPane;
	MeinPanel pGrafik; 	    //mitte
	JPanel pSteuerung; //unten
	JPanel pAusgabe;   //oben
	JButton btNeustart;
	JButton btUebernehmen;
	JLabel lbAusgabe;
	JLabel lbEingabe;
	JTextField tfBuchstabe;

	
	//Konstruktor
	public Anzeige(){
		derHangman = new Hangman(this);
		
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle(TITEL);
			
		//immer in der Mitte
		setLocationRelativeTo(getParent());
		//Anfangsgroesse
		setSize(new Dimension(BREITE,HOEHE));
		
		
		//Komponenten erzeugen
		contentPane = new JPanel(new BorderLayout());
				
		pGrafik = new MeinPanel();
		
		pSteuerung = new JPanel();
		btNeustart = new JButton("Neustart");
		btNeustart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clickedNeustart();
				
			}
		});
		
		
		
		
		
		
		
		
		
		lbEingabe = new JLabel(" Eingabe:");
		tfBuchstabe = new JTextField(10);
		
		btUebernehmen = new JButton("Übernehmen");
		btUebernehmen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clickedUebernehmen();
				
			}
		});
		
		
		pSteuerung.add(btNeustart);
		pSteuerung.add(lbEingabe);
		pSteuerung.add(tfBuchstabe);
		pSteuerung.add(btUebernehmen);
		
		
		
		pAusgabe = new JPanel();
		lbAusgabe = new JLabel("H A N G M A N");
		pAusgabe.add(lbAusgabe);
		
		contentPane.add(pAusgabe,BorderLayout.NORTH);
		contentPane.add(pGrafik,BorderLayout.CENTER);
		contentPane.add(pSteuerung,BorderLayout.SOUTH);
		setContentPane(contentPane);
		
		
	}
	
	

	protected void clickedNeustart() {
		System.out.println("Neustart geklickt");
		resetStufe();
		derHangman.neustart();
		
	}



	protected void clickedUebernehmen() {
		System.out.println("Übernehmen geklickt");
		
		String eingabe = tfBuchstabe.getText();
		derHangman.pruefeEingabe(eingabe);
	}

	public void zeigeToken(String wort){
		lbAusgabe.setText(wort);
	}


	private void resetStufe() {
		pGrafik.resetStufe();
		
	}

	

	public void erhoeheStufe(){
		pGrafik.erhoeheStufe();
	}
}
