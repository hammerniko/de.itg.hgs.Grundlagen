package E22_GuiHorner;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Horner extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	
	/**
	 * Create the frame.
	 */
	public Horner() {
		setTitle("Horner 0.3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelTop = new JPanel();
		contentPane.add(panelTop, BorderLayout.NORTH);
		panelTop.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblHornerSchema = new JLabel("HORNER SCHEMA");
		lblHornerSchema.setHorizontalAlignment(SwingConstants.CENTER);
		lblHornerSchema.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelTop.add(lblHornerSchema);
		
		JPanel panelEingabe = new JPanel();
		panelTop.add(panelEingabe);
		panelEingabe.setBorder(new TitledBorder(null, "Eingabe", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelEingabe.setLayout(new GridLayout(2, 5, 5, 5));
		
		JLabel lblNullstellenVon = new JLabel("Nullstellen von:");
		panelEingabe.add(lblNullstellenVon);
		
		JLabel lblNewLabel_2 = new JLabel("NUllstellen bis:");
		panelEingabe.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Schrittweite:");
		panelEingabe.add(lblNewLabel_1);
		
		JLabel lblKoeffizienten = new JLabel("Koeffizienten:");
		panelEingabe.add(lblKoeffizienten);
		
		JButton btnNewButton_2 = new JButton("Uebernehmen");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickedUebernehmen();
			}
		});
		panelEingabe.add(btnNewButton_2);
		
		textField_1 = new JTextField();
		panelEingabe.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		panelEingabe.add(textField_3);
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		panelEingabe.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		panelEingabe.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Abbrechen");
		panelEingabe.add(btnNewButton_3);
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelAusgabe = new JPanel();
		panelAusgabe.setBorder(new TitledBorder(null, "Ausgabe", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelCenter.add(panelAusgabe);
		panelAusgabe.setLayout(new GridLayout(4, 2, 5, 5));
		
		JLabel lblNewLabel = new JLabel("\u00DCbernommene Koeffizienten:");
		panelAusgabe.add(lblNewLabel);
		
		textField_7 = new JTextField();
		panelAusgabe.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Horner Summanden");
		panelAusgabe.add(lblNewLabel_3);
		
		textField_5 = new JTextField();
		panelAusgabe.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Horner Summe");
		panelAusgabe.add(lblNewLabel_4);
		
		textField_6 = new JTextField();
		panelAusgabe.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Gleichung");
		panelAusgabe.add(lblNewLabel_5);
		
		textField_8 = new JTextField();
		panelAusgabe.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panelBottom = new JPanel();
		contentPane.add(panelBottom, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Neu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickedNeu();
			}
		});
		panelBottom.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Beenden");
		panelBottom.add(btnNewButton_1);
		
		textField = new JTextField();
		panelBottom.add(textField);
		textField.setColumns(20);
	}


	protected void clickedNeu() {
		System.out.println("Neu geklickt");
		
	}


	protected void clickedUebernehmen() {
	     System.out.println("ClickedUebernehmen");
		
	}

}
