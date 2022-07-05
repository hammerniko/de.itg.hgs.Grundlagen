package L1_2048;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Gui2 extends JFrame {
	
	//Konstanten
	private static final int HEIGHT = 600;
	private static final int WIDTH = 600;
	private static final String TITEL = "2048";
	
	
	//Komponenten
	MyPanel contentPane = new MyPanel();
	
	

	//Konstruktor
	public Gui2() {
		System.out.println("Gui erstellt");
		
		//sichtbarmachen
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle(TITEL);
		this.setLocationRelativeTo(null);
		this.setSize(new Dimension(WIDTH, HEIGHT));
		this.setResizable(false);
		
		
		//ContentPane setzen
		this.setContentPane(contentPane);
		
		
	}
	
	

}
