package E4_Backtracking_sudokumitGui;

import javax.swing.JTextField;

public class Tile extends JTextField {
	
	int wert;
	
	public Tile(int wert) {
		this.wert=wert;
		setBorder(null);
		setText(""+wert);
		
		if(wert==0) {
			setEnabled(false);
		}
		
	}

	public int getWert() {
		return wert;
	}

	public void setWert(int wert) {
		if(wert>0 && wert <=9) {
			this.wert = wert;
		}
	}

	
	
}
