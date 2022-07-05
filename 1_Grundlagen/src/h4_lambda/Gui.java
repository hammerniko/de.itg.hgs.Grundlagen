package h4_lambda;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui  {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(new Dimension(200,200));
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JButton bt = new JButton("Klick mich");
		bt.addActionListener(e -> System.out.println("geklickt"));
		
		
		
		frame.add(bt);
		
	}

}
