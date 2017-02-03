package TSPMitGUIundMVC;

import java.util.Observable;
import java.util.Observer;

public class ControllerConsole implements Observer {
	
	ModelTSP model;
	ViewConsole view;
	
	public ControllerConsole(ModelTSP model, ViewConsole view) {
		
		this.model = model;
		this.view = view;
		
		model.addObserver(this);
		
		
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o==model){
			view.consoleOutput(model.getMeldung());
		}
		
	}

}
