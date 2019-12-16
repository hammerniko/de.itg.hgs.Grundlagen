package O2_GuiGetraenkeautomat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;

import java.awt.GridLayout;
import java.text.DecimalFormat;

import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;

public class GuiGetraenke extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldChange;
	private JFormattedTextField textFieldMoney;
	private JTextField textField2Euro;
	private JTextField textField2Cent;
	private JTextField textField1Cent;
	private JTextField textField5Cent;
	private JTextField textField10Cent;
	private JTextField textField20Cent;
	private JTextField textField50Cent;
	private JTextField textField1Euro;
	private JFormattedTextField textFieldPrice;
	JSpinner spinnerFanta;
	JSpinner spinnerCola;
	JSpinner spinnerSprite;
	JLabel labelPreisFanta;
	JLabel labelPreisCola;
	JLabel labelPreisSprite;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiGetraenke frame = new GuiGetraenke();
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
	public GuiGetraenke() {
		setTitle("MyDrinks");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panelTitel = new JPanel();
		contentPane.add(panelTitel, BorderLayout.NORTH);

		JPanel panelMain = new JPanel();
		contentPane.add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));

		JPanel panelPay = new JPanel();
		panelMain.add(panelPay);
		panelPay.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblEingeworfenerGeldbetrag = new JLabel("Money");
		lblEingeworfenerGeldbetrag.setHorizontalAlignment(SwingConstants.LEFT);
		panelPay.add(lblEingeworfenerGeldbetrag);

		textFieldMoney =  new JFormattedTextField(
			    new DecimalFormat("#,##") );

		textFieldMoney.setText("0");
		textFieldMoney.setHorizontalAlignment(SwingConstants.RIGHT);
		panelPay.add(textFieldMoney);
		textFieldMoney.setColumns(10);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setHorizontalAlignment(SwingConstants.LEFT);
		panelPay.add(lblPrice);

		textFieldPrice = new JFormattedTextField(new DecimalFormat("#,##"));

		textFieldPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldPrice.setText("0");
		textFieldPrice.setBackground(Color.WHITE);
		textFieldPrice.setEditable(false);
		textFieldPrice.setColumns(10);
		panelPay.add(textFieldPrice);

		JPanel panelChoose = new JPanel();
		panelMain.add(panelChoose);
		panelChoose.setLayout(new GridLayout(3, 3, 0, 0));

		JLabel chckbxNewCheckBox_1 = new JLabel("Fanta");
		panelChoose.add(chckbxNewCheckBox_1);

		labelPreisFanta = new JLabel("1.50");
		panelChoose.add(labelPreisFanta);

		spinnerFanta = new JSpinner();
		spinnerFanta.setModel(new SpinnerNumberModel(0, 0, 4, 1));

		panelChoose.add(spinnerFanta);

		JLabel chckbxCola = new JLabel("Cola");
		panelChoose.add(chckbxCola);

		labelPreisCola = new JLabel("1.80");
		panelChoose.add(labelPreisCola);

		spinnerCola = new JSpinner();
		spinnerCola.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		panelChoose.add(spinnerCola);

		JLabel chckbxNewCheckBox = new JLabel("Sprite");
		panelChoose.add(chckbxNewCheckBox);

		labelPreisSprite = new JLabel("1.40");
		panelChoose.add(labelPreisSprite);

		spinnerSprite = new JSpinner();
		spinnerSprite.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		panelChoose.add(spinnerSprite);

		JPanel panelBackpay = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelBackpay.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panelMain.add(panelBackpay);

		JLabel lblChange = new JLabel("Change");
		lblChange.setHorizontalAlignment(SwingConstants.LEFT);
		panelBackpay.add(lblChange);

		textFieldChange = new JTextField();
		panelBackpay.add(textFieldChange);
		textFieldChange.setColumns(10);

		JPanel panelChange = new JPanel();
		panelMain.add(panelChange);
		panelChange.setLayout(new GridLayout(2, 8, 2, 0));

		JLabel lblEuro = new JLabel("2 Euro");
		panelChange.add(lblEuro);

		JLabel lblEuro_1 = new JLabel("1 Euro");
		panelChange.add(lblEuro_1);

		JLabel lblCent = new JLabel("50 Cent");
		panelChange.add(lblCent);

		JLabel lblCent_1 = new JLabel("20 Cent");
		panelChange.add(lblCent_1);

		JLabel lblCent_2 = new JLabel("10 Cent");
		panelChange.add(lblCent_2);

		JLabel lblCent_3 = new JLabel("5 Cent");
		panelChange.add(lblCent_3);

		JLabel lblCent_4 = new JLabel("2 Cent");
		panelChange.add(lblCent_4);

		JLabel lblCent_5 = new JLabel("1 Cent");
		panelChange.add(lblCent_5);

		textField2Euro = new JTextField();
		textField2Euro.setEditable(false);
		panelChange.add(textField2Euro);
		textField2Euro.setColumns(10);

		textField1Euro = new JTextField();
		textField1Euro.setEditable(false);
		textField1Euro.setColumns(10);
		panelChange.add(textField1Euro);

		textField50Cent = new JTextField();
		textField50Cent.setEditable(false);
		textField50Cent.setColumns(10);
		panelChange.add(textField50Cent);

		textField20Cent = new JTextField();
		textField20Cent.setEditable(false);
		textField20Cent.setColumns(10);
		panelChange.add(textField20Cent);

		textField10Cent = new JTextField();
		textField10Cent.setEditable(false);
		textField10Cent.setColumns(10);
		panelChange.add(textField10Cent);

		textField5Cent = new JTextField();
		textField5Cent.setEditable(false);
		textField5Cent.setColumns(10);
		panelChange.add(textField5Cent);

		textField2Cent = new JTextField();
		textField2Cent.setEditable(false);
		textField2Cent.setColumns(10);
		panelChange.add(textField2Cent);

		textField1Cent = new JTextField();
		textField1Cent.setEditable(false);
		textField1Cent.setColumns(10);
		panelChange.add(textField1Cent);

		JPanel panelButtons = new JPanel();
		contentPane.add(panelButtons, BorderLayout.SOUTH);

		JButton btnOk = new JButton("Ok");
		panelButtons.add(btnOk);

		JButton btnAbbrechen = new JButton("Cancel");
		panelButtons.add(btnAbbrechen);

		spinnerFanta.addChangeListener(new ChangeListener() {

			private AbstractButton labelPreisCola;
			private AbstractButton labelPreisSprite;

			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println("wert geaendert");
				 double neuerPreis = berechnePreis();
				 textFieldPrice.setText(""+neuerPreis);

			}

			
		});

		spinnerCola.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println("wert geaendert");
				 double neuerPreis = berechnePreis();
				 textFieldPrice.setText(""+neuerPreis);

			}
		});
		
		spinnerSprite.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println("wert geaendert");
				 double neuerPreis = berechnePreis();
				 textFieldPrice.setText(""+neuerPreis);
				
			}
		});
	}
	
	private double berechnePreis() {
		
		//Anzahl der Getraenke auslesen
		int anzahlFanta = (int) spinnerFanta.getValue();
		System.out.println("Anzahl Fanta:" + anzahlFanta);

		int anzahlCola = (int) spinnerCola.getValue();
		System.out.println("Anzahl Fanta:" + anzahlFanta);

		int anzahlSprite = (int) spinnerSprite.getValue();
		System.out.println("Anzahl Fanta:" + anzahlFanta);

		//Preise auslesen
		double preisFanta = anzahlFanta * Double.parseDouble(labelPreisFanta.getText());
		double preisCola = anzahlCola * Double.parseDouble(labelPreisCola.getText());
		double preisSprite = anzahlSprite * Double.parseDouble(labelPreisSprite.getText());

		//Preis berechnen
		double neuerPreis = preisFanta + preisCola + preisSprite;
		
		//Preis runden
		neuerPreis = Math.round(100.0 * neuerPreis) / 100.0; 
		
		return neuerPreis;
	}

}
