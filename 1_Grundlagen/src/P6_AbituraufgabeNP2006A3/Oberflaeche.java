package P6_AbituraufgabeNP2006A3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Oberflaeche extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
	private Steuerung dieSteuerung;
	private JPanel contentPane;
	private JButton btnEtikettDrucken;
	private JPanel panel_1;

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
		
		dieSteuerung = new Steuerung(this);
		
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

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEtikettDrucken) {
			System.out.println("Etikett drucken geklickt");
			dieSteuerung.erstelleEtikett(1002);
			
		}

		
	}
	
	public void zeigeEtikett(PanelEtikett etikett){
		contentPane.add(etikett, BorderLayout.CENTER);
		contentPane.revalidate();
	}
}
