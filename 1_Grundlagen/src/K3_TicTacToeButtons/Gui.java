package K3_TicTacToeButtons;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui extends JFrame{
	
	//Komponenten deklarieren
	JPanel panelMain;
	JPanel panelSteuerung;
	JPanel contentPane;
	
	JButton btNewGame;
	JButton btEsc;
	JButton[][] taste;
	JLabel lbStatus;
	JLabel lbStatusMeldung;
	

	//Standard Konstruktor
	public Gui() {
		initGui();
		addListeners();
		
	}


	private void addListeners() {
		//Listener
		btNewGame.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clickedNewGame();
				
			}
		});
		
		
		btEsc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clickedEsc();
				
			}
		});
		
		
	
		for (int i = 0; i < taste.length; i++) {
			for (int j = 0; j < taste.length; j++) {
				
				final int iVal = i;
				final int jVal = j;
				
				taste[i][j].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						clickedTaste(iVal, jVal);
					}
				});
				
			}
			
		}
		
		
		
	}


	protected void clickedTaste(int i, int j) {
		System.out.println("Clicked "+i+" "+j);
		
	}


	protected void clickedEsc() {
		System.out.println("Esc geklickt");
		
	}


	protected void clickedNewGame() {
		System.out.println("New Game geklickt");
		
	}


	private void initGui() {
		System.out.println("Konstruktor Gui aufgerufen");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setTitle("TicTacToe");
		this.setBounds(100, 100, 640, 480);
		
		//Objekte erstellen
		panelMain = new JPanel();
		panelSteuerung = new JPanel();
		contentPane = new JPanel();
		
		btEsc = new JButton("Esc");
		btNewGame = new JButton("New Game");
		lbStatus = new JLabel("Status:");
		lbStatusMeldung = new JLabel("Willkommen in TicTacToe");
		
		taste = new JButton[3][3];
		
		for (int i = 0; i < taste.length; i++) {
			for (int j = 0; j < taste.length; j++) {
				taste[i][j]=new JButton();
				panelMain.add(taste[i][j]);
				
			}
			
		}
		
		//Layouts einstellen
		contentPane.setLayout(new BorderLayout());
		panelMain.setLayout(new GridLayout(3,3));
		
		//Objekte einenader zuordnen
		contentPane.add(panelMain,BorderLayout.CENTER);
		contentPane.add(panelSteuerung,BorderLayout.SOUTH);
		
		panelSteuerung.add(lbStatus);
		panelSteuerung.add(lbStatusMeldung);
		panelSteuerung.add(btNewGame);
		panelSteuerung.add(btEsc);
		
		//ContentPane
		this.setContentPane(contentPane);
	}
}
