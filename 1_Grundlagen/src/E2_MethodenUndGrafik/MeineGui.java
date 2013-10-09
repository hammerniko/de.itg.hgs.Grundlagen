package E2_MethodenUndGrafik;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MeineGui extends JFrame{
    
    PanelKoordinaten contentPane;
    
    //Konstruktor
    public MeineGui(){
        setTitle("x-y Diagramm");
        contentPane = new PanelKoordinaten();
        setContentPane(contentPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,500,300);
        
    }
    
    public static void main(String[] args){
        MeineGui gui = new MeineGui();
        gui.setVisible(true);
    }

}
