package O1_GuiBinaerDezimal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDezimal;
	private JTextField textFieldBinaer;
	private static final int DEZ_TO_BINAER = 0;
	private static final int BINAER_TO_DEZ = 1;
	private int status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		setTitle("Simple Binary Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 147);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panelButtons = new JPanel();
		contentPane.add(panelButtons, BorderLayout.SOUTH);

		JButton btnBerechne = new JButton("Berechne");
		btnBerechne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickedBerechne();
			}
		});
		panelButtons.add(btnBerechne);

		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				clickedAbbrechen();

			}
		});
		panelButtons.add(btnAbbrechen);

		JPanel panelMain = new JPanel();
		contentPane.add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblDezimalzahl = new JLabel("Dezimalzahl");
		panelMain.add(lblDezimalzahl);

		textFieldDezimal = new JTextField();
		panelMain.add(textFieldDezimal);
		textFieldDezimal.setColumns(10);
		textFieldDezimal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				status = DEZ_TO_BINAER;
				clickedBerechne();
			}
		});

		JLabel lblBinaerzahl = new JLabel("Binaerzahl");
		panelMain.add(lblBinaerzahl);

		textFieldBinaer = new JTextField();
		panelMain.add(textFieldBinaer);
		textFieldBinaer.setColumns(10);
		textFieldBinaer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				status = BINAER_TO_DEZ;
				clickedBerechne();
			}
		});
	}

	protected void clickedBerechne() {
		System.out.println("Berechne geklickt");

		// Eingabe
		String strBinaer = textFieldBinaer.getText();
		String strDez = textFieldDezimal.getText();

		try {
			// Verabeitung
			if (status == BINAER_TO_DEZ) {
				int ergDezimal = Integer.parseInt(strBinaer, 2);
				textFieldDezimal.setText("" + ergDezimal);
			} else {
				int dezimalZahlEingabe = Integer.parseInt(strDez);
				String ergBinaer = Integer.toBinaryString(dezimalZahlEingabe);
				textFieldBinaer.setText(ergBinaer);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Falsches Zahlenformat");
		}

	}

	protected void clickedAbbrechen() {
		System.out.println("Abbrechen geklickt");
		textFieldBinaer.setText("");
		textFieldDezimal.setText("");

	}

}
