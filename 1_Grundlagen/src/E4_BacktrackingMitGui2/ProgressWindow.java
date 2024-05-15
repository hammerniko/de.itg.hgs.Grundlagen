package E4_BacktrackingMitGui2;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProgressWindow extends JFrame{
	
	public class Panel extends JPanel {
		
		BufferedImage img;
		
		public Panel(BufferedImage img) {
			setVisible(true);
			this.img = img;
		}
		
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, 600, 600, null);
		}
	}
	
	Panel jp;
	
	public ProgressWindow(BufferedImage img) {
		jp = new Panel(img);
		
		add(jp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setUndecorated(true);
		getContentPane().add(jp);
		setVisible(true);
		toFront();
	}
}
