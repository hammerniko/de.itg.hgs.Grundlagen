package E4_BacktrackingMitGui2;

import javax.swing.UIManager;

/********************************************************************
 * 
 * 	Maze Solver for PNG images
 * 
 * 	walls = black
 * 	path = white
 * 	start = green
 * 	finish = red
 * 
 *  Recommended Maze Maker: https://hereandabove.com/maze/mazeorig.form.html
 *  Add start and finish with GIMP, Paint.net, ...
 *  
 *  - David Specht
 *  - 02.10.2020
 *  
 ********************************************************************/

public class Main {
	
	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
		MainWindow mw = new MainWindow();
	}
}
