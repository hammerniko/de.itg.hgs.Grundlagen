package E21_MethodenUndGrafik;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//GuiNeu erbt von JFrame
public class GuiNeu extends JFrame {
	
	
	//Kompnoneten
	JTextField tfZahl1;
	JTextField tfZahl2;
	
	JLabel lbZahl1;
	JLabel lbZahl2;
	JLabel lbErgebnistext;
	JLabel lbErgebnis;
	
	JButton btBerechne;
	
	JPanel jpContentPane;
	
	
	//Konstruktor
	//Wird ausgeführt wenn ein Objekt
	//der Klasse erzeugt wird.
	public GuiNeu() {
		
		//Initialisiere und erzeuge alle Objekte der Gui
		tfZahl1 = new JTextField(2);
		tfZahl2 = new JTextField(2);
		
		lbZahl1 = new JLabel("Zahl1:");
		lbZahl2 = new JLabel("Zahl2:");
		lbErgebnistext = new JLabel("Ergebnis:");
		lbErgebnis = new JLabel("-");
		
		btBerechne = new JButton("Berechne");
		jpContentPane = new JPanel();
		
		//Komponenten einfuegen und anordnen
		jpContentPane.add(lbZahl1);
		jpContentPane.add(tfZahl1);
		
		jpContentPane.add(lbZahl2);
		jpContentPane.add(tfZahl2);
				
		jpContentPane.add(lbErgebnistext);
		jpContentPane.add(lbErgebnis);
		
		jpContentPane.add(btBerechne);
		
		
		//Button soll auf Klickereignis reagieren
		btBerechne.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				clickedButtonBerechne();
				
			}
		});
		
		
		
		
		this.setContentPane(jpContentPane);
		this.setVisible(true);
		this.setTitle("Addierer");
		this.pack();
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//Setzt Fesnter in die Mitte
		this.setLocationRelativeTo(null);
	}
	
	
	
	
	




	public void clickedButtonBerechne() {
		System.out.println("Clicked");
		
		try {
			//einlesen und speichern der Zahl1 von tfZahl1
			String strZ1 = tfZahl1.getText();
			double z1 = Double.parseDouble(strZ1);
			
			
			//einlesen der Zahl2 von tfZahl2
			String strZ2 = tfZahl2.getText();
			double z2 = Double.parseDouble(strZ2);
			
			//addieren zahl1 und zahl2
			double ergebis = z1+z2;
			
			//ausgeben des Ergebnisses auf lbErgebis
			lbErgebnis.setText(""+ergebis);
			
			
		} catch (NumberFormatException e) {
			//Fehlermeldung
			lbErgebnis.setText("Err");
			
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		//erstelle ein Objekt der Klasse Gui
		GuiNeu dieGui = new GuiNeu();
	}
	
	

}
