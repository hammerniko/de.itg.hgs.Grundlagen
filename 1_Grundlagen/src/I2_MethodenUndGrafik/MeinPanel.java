package I2_MethodenUndGrafik;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MeinPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        zeichneRasen(g, 50);

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

}
