package E2_MethodenUndGrafik;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiAddierer extends JFrame {
    
    //Objekte deklarieren
    JLabel jlabelZahl1;
    JLabel jlabelZahl2;
    JLabel jlabelErgebnis;
    JTextField tfZahl1;
    JTextField tfZahl2;
    JButton btBerechne;
    JPanel jpContentPane;
    
    
    //Konstruktor
    public GuiAddierer(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        
        //Objekte erzeugt
        jlabelZahl1 = new JLabel("Zahl1:");
        jlabelZahl2 = new JLabel("Zahl2:");
        tfZahl1 = new JTextField();
        tfZahl1.setColumns(5);
        
        tfZahl2 = new JTextField();
        tfZahl2.setColumns(5);
        tfZahl2.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                clickedButtonBerechne();
                
            }
        });
        
        btBerechne = new JButton("Berechne");
        btBerechne.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                clickedButtonBerechne();
                
            }
        });
        
        
        
        jpContentPane = new JPanel();
        jlabelErgebnis = new JLabel("Ergebnis:");
        
        
        jpContentPane.add(jlabelZahl1);
        jpContentPane.add(tfZahl1);
        
        jpContentPane.add(jlabelZahl2);
        jpContentPane.add(tfZahl2);
        
        jpContentPane.add(btBerechne);
        jpContentPane.add(jlabelErgebnis);
        
        setContentPane(jpContentPane);
                
        
        
    }


    protected void clickedButtonBerechne() {
        
        try {
            //Zahlen einlesen
            String zahl1 = tfZahl1.getText();
            String zahl2 = tfZahl2.getText();
            
            //Zahlen in Double 
            double z1 = Double.parseDouble(zahl1);
            double z2 = Double.parseDouble(zahl2);
            
            //Rechnen
            double erg = z1+z2;
            
            //Ergebnis ausgeben
            jlabelErgebnis.setText("Ergebnis: " +erg);
            
        } catch (NumberFormatException e) {
            jlabelErgebnis.setText("Fehler!!!");
            
        }
    }

}
