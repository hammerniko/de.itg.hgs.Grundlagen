package TSPMitGUIundMVC;

public class Start {

	public static void main(String[] args) {
		ModelTSP model = new ModelTSP();
		ViewGui view = new ViewGui(); 
		
		ControllerGui controller = new ControllerGui(model, view);
		
		ViewConsole viewConsole = new ViewConsole();
		ControllerConsole controllerConsole = new ControllerConsole(model, viewConsole);

	}

}
