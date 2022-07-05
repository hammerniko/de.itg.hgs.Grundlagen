package L1_2048;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui extends JFrame {
	
	//Konstanten
	private static final String TITEL = "2048";
	
	//Objekte deklarieren
	JPanel cp;
	JButton bt;
	Spielstein lb1;

	//Standard Konstruktor
	public Gui() {
		System.out.println("Gui erstellt");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle(TITEL);
		this.setLocationRelativeTo(null);
		this.setPreferredSize(new Dimension(600,600));
		this.setResizable(false);
		
		//Objekte erzeugen
		cp = new JPanel();
		bt = new JButton("ok");
		lb1 = new Spielstein(2);
		
		//Objekte in Panel setzen
		cp.add(bt);
		cp.add(lb1);
		
		lb1.setWert(4);
		
		//Setzen der ContentPane (Hauptcontainer)
		this.setContentPane(cp);
		this.pack();
		
		
	}
	
	

}
