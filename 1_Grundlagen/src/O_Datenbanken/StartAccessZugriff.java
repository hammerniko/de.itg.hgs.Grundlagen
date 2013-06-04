package O_Datenbanken;

import java.awt.Dimension;
import java.awt.EventQueue;


public class StartAccessZugriff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    
	    //Initialisierung im Event-Dispatcher Thread
	    Runnable  r = new Runnable(){
	        public void run(){
	            ZugriffAufAccess hf = new ZugriffAufAccess();
	            hf.setVisible(true);
	            hf.setSize(new Dimension(800,200));
	        }
	    };
	    
	    EventQueue.invokeLater(r);
	    
	    
	    
	    
		
	}

}
