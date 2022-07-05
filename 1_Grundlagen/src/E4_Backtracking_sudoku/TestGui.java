package E4_Backtracking_sudoku;

import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestGui extends JFrame {

	JPanel contentpane;
	JTextField[][] sf;

	public static final int ANZFELDER = 9;

	public TestGui() {
		contentpane = new JPanel();
		this.setTitle("Sudoku HGS");
		createSpielFeld();
		
		this.setContentPane(contentpane);
		this.pack();
	}

	private void createSpielFeld() {
		CreateSudoku.main(null);
		contentpane.setLayout(new GridLayout(ANZFELDER, ANZFELDER));
		JTextField[][] sf= new JTextField[ANZFELDER][ANZFELDER];
		for (int y = 0; y < ANZFELDER; y++) {
			for (int x = 0; x < ANZFELDER; x++) {
				JTextField tf = new JTextField(1);
				
				if(CreateSudoku.s[y][x]!=0){
					tf.setText(""+CreateSudoku.s[y][x]);
					tf.setEditable(false);
				}
				
				
				
				tf.addKeyListener(new KeyAdapter() {
					public void keyTyped(KeyEvent e) {
						tf.setText("");
						char c = e.getKeyChar();
						if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
							e.consume(); // if it's not a number, ignore the event
							System.out.println("consume");
						}
					}

				});
				sf[y][x]=tf;
				contentpane.add(tf);

			}
		}

	}

	
}
