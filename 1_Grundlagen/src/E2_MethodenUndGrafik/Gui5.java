package E2_MethodenUndGrafik;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui5 extends JFrame {
	
	//Konstanten
	public static final String TITEL = "Addierer";
	private static final String TEXT_CALC = "Berechne";
	public static final String TEXT_ZAHL1 = "Zahl1:";
	public static final String TEXT_ZAHL2 = "Zahl2:";
	public static final String TEXT_ERGEBNIS = "Ergebnis:";
	
	
	//Komponenten deklarieren
	JButton btCalc;
	JPanel panelContentPane;
	JPanel panelMain;
	JPanel panelButtons;
	JTextField tfZahl1;
	JTextField tfZahl2;
	JLabel lbZahl1;
	JLabel lbZahl2;
	JLabel lbErgebnisText;
	JLabel lbErgebnis;
	
	//Konstruktor
	public Gui5() {
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setTitle(TITEL);
		this.setSize(700,300);
		this.setLocationRelativeTo(null);
		
		//Objekte erzeugen
		panelContentPane = new JPanel();
		panelButtons = new JPanel();
		panelMain = new JPanel();
		
		tfZahl1 = new JTextField(4);
		tfZahl2 = new JTextField(4);
		btCalc = new JButton(TEXT_CALC);
		lbErgebnisText =new JLabel(TEXT_ERGEBNIS);
		lbErgebnis = new JLabel();
		lbZahl1 = new JLabel(TEXT_ZAHL1);
		lbZahl2 = new JLabel(TEXT_ZAHL2);
		
		
		//Objekte dem Panel hinzufügen
		
		panelContentPane.setLayout(new BorderLayout());
		
		panelMain.setLayout(new GridLayout(4, 2));
		panelMain.add(lbZahl1);
		panelMain.add(tfZahl1);
		
		panelMain.add(lbZahl2);
		panelMain.add(tfZahl2);
		
		panelMain.add(lbErgebnisText);
		panelMain.add(lbErgebnis);
		
		panelButtons.add(btCalc);
		
		panelContentPane.add(panelMain,BorderLayout.CENTER);
		panelContentPane.add(panelButtons,BorderLayout.SOUTH);
		
		
		//Contentpane setzen
		this.setContentPane(panelContentPane);
		
		
		//Buttonklick
		btCalc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				clickedButtonCalc();
				
			}
		});
		
	
	}
	
	
	
	
	
	
	
	
	

	protected void clickedButtonCalc() {
		System.out.println("Button clicked");
		
		try {
			//lies zahl1 aus textfeld1
			String strZ1= tfZahl1.getText();
			String strZ2= tfZahl2.getText();
			
			//Text in Zahl umwandeln (parsen)
			double z1 = Double.parseDouble(strZ1);
			double z2 = Double.parseDouble(strZ2);
			
			//addieren
			double summe = z1+z2;
			
			//Ergebnis anzeigen
			lbErgebnis.setText(""+summe);
		} catch (NumberFormatException e) {
			
			lbErgebnis.setText("Err");
			
		}
		
		
		
		
		
		
		
	}










	public static void main(String[] args) {

		//Fensterobjekt erzeugen
		Gui5 gui = new Gui5();
		
		

	}

}
