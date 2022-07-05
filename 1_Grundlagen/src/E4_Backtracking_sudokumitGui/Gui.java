package E4_Backtracking_sudokumitGui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui extends JFrame{
	public static final String TITEL = "Sudoku";
	JPanel contentpane;
	
	public Gui() {
			
		SudokuPanel s = new SudokuPanel();
		
		this.setTitle(TITEL);
		this.setContentPane(s);
		this.pack();
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
	

}
