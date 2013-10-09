package P1_OOP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MeinButton extends JButton implements ActionListener{
    
    private int wert;
    
    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public MeinButton(){
        wert =-1;
        setZustand();
        addActionListener(this);
    }

    private void setZustand() {
        switch (wert) {
        case 1: setText("X"); break;
        case -1: setText("O");break;
        case 0: setText("");break;


        default:
            break;
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("action");
        wert = wert * -1;
        setZustand();
        repaint();
        
    }
    
    

}
