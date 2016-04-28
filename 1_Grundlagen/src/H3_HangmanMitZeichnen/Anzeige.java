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

	private static final String TEXT_COUNT = " count:";

	// Assoziation
	Hangman derHangman;

	// Konstanten
	private static final String AUTHOR = " (c) Hammer";
	private static final double VERSION = 0.1;
	private static final String TITEL = "Hangman " + VERSION + AUTHOR;
	private static final int BREITE = 600;
	private static final int HOEHE = 500;
	private static final int ANZAHL_WOERTER = 10;
	private static final int FONTSIZE = 25;
	private static final String BT_NEUSTART_TEXT = "restart";
	private static final String LB_EINGABE_TEXT = " input:";
	private static final String INSERT_LETTER_PLEASE = "insert letter please.";
	private static final String HANGMAN_TEXT = "H A N G M A N";
	private static final String BT_UEBERNEHMEN_TEXT = "apply";

	// Komponenten
	private JPanel contentPane;
	private MeinPanel pGrafik; // mitte
	private JPanel pSteuerung; // unten
	private JPanel pAusgabe; // oben
	private JButton btNeustart;
	private JButton btUebernehmen;
	private JLabel lbAusgabe;
	private JLabel lbEingabe;
	private JTextField tfBuchstabe;

	// Konstruktor
	public Anzeige() {

		// Wenn eine Anzeige erzeugt wird, wird auch ein Hangman-Objekt
		// (Steuerung) erzeugt
		// Der Konstruktor der Klasse Hangman bekommt dieses Objekt vom Typ
		// Anzeige übergeben.
		// Dadurch kann eine Bidirektionale Bezihung zwischen den Objekten
		// erstellt werden.
		derHangman = new Hangman(this);

		// Wenn der Schliessen Button gedrück wird, wird auch das zugehörige
		// Objekt gelöscht.
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setTitle(TITEL);

		// Zeigt das Fenster immer in der Mitte
		setLocationRelativeTo(getParent());

		// Anfangsgroesse des Fensters
		setSize(new Dimension(BREITE, HOEHE));

		// Komponenten des Fensters erzeugen
		contentPane = new JPanel(new BorderLayout());
		pGrafik = new MeinPanel();
		pSteuerung = new JPanel();
		btNeustart = new JButton(BT_NEUSTART_TEXT);

		// Dem Button Neustart wird ein Listener hinzugefügt, damit dieser auf
		// Ereignisse lauscht.
		// Der Übergabeparameter ist ein ActionListener Objekt.
		// mit new ActionListener()... wird eine anonymes inneres
		// Interface/Klasse erzeugt.
		// Da die Methode actionPerformed im Interface ActionListener als
		// abstrakte Methode
		// deklariert ist, wird diese automatisch implementiert.
		// Die Methode actionPerformed() wird also nun aufgerufen, wenn dieser
		// Button geklickt wird.
		// Um die dann anstehenden Aktionen aus dem Konstruktor herauszuholen,
		// wird die Methode clickedNeustart() aufgerufen, die dann in der Klasse
		// Anzeige implementiert wird.
		btNeustart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clickedNeustart();

			}
		});

		lbEingabe = new JLabel(LB_EINGABE_TEXT);

		// Textfeld zur Eingabe eines Buchstabens oder des Lösungswortes mit
		// Platz für 10 Zeichen
		tfBuchstabe = new JTextField(ANZAHL_WOERTER);
		
		//neue Schriftgroesse
		int fontSize = FONTSIZE; 
		
		//benutzte Schriftart ermitteln
		Font font = tfBuchstabe.getFont(); 
		
		//Selbe Schriftart mit veränderter Größe setzen
		tfBuchstabe.setFont(new Font(font.getFontName(), font.getStyle(),
				fontSize));
		tfBuchstabe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clickedUebernehmen();
			}
		});

		//Button für Übernahme eines eingegebenen Textes
		//ist zu Beginn deaktiviert und wird nach dem Neustart aktiviert.
		btUebernehmen = new JButton(BT_UEBERNEHMEN_TEXT);
		btUebernehmen.setEnabled(false);
		
		//Siehe btNeustart
		btUebernehmen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clickedUebernehmen();

			}
		});

		//Container mit alles Komponenten für die Steuerung
		pSteuerung.add(btNeustart);
		pSteuerung.add(lbEingabe);
		pSteuerung.add(tfBuchstabe);
		pSteuerung.add(btUebernehmen);

		//Panel für die Ausgabe des zu erratenden versteckten Wortes
		pAusgabe = new JPanel();
		lbAusgabe = new JLabel(HANGMAN_TEXT);
		
		//setzt die Schriftgröße gleich wie im Textfeld 
		lbAusgabe.setFont(new Font(font.getFontName(), font.getStyle(),
				fontSize));

		pAusgabe.add(lbAusgabe);

		//Hauptinhaltscontainer des Fensters befüllen
		contentPane.add(pAusgabe, BorderLayout.NORTH);
		contentPane.add(pGrafik, BorderLayout.CENTER);
		contentPane.add(pSteuerung, BorderLayout.SOUTH);
		setContentPane(contentPane);

	}

	
	protected void clickedNeustart() {
		
		//setzt die aktuelle Stufe zurück
		resetStufe();
		
		//Löscht den Inhalt aus dem Textfeld
		tfBuchstabe.setText("");
		
		//Setzt den Cursor (Focus) auf das Textfeld, damit gleich mit der
		//Tastatur gearbeitet werden kann.
		tfBuchstabe.requestFocus();
		
		//Sendet die Botschaft neustart() an das assoziierte Objekt derHangman.
		derHangman.neustart();
		
		//Aktiviert den Button btÜbernehmen.
		btUebernehmen.setEnabled(true);

	}

	
	protected void clickedUebernehmen() {

		String eingabe = "";
		
		//Versucht den folgenden Code auszuführen. Dabei kann es zu Probleme (Exceptions) kommen,
		//wenn ein Leertext "" eingegeben wird.
		//Wird dann eine Exception ausgelöst, wird diese aufgefangen und der catch-Block wird 
		//ausgeführt.
		//Im catch-Block wird dann eine Meldung ausgegeben die auffordert einen Buchstaben 
		//einzugeben.
		try {
			
			//Liest den Inhalt des Textfeldes und gibt ihn als Text zurück
			eingabe = tfBuchstabe.getText();
			
			//sendet die Botschaft pruefeEingabe() an das assoziierte Objekt derHangman
			//und übergibt den eingelesenen Text
			derHangman.pruefeEingabe(eingabe);
			
		} catch (Exception e) {
			//Fehlermeldung
			lbAusgabe.setText(INSERT_LETTER_PLEASE);
		}

	}

	/**
	 * Wird von dem assoziierten Objekt derHangman aufgerufen und übergibt
	 * das Wort codiert mit einem "_" für nicht erratene Zeichen und der Anzahl
	 * der bereits erfolgten Versuche.
	 * Ausgegeben wird der Text auf dem lbAusgabe
	 * @param wort
	 * @param anzahl
	 */
	public void zeigeToken(String wort, int anzahl) {
		lbAusgabe.setText(wort + TEXT_COUNT + anzahl);
	}

	//Setzt die Stufe der grafischen Darstellung auf den Anfangszustand. Delegation.
	private void resetStufe() {
		pGrafik.resetStufe();

	}

	//Erhöht die Stufe der grafischen Darstellung. Delegation.
	public void erhoeheStufe() {
		pGrafik.erhoeheStufe();
	}

	//Deaktiviert den btUebernehmen
	public void erzwingeNeustart() {
		btUebernehmen.setEnabled(false);

	}

	//Zeigt den eingegebenen Buchstaben, markiert Ihn und gibt Ihm den Focus
	public void zeigeBuchstabe(char ersterBuchstabe) {

		tfBuchstabe.setText("" + ersterBuchstabe);
		tfBuchstabe.requestFocus();
		tfBuchstabe.selectAll();

	}
}
