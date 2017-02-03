package TSPMitGUIundMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class ControllerGui implements Observer, ActionListener{

	ModelTSP model;
	ViewGui view;
	
	
	public ControllerGui(ModelTSP model, ViewGui view){
		this.model = model;
		this.view = view;
		
		model.addObserver(this);
		
		//Daten von View Komponenten
		view.getBtCalc().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clickedBtCalc();
				
			}
		});
		
		view.getBtDelete().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clickedBtDelete();
				
			}
		});
		
		
		view.setVisible(true);
		
	}
	
	
	

	protected void clickedBtDelete() {
		System.out.println("clicked delete");
		
	}




	protected void clickedBtCalc() {
		System.out.println("clicked calc");
		model.berechneTSP();
	}




	@Override
	public void update(Observable o, Object arg1) {
		//Wenn das beobachtete Objekt sich geändert hat
		if(o==model){
			//hole Daten aus dem Model
			
			
			//setze Daten in der View
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Wenn eine Aktion war, tu etwas
		//Sende Anweisung an das model zu rechnen
		
	}

}
