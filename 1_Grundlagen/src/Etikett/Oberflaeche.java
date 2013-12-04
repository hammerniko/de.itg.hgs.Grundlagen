package Etikett;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;

public class Oberflaeche extends JFrame implements ActionListener {

	// public Steuerung dieSteuerung = new Steuerung(this);

	private JPanel contentPane;
	private JButton btnEtikettDrucken;
	private JPanel panel_1;
	private JButton btnErstelleAuftrag;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JTextField tfKundenName;
	private JTextField tfLieferdatum;
	private JTextField tfArtikelNummer;
	private JTextField tfRollengewicht;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Oberflaeche frame = new Oberflaeche();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Oberflaeche() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		btnEtikettDrucken = new JButton("Etikett drucken");
		btnEtikettDrucken.addActionListener(this);
		panel.add(btnEtikettDrucken);

		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);

		btnErstelleAuftrag = new JButton("Auftrag erstellen");
		btnErstelleAuftrag.addActionListener(this);
		panel_1.add(btnErstelleAuftrag);

		panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);

		lblNewLabel = new JLabel("Kundenname");
		tfKundenName = new JTextField("");
		tfKundenName.setColumns(10);

		lblNewLabel_1 = new JLabel("Lieferdatum");
		tfLieferdatum = new JTextField("");
		tfLieferdatum.setColumns(10);

		lblNewLabel_2 = new JLabel("Artikelnummer");
		tfArtikelNummer = new JTextField("");
		tfArtikelNummer.setColumns(10);

		lblNewLabel_4 = new JLabel("Rollengewicht");
		tfRollengewicht = new JTextField("");
		tfRollengewicht.setColumns(10);
		panel_2.setLayout(new GridLayout(4, 2, 0, 0));

		panel_2.add(lblNewLabel);
		panel_2.add(tfKundenName);

		panel_2.add(lblNewLabel_1);
		panel_2.add(tfLieferdatum);

		panel_2.add(lblNewLabel_2);
		panel_2.add(tfArtikelNummer);

		panel_2.add(lblNewLabel_4);
		panel_2.add(tfRollengewicht);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEtikettDrucken) {
			System.out.println("Etikett wurde gedruckt");
		}

		if (e.getSource() == btnErstelleAuftrag) {
			
			System.out.println("Auftrag erstellen gedrückt");
			;
			
			//TODO dieSteuerung.erstelleAuftrag(tfKundenName.getText(),tfArtikelNummer.getText(),03.01.2013);
			
			

		}
	}
}
