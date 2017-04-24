package E2_MethodenUndGrafik;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiAddierer extends JFrame {
    
    //Objekte deklarieren
    JLabel jlabelZahl1;
    JLabel jlabelZahl2;
    JLabel jLabelTextErgebnis;
    JLabel jlabelErgebnis;
    JTextField tfZahl1;
    JTextField tfZahl2;
    JButton btBerechne;
    JButton btAbbrechen;
    JPanel panelContentPane;
    JPanel panelEingabe;
    JPanel panelButtons;
    
    JMenuBar jmenubar;
    JMenu jmenuDatei;
    JMenu jmenuBearbeiten;
    JMenuItem jmenuItemOpen;
    JMenuItem jmenuItemBerechne;
    
    
    //Konstruktor
    public GuiAddierer(){
        
        initGui();
        initObjects();
        initMenu();
        
    }


    public void initMenu() {
        jmenubar = new JMenuBar();
        this.setJMenuBar(jmenubar);
        
        jmenuDatei = new JMenu("Datei");
        jmenuItemOpen = new JMenuItem("Öffnen");
        jmenuBearbeiten = new JMenu("Bearbeiten");
        jmenuItemBerechne = new JMenuItem("Berechne");
        
        
        jmenuDatei.add(jmenuItemOpen);
        jmenuBearbeiten.add(jmenuItemBerechne);
        
        jmenubar.add(jmenuDatei);
        jmenubar.add(jmenuBearbeiten);
        
        
        jmenuItemBerechne.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent arg0) {
                clickedButtonBerechne();
                
            }
        });
    }


    public void initObjects() {
        //Objekte erzeugen
        panelEingabe = new JPanel();
        panelButtons = new JPanel();
        panelContentPane = new JPanel();
        
        //Layouteinstellungen für Panels
        panelEingabe.setLayout(new GridLayout(3,3));
        panelButtons.setLayout(new FlowLayout());
        panelContentPane.setLayout(new BorderLayout());
        
        //Komponenten im Eingabepanel erzeugen
        jlabelZahl1 = new JLabel("Zahl1:");
        jlabelZahl2 = new JLabel("Zahl2:");
        tfZahl1 = new JTextField();
        tfZahl1.setColumns(5);
        
        tfZahl2 = new JTextField();
        tfZahl2.setColumns(5);
        jLabelTextErgebnis = new JLabel("Ergebnis:");
        jlabelErgebnis = new JLabel("");
        jlabelErgebnis.setOpaque(true);
        jlabelErgebnis.setBackground(Color.YELLOW);
        
        
        //Komponenten im Buttonpanel erzeugen
        btAbbrechen = new JButton("Abbrechen");
        btBerechne = new JButton("Berechne");
       
        
        //Listener erstellen
        btBerechne.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                clickedButtonBerechne();
            }
        });
        
       
        //Komponenten den Panels hinzufügen
        panelContentPane.add(panelEingabe,BorderLayout.CENTER);
        panelContentPane.add(panelButtons,BorderLayout.SOUTH);
                 
        panelEingabe.add(jlabelZahl1);
        panelEingabe.add(tfZahl1);
        panelEingabe.add(jlabelZahl2);
        panelEingabe.add(tfZahl2);
        panelEingabe.add(jLabelTextErgebnis);
        panelEingabe.add(jlabelErgebnis);
        
        panelButtons.add(btBerechne);
        panelButtons.add(btAbbrechen);
        
        //Hauptpanel setzen
        setContentPane(panelContentPane);
              
        //Minimale Größe einstellen
        this.pack();
    }


    public void initGui() {
        //Prozess beenden, wenn Schliessen Button geklickt wird
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Einfacher Addierer mit Layout");
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
