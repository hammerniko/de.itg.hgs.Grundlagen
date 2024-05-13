package h4_lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Beispiel der Verwendung einer anonymen inneren Klasse.
 * Über "Quick Fix" kann in Eclipse die Notation in die 
 * Lambda Notation umgewandelt werden (und wieder zurück)
 * Die funktioniert ab der 
 */
public class KA1_lambda_A3 {
	
	public KA1_lambda_A3() {
		JButton butt = new JButton("klick");
		butt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button angeklickt");
			}
		});
	}
	

}
