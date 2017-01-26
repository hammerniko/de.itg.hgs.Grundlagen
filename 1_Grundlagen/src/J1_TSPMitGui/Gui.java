package J1_TSPMitGui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui extends JFrame {
	
	JPanel contentPane;
	Karte karte;
	JPanel buttons;
	JButton berechneRoute;
	JButton loeschen;
	

	public Gui(){
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		initGui();
		setSize(new Dimension(800, 600));
		setVisible(true);
		
	}


	private void initGui() {
		contentPane = new JPanel(new BorderLayout());
		karte = new Karte();
		
		
		berechneRoute=new JButton("Calc");
		loeschen= new JButton("delete");
		buttons= new JPanel();
		buttons.setLayout(new FlowLayout());
		buttons.add(berechneRoute);
		buttons.add(loeschen);
		
		contentPane.add(karte,BorderLayout.CENTER);
		contentPane.add(buttons, BorderLayout.SOUTH);
		
		setContentPane(contentPane);
		
	}
}
