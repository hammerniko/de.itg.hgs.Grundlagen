package E2_MethodenUndGrafik;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelKoordinaten extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        
        
        
        //Koordinatenlinien
        g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
        g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
        
        //Teilstriche
        for (int i = 0; i < getWidth()/2; i++) {
            g.drawLine(getWidth()/2+i*40, getHeight()/2+5, getWidth()/2+i*40, getHeight()/2-5);
            g.drawLine(getWidth()/2-i*40, getHeight()/2+5, getWidth()/2-i*40, getHeight()/2-5);
            g.drawLine(getWidth()/2-5, getHeight()/2+i*40,getWidth()/2+5,getHeight()/2+i*40);
            g.drawLine(getWidth()/2-5, getHeight()/2-i*40,getWidth()/2+5,getHeight()/2-i*40);
        
        //Pfeile
        //g.drawLine(x1, y1, x2, y2)    
            
        }
        
    }
    
    

}
