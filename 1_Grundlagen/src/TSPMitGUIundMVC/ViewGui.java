package TSPMitGUIundMVC;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import J1_TSPMitGui.Karte;

public class ViewGui extends JFrame {

	JPanel contentPane;
	Karte karte;
	JPanel buttons;
	JButton btCalc;
	JButton btDelete;
	

	public ViewGui(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initGui();
		setSize(new Dimension(800, 600));
		setVisible(true);
		
	}


	private void initGui() {
		contentPane = new JPanel(new BorderLayout());
		karte = new Karte();
		
		
		btCalc=new JButton("Calc");
		
		//berechneRoute.addActionListener(new ActionListener() {
		//	
		//	@Override
		//	public void actionPerformed(ActionEvent e) {
		//		clickedCalc();
		//		
		//	}
		//});
		
		btDelete= new JButton("delete");
		
		//loeschen.addActionListener(new ActionListener() {
			
		//	@Override
		//	public void actionPerformed(ActionEvent e) {
		//		clickedLoeschen();
				
		//	}
		//});
		
		buttons= new JPanel();
		buttons.setLayout(new FlowLayout());
		buttons.add(btCalc);
		buttons.add(btDelete);
		
		contentPane.add(karte,BorderLayout.CENTER);
		contentPane.add(buttons, BorderLayout.SOUTH);
		
		setContentPane(contentPane);
		
	}


	//protected void clickedCalc() {
		//karte.calcAll();
		
	//}


	//protected void clickedLoeschen() {
		//karte.deletAllPoints();
		
//}
	
	public JButton getBtCalc(){
	 return btCalc;	
	}
	
	public JButton getBtDelete(){
		return btDelete;
	}
	
	

}
