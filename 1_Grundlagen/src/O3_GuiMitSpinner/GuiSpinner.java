package O3_GuiMitSpinner;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiSpinner extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAnzeige;
	
	//1. Spinner innerhalb der Klasse deklarieren
	//-> Ist von jeder Methode aufrufbar
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiSpinner frame = new GuiSpinner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiSpinner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//2. Deklaration im Konstruktor entfernen
		//-> sonst existieren 2 Deklarationen
		spinner = new JSpinner();
		spinner.setBounds(141, 61, 162, 38);
		
		//3. Spinner erweitern, so dass dieser auf Aenderungen reagiert
		//-> Komponente braucht einen Listener der auf die gewünschte Aktion wartet
		//-> ChangeListener
		spinner.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				//hier ghets weiter wenn ein Change erignis eingetreten ist
				//Damit der Code ueberichtlich bleibt
				//wird der Code an eine Methode innerhalb der Klasse 
				//delelgiert
				changedSpinnnerValue();
				
			}
		});
		
		
		
		contentPane.add(spinner);
		
		JButton btnBerechne = new JButton("Berechne");
		btnBerechne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickedBerechne();
			}
		});
		btnBerechne.setBounds(141, 143, 89, 23);
		contentPane.add(btnBerechne);
		
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setBounds(243, 143, 89, 23);
		
		btnAbbrechen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clickedAbbrechen();
			}
		});
		
		contentPane.add(btnAbbrechen);
		
		textFieldAnzeige = new JTextField();
		textFieldAnzeige.setBounds(144, 11, 86, 20);
		contentPane.add(textFieldAnzeige);
		textFieldAnzeige.setColumns(10);
		
		JLabel lblSpinnerwert = new JLabel("Spinnerwert");
		lblSpinnerwert.setBounds(34, 14, 86, 17);
		contentPane.add(lblSpinnerwert);
	}

	protected void clickedAbbrechen() {
		System.out.println("Abbrechen geklickt");
		
	}

	protected void clickedBerechne() {
		// TODO Auto-generated method stub
		System.out.println("Berechne geklickt");
		
		//Wert vom Spinner holen
		int spinnerwert = (Integer) spinner.getValue();
		
		
		
		//Wert auf das Textfeld schreiben
		textFieldAnzeige.setText(""+spinnerwert);
		
		
		
	}

	protected void changedSpinnnerValue() {
		//Diese Methode wird aufgerufen wenn
		// der Spinnerwert geaendert wird
		System.out.println("Spinnerwert geaendert "+spinner.getValue());
		
	}
}
