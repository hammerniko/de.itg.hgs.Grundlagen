package H2_Koordinatensystem;

import javax.swing.JFrame;

public class Koordinatenfenster extends JFrame {
	
	//Objekte deklarieren
	XYPanel meinXYPanel;
	
	
	
	
	public Koordinatenfenster() {
		//setzen der Anfangseinstellungen
		setTitle("X-Y Diagramm");
		setSize(640,480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Objekte erzeugen
		meinXYPanel = new XYPanel();
		
		setContentPane(meinXYPanel);
	}

}
