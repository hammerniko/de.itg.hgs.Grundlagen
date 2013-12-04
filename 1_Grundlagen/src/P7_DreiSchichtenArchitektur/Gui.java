package P7_DreiSchichtenArchitektur;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class Gui extends JFrame implements ActionListener {
	private JPanel	contentPane;
	private JTextField tfX1;
	private JTextField tfX2;
	private JTextField tfY1;
	private JTextField tfY2;
	
	//Assoziation auf Steuerung
	Steuerung dieSteuerung;

	JButton btnNewButton;
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
		
		//Assoziation auf Steuerungsobjekt wird gleich beim
		//erstellen der Gui erzeugt
		dieSteuerung=new Steuerung(this);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnNewButton = new JButton("Zeichne Linie\n");
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Status");
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setOpaque(true);
		panel.add(lblNewLabel_1);
		
		JPanel panelZeichenflaeche = new JPanel();
		panelZeichenflaeche.setBackground(Color.WHITE);
		contentPane.add(panelZeichenflaeche, BorderLayout.CENTER);
		
		JPanel panelEingabe = new JPanel();
		contentPane.add(panelEingabe, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("x1:");
		panelEingabe.add(lblNewLabel_2);
		
		tfX1 = new JTextField();
		panelEingabe.add(tfX1);
		tfX1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("y1:\n");
		panelEingabe.add(lblNewLabel_3);
		
		tfY1 = new JTextField();
		panelEingabe.add(tfY1);
		tfY1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("x2:");
		panelEingabe.add(lblNewLabel_4);
		
		tfX2 = new JTextField();
		panelEingabe.add(tfX2);
		tfX2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("y2:");
		panelEingabe.add(lblNewLabel_5);
		
		tfY2 = new JTextField();
		panelEingabe.add(tfY2);
		tfY2.setColumns(10);
	}

	@Override
    public void actionPerformed(ActionEvent e) {
	    
		if(e.getSource()==btnNewButton){
			
			
			erzeugeLinie();
			
			
			
			
			
			
		}
	    
    }

	private void erzeugeLinie() {
		int x1 = holeX1();
		int y1 = holeY1();
		int x2 = holeX2();
		int y2 = holeY2();
	    
		dieSteuerung.erzeugeLinie(x1, y1, x2, y2);
		
    }

	private int holeY2() {
	    int returnValue = Integer.parseInt(tfY2.getText());
	    return returnValue;
    }

	private int holeX2() {
		int returnValue = Integer.parseInt(tfX2.getText());
	    return returnValue;
    }

	private int holeY1() {
		int returnValue = Integer.parseInt(tfY1.getText());
	    return returnValue;
    }

	private int holeX1() {
		int returnValue = Integer.parseInt(tfX1.getText());
	    return returnValue;
    }
	
	
	public void zeichneLinie(Graphics g, Linie eineLinie){
		
		
		
	}
	
	
}
