package I2_MethodenUndGrafik;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class MeinPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        zeichneHaus(g, 10, 10, 50, Color.BLUE);
       
        
    }
    
    
    public void zeichneHaus(Graphics g, int posX, int posY, int breite, Color color){
        g.setColor(color);
        g.drawRect(posX, posY, breite, breite);
        
        
    }

    
    
    
	
	
	
}
