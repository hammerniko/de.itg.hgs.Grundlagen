package H3_HangmanMitZeichnen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
	public static final int BREITE = 600;
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
		int fontSize = 25; //neue Schriftgröße
		Font font = tfBuchstabe.getFont(); //benutzte Schriftart ermitteln
		tfBuchstabe.setFont(new Font(font.getFontName(), font.getStyle(), fontSize));
		tfBuchstabe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clickedUebernehmen();
			}
		});
		
		btUebernehmen = new JButton("Übernehmen");
		btUebernehmen.setEnabled(false);
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
		lbAusgabe.setFont(new Font(font.getFontName(), font.getStyle(), fontSize));
		
		
		pAusgabe.add(lbAusgabe);
		
		contentPane.add(pAusgabe,BorderLayout.NORTH);
		contentPane.add(pGrafik,BorderLayout.CENTER);
		contentPane.add(pSteuerung,BorderLayout.SOUTH);
		setContentPane(contentPane);
				
	}
	
	

	protected void clickedNeustart() {
		System.out.println("Neustart geklickt");
		resetStufe();
		tfBuchstabe.setText("");
		tfBuchstabe.requestFocus();
		derHangman.neustart();
		btUebernehmen.setEnabled(true);
		
	}

	protected void clickedUebernehmen() {
		System.out.println("Übernehmen geklickt");
		String eingabe="";
		try {
			eingabe = tfBuchstabe.getText();
			derHangman.pruefeEingabe(eingabe);
		} catch (Exception e) {
			lbAusgabe.setText("Bitte Buchstaben eingeben");
		}
		
	}

	public void zeigeToken(String wort, int anzahl){
		lbAusgabe.setText(wort+" Versuch:"+anzahl);
	}

	private void resetStufe() {
		pGrafik.resetStufe();
		
	}


	public void erhoeheStufe(){
		pGrafik.erhoeheStufe();
	}



	public void erzwingeNeustart() {
		btUebernehmen.setEnabled(false);
		
	}



	public void zeigeBuchstabe(char ersterBuchstabe) {
		
		tfBuchstabe.setText(""+ersterBuchstabe);
		tfBuchstabe.requestFocus();
		tfBuchstabe.selectAll();
		
	}
}
