package E21_MethodenUndGrafik;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JPanel;

public class MeinPanel extends JPanel {

	private Image	          buffer;
	private Graphics2D	      gBuffer;
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
    	loeschen();
        
        zeichneRasen(g, 10);
        //zeichneZaun(g,this.getHeight()-80, 50,15,5);
        //g.drawImage(buffer, 0, 0, this);
		
		// Verzögerung
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
		}
		repaint();
        
        
    }

	private void loeschen() {
		if (buffer == null) {
			buffer = createImage(this.getSize().width, this.getSize().height);
			gBuffer = (Graphics2D) buffer.getGraphics();
		}
		// Zeichenflaeche loeschen
		gBuffer.clearRect(0, 0, this.getSize().width, this.getSize().height);
	}

    public void zeichneRasen(Graphics g, int hoehe) {

        g.setColor(Color.green);
       for (int y = 5; y < 50; y=y+3) {
            for (int i = 0; i < this.getWidth() - 1; i = i + 1) {
                zeichneGrashalm(g, i, y);
            }
       }


    }

    public void zeichneGrashalm(Graphics g, int posX, int hoehe) {
        int deltaFarbe = (int) (Math.random() * 50 + 1); 
        int deltaX = (int) (Math.random() * 15 + 1);
        int deltaHoehe = (int) (Math.random() * 13 + 1);
        Color farbe = new Color(10+deltaFarbe,200+deltaFarbe,55-deltaFarbe);
        g.setColor(farbe);
        
        g.drawLine(posX, this.getHeight() - hoehe, posX + deltaX,
                this.getHeight() - hoehe - deltaHoehe);
    }
    
    public void zeichneZaun(Graphics g, int posY,int hoehe,int lattenbreite, int lueckenbreite){
        g.setColor(new Color(90,90,0));
        
        for (int x = 0; x < this.getWidth() - 1; x = x + lattenbreite+lueckenbreite) {
            zeichneZaunpfahl(g, x, posY,hoehe,lattenbreite);
        }
        
       g.drawRect(0, posY+hoehe/3, this.getWidth(), posY+(hoehe/3)+lattenbreite);
        
    }
    
    public void zeichneZaunpfahl(Graphics g, int posX,int posY, int hoehe,int breite){
        g.fillRect(posX, posY, breite, hoehe);
    }

}
