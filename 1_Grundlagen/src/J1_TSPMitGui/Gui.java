package J1_TSPMitGui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initGui();
		setSize(new Dimension(800, 600));
		setVisible(true);
		
	}


	private void initGui() {
		contentPane = new JPanel(new BorderLayout());
		karte = new Karte();
		
		
		berechneRoute=new JButton("Calc");
		berechneRoute.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clickedCalc();
				
			}
		});
		
		loeschen= new JButton("delete");
		loeschen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clickedLoeschen();
				
			}
		});
		buttons= new JPanel();
		buttons.setLayout(new FlowLayout());
		buttons.add(berechneRoute);
		buttons.add(loeschen);
		
		contentPane.add(karte,BorderLayout.CENTER);
		contentPane.add(buttons, BorderLayout.SOUTH);
		
		setContentPane(contentPane);
		
	}


	protected void clickedCalc() {
		
		karte.calcAll();
		
	}


	protected void clickedLoeschen() {
		karte.deletAllPoints();
		
	}
}
