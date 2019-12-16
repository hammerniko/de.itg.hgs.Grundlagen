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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class GuiGetraenke extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Konstanten
	private static final String PFAD_1_CENT_JPG = "/O2_GuiGetraenkeautomat/1Cent.jpg";
	private static final String PFAD_2_CENT_JPG = "/O2_GuiGetraenkeautomat/2Cent.jpg";
	private static final String PFAD_5_CENT_JPG = "/O2_GuiGetraenkeautomat/5Cent.jpg";
	private static final String PFAD_10_CENT_JPG = "/O2_GuiGetraenkeautomat/10Cent.jpg";
	private static final String PFAD_20_CENT_JPG = "/O2_GuiGetraenkeautomat/20Cent.jpg";
	private static final String PFAD_50_CENT_JPG = "/O2_GuiGetraenkeautomat/50Cent.jpg";
	private static final String PFAD_1_EURO_JPG = "/O2_GuiGetraenkeautomat/1Euro.jpg";
	private static final String PFAD_2_EURO_JPG = "/O2_GuiGetraenkeautomat/2Euro.jpg";
	private static final String RETURN_MONEY = "Return money";
	private static final int COLUMNS_TEXTFIELD = 10;
	private static final String PLEASE_ADD_PAY = "please add pay:";
	private static final String CANCEL = "Cancel";
	private static final String ORDER = "Order";
	private static final String FONT = "Tahoma";
	private static final String CALCULATE_COINS = "Calculate Coins";
	private static final String CHANGE = "Change";
	private static final String PRIZE_SPRITE = "1.49";
	private static final String SPRITE = "Sprite";
	private static final String PRIZE_COLA = "1.85";
	private static final String COLA = "Cola";
	private static final String PRIZE_FANTA = "1.59";
	private static final String FANTA = "Fanta";
	private static final String YOUR_DRINKS = "Your Drinks";
	private static final String ZERO = "0";
	private static final String PRICE = "Price";
	private static final String NUMBERFORMAT = "#,##";
	private static final String MONEY = "Money";
	private static final String COSTS = "Costs";
	private static final String TITEL = "MyDrinks";
	
	//grafische Komponenten
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
		setTitle(TITEL);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 540);
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
		panelPay.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), COSTS,
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelMain.add(panelPay);
		panelPay.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblEingeworfenerGeldbetrag = new JLabel(MONEY);
		lblEingeworfenerGeldbetrag.setHorizontalAlignment(SwingConstants.LEFT);
		panelPay.add(lblEingeworfenerGeldbetrag);

		textFieldMoney = new JFormattedTextField(new DecimalFormat(NUMBERFORMAT));
		textFieldMoney.setBackground(Color.GREEN);

		textFieldMoney.setText(ZERO);
		textFieldMoney.setHorizontalAlignment(SwingConstants.RIGHT);
		panelPay.add(textFieldMoney);
		textFieldMoney.setColumns(COLUMNS_TEXTFIELD);
		textFieldMoney.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
								moneyAdded();
				
				
			}
		});

		JLabel lblPrice = new JLabel(PRICE);
		lblPrice.setHorizontalAlignment(SwingConstants.LEFT);
		panelPay.add(lblPrice);

		textFieldPrice = new JFormattedTextField(new DecimalFormat(NUMBERFORMAT));

		textFieldPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldPrice.setText(ZERO);
		textFieldPrice.setBackground(Color.GREEN);
		textFieldPrice.setEditable(false);
		textFieldPrice.setColumns(COLUMNS_TEXTFIELD);
		panelPay.add(textFieldPrice);

		JPanel panelChoose = new JPanel();
		panelChoose
				.setBorder(new TitledBorder(null, YOUR_DRINKS, TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelMain.add(panelChoose);
		panelChoose.setLayout(new GridLayout(3, 3, 0, 0));

		JLabel chckbxNewCheckBox_1 = new JLabel(FANTA);
		panelChoose.add(chckbxNewCheckBox_1);

		labelPreisFanta = new JLabel(PRIZE_FANTA);
		panelChoose.add(labelPreisFanta);

		spinnerFanta = new JSpinner();
		spinnerFanta.setModel(new SpinnerNumberModel(0, 0, 4, 1));

		panelChoose.add(spinnerFanta);

		JLabel chckbxCola = new JLabel(COLA);
		panelChoose.add(chckbxCola);

		labelPreisCola = new JLabel(PRIZE_COLA);
		panelChoose.add(labelPreisCola);

		spinnerCola = new JSpinner();
		spinnerCola.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		panelChoose.add(spinnerCola);

		JLabel chckbxNewCheckBox = new JLabel(SPRITE);
		panelChoose.add(chckbxNewCheckBox);

		labelPreisSprite = new JLabel(PRIZE_SPRITE);
		panelChoose.add(labelPreisSprite);

		spinnerSprite = new JSpinner();
		spinnerSprite.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		panelChoose.add(spinnerSprite);

		JPanel panelBackpay = new JPanel();
		panelBackpay.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				RETURN_MONEY, TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		FlowLayout flowLayout = (FlowLayout) panelBackpay.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panelMain.add(panelBackpay);

		JLabel lblChange = new JLabel(CHANGE);
		lblChange.setHorizontalAlignment(SwingConstants.LEFT);
		panelBackpay.add(lblChange);

		textFieldChange = new JTextField();
		panelBackpay.add(textFieldChange);
		textFieldChange.setColumns(10);

		JPanel panelChange = new JPanel();
		panelChange.setBackground(Color.WHITE);
		panelChange.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				CALCULATE_COINS, TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelMain.add(panelChange);
		panelChange.setLayout(new GridLayout(2, 8, 2, 0));

		JLabel lbl2Euro = new JLabel();
		lbl2Euro.setIcon(new ImageIcon(GuiGetraenke.class.getResource(PFAD_2_EURO_JPG)));
		panelChange.add(lbl2Euro);

		JLabel lblEuro_1 = new JLabel();
		lblEuro_1.setIcon(new ImageIcon(GuiGetraenke.class.getResource(PFAD_1_EURO_JPG)));
		panelChange.add(lblEuro_1);

		JLabel lblCent = new JLabel();
		lblCent.setIcon(new ImageIcon(GuiGetraenke.class.getResource(PFAD_50_CENT_JPG)));
		panelChange.add(lblCent);

		JLabel lblCent_1 = new JLabel();
		lblCent_1.setIcon(new ImageIcon(GuiGetraenke.class.getResource(PFAD_20_CENT_JPG)));
		panelChange.add(lblCent_1);

		JLabel lblCent_2 = new JLabel();
		lblCent_2.setIcon(new ImageIcon(GuiGetraenke.class.getResource(PFAD_10_CENT_JPG)));
		panelChange.add(lblCent_2);

		JLabel lblCent_3 = new JLabel();
		lblCent_3.setIcon(new ImageIcon(GuiGetraenke.class.getResource(PFAD_5_CENT_JPG)));
		panelChange.add(lblCent_3);

		JLabel lblCent_4 = new JLabel();
		lblCent_4.setIcon(new ImageIcon(GuiGetraenke.class.getResource(PFAD_2_CENT_JPG)));
		panelChange.add(lblCent_4);

		JLabel lblCent_5 = new JLabel();
		lblCent_5.setIcon(new ImageIcon(GuiGetraenke.class.getResource(PFAD_1_CENT_JPG)));
		panelChange.add(lblCent_5);

		textField2Euro = new JTextField();
		textField2Euro.setFont(new Font(FONT, Font.BOLD, 16));
		textField2Euro.setHorizontalAlignment(SwingConstants.CENTER);
		textField2Euro.setEditable(false);
		panelChange.add(textField2Euro);
		textField2Euro.setColumns(10);

		textField1Euro = new JTextField();
		textField1Euro.setFont(new Font(FONT, Font.BOLD, 16));
		textField1Euro.setHorizontalAlignment(SwingConstants.CENTER);
		textField1Euro.setEditable(false);
		textField1Euro.setColumns(10);
		panelChange.add(textField1Euro);

		textField50Cent = new JTextField();
		textField50Cent.setFont(new Font(FONT, Font.BOLD, 16));
		textField50Cent.setHorizontalAlignment(SwingConstants.CENTER);
		textField50Cent.setEditable(false);
		textField50Cent.setColumns(10);
		panelChange.add(textField50Cent);

		textField20Cent = new JTextField();
		textField20Cent.setFont(new Font(FONT, Font.BOLD, 16));
		textField20Cent.setHorizontalAlignment(SwingConstants.CENTER);
		textField20Cent.setEditable(false);
		textField20Cent.setColumns(10);
		panelChange.add(textField20Cent);

		textField10Cent = new JTextField();
		textField10Cent.setFont(new Font(FONT, Font.BOLD, 16));
		textField10Cent.setHorizontalAlignment(SwingConstants.CENTER);
		textField10Cent.setEditable(false);
		textField10Cent.setColumns(10);
		panelChange.add(textField10Cent);

		textField5Cent = new JTextField();
		textField5Cent.setFont(new Font(FONT, Font.BOLD, 16));
		textField5Cent.setHorizontalAlignment(SwingConstants.CENTER);
		textField5Cent.setEditable(false);
		textField5Cent.setColumns(10);
		panelChange.add(textField5Cent);

		textField2Cent = new JTextField();
		textField2Cent.setFont(new Font(FONT, Font.BOLD, 16));
		textField2Cent.setHorizontalAlignment(SwingConstants.CENTER);
		textField2Cent.setEditable(false);
		textField2Cent.setColumns(10);
		panelChange.add(textField2Cent);

		textField1Cent = new JTextField();
		textField1Cent.setFont(new Font(FONT, Font.BOLD, 16));
		textField1Cent.setHorizontalAlignment(SwingConstants.CENTER);
		textField1Cent.setEditable(false);
		textField1Cent.setColumns(10);
		panelChange.add(textField1Cent);

		JPanel panelButtons = new JPanel();
		contentPane.add(panelButtons, BorderLayout.SOUTH);

		JButton btnOrder = new JButton(ORDER);
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickOrder();
			}
		});
		panelButtons.add(btnOrder);

		JButton btnAbbrechen = new JButton(CANCEL);
		btnAbbrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickCancel();
			}
		});
		panelButtons.add(btnAbbrechen);

		spinnerFanta.addChangeListener(new ChangeListener() {

			private AbstractButton labelPreisCola;
			private AbstractButton labelPreisSprite;

			@Override
			public void stateChanged(ChangeEvent e) {
				berechnePreis();
			}
		});

		spinnerCola.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				berechnePreis();
			}
		});

		spinnerSprite.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				berechnePreis();
			}
		});
	}

	protected void moneyAdded() {
		berechnePreis();
		
	}

	protected void clickOrder() {
		double bezahlt = Double.parseDouble(textFieldMoney.getText());
		double preis = Double.parseDouble(textFieldPrice.getText());

		if (bezahlt >= preis) {

			//Rueckgeld berechnen
			double rueckGeld = runden(bezahlt - preis);
			textFieldChange.setText("" + rueckGeld);
			
			//Muenzen berechnen
			double rueckGeldInCent = rueckGeld * 100;
			int anz2Euro = (int) rueckGeldInCent / 200;
			int rest = (int) rueckGeldInCent % 200;
			
			int anz1Euro = (int) rest / 100;
			rest = (int) rest % 100;
			
			int anz50Cent = (int) rest / 50;
			rest = (int) rest % 50;
			
			int anz20Cent = (int) rest / 20;
			rest = (int) rest % 20;
			
			int anz10Cent = (int) rest / 10;
			rest = (int) rest % 10;
			
			int anz5Cent = (int) rest / 5;
			rest = (int) rest % 5;
			
			int anz2Cent = (int) rest / 2;
			rest = (int) rest % 2;
			
			int anz1Cent = rest;
			
			//Werte anzeigen
			textField2Euro.setText(""+anz2Euro);
			textField1Euro.setText(""+anz1Euro);
			textField50Cent.setText(""+anz50Cent);
			textField20Cent.setText(""+anz20Cent);
			textField10Cent.setText(""+anz10Cent);
			textField5Cent.setText(""+anz5Cent);
			textField2Cent.setText(""+anz2Cent);
			textField1Cent.setText(""+anz1Cent);
			
			

		} else {

			double fehlbetrag = runden(preis - bezahlt);
			JOptionPane.showMessageDialog(this, PLEASE_ADD_PAY + fehlbetrag);
		}

	}

	protected void clickCancel() {
		// alle Eingaben loeschen

		textField2Euro.setText("");
		textField1Euro.setText("");
		textField50Cent.setText("");
		textField20Cent.setText("");
		textField10Cent.setText("");
		textField5Cent.setText("");
		textField2Cent.setText("");
		textField1Cent.setText("");
		textFieldMoney.setText("");
		textFieldChange.setText("");
		textFieldPrice.setText("");

	}

	protected void berechnePreis() {

		// Anzahl der Getraenke auslesen
		int anzahlFanta = (int) spinnerFanta.getValue();
		int anzahlCola = (int) spinnerCola.getValue();
		int anzahlSprite = (int) spinnerSprite.getValue();
		
		// Preise auslesen
		double preisFanta = anzahlFanta * Double.parseDouble(labelPreisFanta.getText());
		double preisCola = anzahlCola * Double.parseDouble(labelPreisCola.getText());
		double preisSprite = anzahlSprite * Double.parseDouble(labelPreisSprite.getText());

		// Preis berechnen
		double neuerPreis = runden(preisFanta + preisCola + preisSprite);

		//Preis anzeigen
		textFieldPrice.setText("" + neuerPreis);
		
		//Farbe des Textfeldes ändern, wenn geld fehlt
		double bezahlt = Double.parseDouble(textFieldMoney.getText());
		if(bezahlt > neuerPreis) {
			textFieldMoney.setBackground(Color.green);
		}
		else {
			textFieldMoney.setBackground(Color.red);
		}
		
		
	}

	private double runden(double neuerPreis) {
		return Math.round(100.0 * neuerPreis) / 100.0;
	}

}
