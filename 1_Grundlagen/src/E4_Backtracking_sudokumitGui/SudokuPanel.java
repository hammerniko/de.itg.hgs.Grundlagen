package E4_Backtracking_sudokumitGui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Stroke;

import javax.swing.JPanel;

/**
 * Besteht aus 9x9 Tiles mit 
 * Trennlinien für 3x3 Quadraten
 * @author hr
 *
 */
public class SudokuPanel extends JPanel {
	
	int tilewidth=50;
	Tile[][] tiles; 
	
	public SudokuPanel() {
		tiles = new Tile[9][9];
		setPreferredSize(new Dimension(9*tilewidth,9*tilewidth));
	}
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		// TODO Auto-generated method stub
		super.paintComponent(g2d);
		drawlines(g2d);
		
	}




	private void drawlines(Graphics2D g) {
		g.setColor(Color.gray);
		for (int i = 1; i < 9; i++) {
			
			g.drawLine(0,i*tilewidth , 9*tilewidth, i*tilewidth);
			g.drawLine(i*tilewidth,0 , i*tilewidth,9*tilewidth );
		}
		
		g.setColor(Color.BLACK);
		g.setStroke(new BasicStroke((float) 1.5));
		
		for (int i = 0; i < 3; i++) {
			g.drawLine(0,3*i*tilewidth , 9*tilewidth, 3*i*tilewidth);
			g.drawLine(3*i*tilewidth,0 , 3*i*tilewidth,9*tilewidth );
		}
		
	}

}
