package P1_OOP;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiHauptprogramm extends JFrame {
    
    JPanel contentPane;
    JLabel lbBegruessung;
    MeinButton derButton;
    
    public GuiHauptprogramm(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        derButton = new MeinButton();  
        contentPane = new JPanel();
        
        lbBegruessung = new JLabel("Hallole");
        
        contentPane.setLayout(new FlowLayout());
        contentPane.add(lbBegruessung);
        contentPane.add(derButton);
        
        setContentPane(contentPane);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        
        
    }

    
    
    
}
