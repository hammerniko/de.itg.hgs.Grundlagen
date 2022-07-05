package L1_2048;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;

public class MyLabel extends JLabel {
	
	private static final int SIZE = 50;

	public MyLabel() {
		
		setBackground(Color.YELLOW);
		setOpaque(true);
		setPreferredSize(new Dimension(SIZE,SIZE));
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 20);
		setFont(font);
		setHorizontalAlignment(JLabel.CENTER);
		setWert(2);
		
	}

	private void setWert(int i) {
		this.setText(""+i);
		
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.rotate(.3);
		
		
		g2d.setColor(Color.CYAN);
		g2d.drawLine(0, 0, SIZE, SIZE);
	
		g2d.setColor(Color.red);
		g2d.drawLine(0, SIZE, SIZE, 0);
		
		
	
	}
	
	

}
