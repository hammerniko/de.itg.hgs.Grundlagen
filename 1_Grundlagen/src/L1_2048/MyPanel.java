package L1_2048;

import java.awt.Color;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	Color bgColor;
	MyLabel myLabel;
	
	//Standardkonstruktor
	public MyPanel() {
		myLabel = new MyLabel();
		bgColor = new Color(40, 40, 200);
		this.setBackground(bgColor);
		
		this.add(myLabel);
		
	}

}
