package E2_GuiLottoUebung;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class GuiLotto extends JFrame {
    
    public static final int SCHRIFTGROESSE = 24;
    public static final int ANZAHL_ZAHLEN = 7;
    
    
    //Schriftart
    Font font = new Font("Courier", Font.BOLD, SCHRIFTGROESSE);
    JPanel jContentPane;
    JPanel jpanelButtons;
    JPanel jpanelZahlen;
    JLabel jlabelZahlen[];
    JButton buttonZiehen;
    JButton buttonLoeschen;
    JMenuBar jmenubar;
    JMenu jmenuDatei;
    JMenu jmenuBearbeiten;
    JMenu jmenuHilfe;
    JMenuItem jmenuItemLaden;
    JMenuItem jmenuItemSpeichernUnter;
    JMenuItem jmenuItemStatistikErzeugen;
    JMenuItem jmenuItemLottozahlenZiehen;
    JMenuItem jmenuItemLottozahlenLoeschen;
    JMenuItem jmenuItemUeber;
    
    
    public  GuiLotto() {
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initMenu();
        initComponents();
        initListeners();
      }


    public void initListeners() {
        buttonLoeschen.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               clickedButtonLoeschen();
                
            }
        });
        
        
        buttonZiehen.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                clickedButtonZiehen();
                
            }
        });
        
        jmenuItemLottozahlenLoeschen.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                clickedButtonLoeschen();
                
            }
        });
        
        jmenuItemLottozahlenZiehen.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                clickedButtonZiehen();
                
            }
        });
    }


    protected void clickedButtonZiehen() {
        System.out.println("Ziehen klicked");
        setLottoZahlen();
        
    }


    protected void clickedButtonLoeschen() {
        System.out.println("L�schen klicked");
        jlabelZahlen[0].setText(" - ");
        jlabelZahlen[1].setText(" - ");
        jlabelZahlen[2].setText(" - ");
        jlabelZahlen[3].setText(" - ");
        jlabelZahlen[4].setText(" - ");
        jlabelZahlen[5].setText(" - ");
        jlabelZahlen[7].setText(" - ");
        
    }


    public void initComponents() {
        
       
        jContentPane = new JPanel();
        jContentPane.setLayout(new BorderLayout());
        jpanelButtons = new JPanel();
        jpanelZahlen = new JPanel();
        jlabelZahlen = new JLabel[ANZAHL_ZAHLEN+1]; //Darstellung des Textes SZ: in eigenem jLabel
        buttonLoeschen = new JButton("L�schen");
        buttonZiehen = new JButton("Ziehen");
          
        jContentPane.add(jpanelButtons,BorderLayout.SOUTH);
        jContentPane.add(jpanelZahlen, BorderLayout.CENTER);
        
        jpanelButtons.add(buttonZiehen);
        jpanelButtons.add(buttonLoeschen);
        
        
        //Lottozahlen in JLabels dartsellen
        for (int i = 0; i < jlabelZahlen.length; i++) {
            jlabelZahlen[i] = new JLabel(" - ");
            
            if(i==6){
                jlabelZahlen[6]=new JLabel("|SZ: ");
            }
            
            jlabelZahlen[i].setFont(font);
            jpanelZahlen.add(jlabelZahlen[i]);
        }
        
        //Rand um Lottozahlen
        jpanelZahlen.setBorder(new BevelBorder(BevelBorder.LOWERED));
        
        
        //Superzahl mit gelbem Hintergrund
        jlabelZahlen[7].setOpaque(true);
        jlabelZahlen[7].setBackground(Color.YELLOW);
        
        
      
                
        this.setContentPane(jContentPane);
        this.pack();
    }


    public void initMenu() {
        jmenubar = new JMenuBar();
        jmenuDatei = new JMenu("Datei");
        jmenuBearbeiten = new JMenu("Bearbeiten");
        jmenuHilfe = new JMenu("Hilfe");
        
        jmenuItemLaden = new JMenuItem("Lottozahlen laden");
        jmenuItemSpeichernUnter = new JMenuItem("speichern unter");
        jmenuItemStatistikErzeugen = new JMenuItem("Statistik erzeugen");
        jmenuItemLottozahlenLoeschen = new JMenuItem("Lottozahlen l�schen");
        jmenuItemLottozahlenZiehen = new JMenuItem("Lottozahlen ziehen");
        jmenuItemUeber = new JMenuItem("�ber");
        
        jmenubar.add(jmenuDatei);
        jmenubar.add(jmenuBearbeiten);
        jmenubar.add(jmenuHilfe);
        
        jmenuDatei.add(jmenuItemLaden);
        jmenuDatei.add(jmenuItemSpeichernUnter);
        
        jmenuBearbeiten.add(jmenuItemStatistikErzeugen);
        jmenuBearbeiten.addSeparator();
        jmenuBearbeiten.add(jmenuItemLottozahlenZiehen);
        jmenuBearbeiten.add(jmenuItemLottozahlenLoeschen);
        jmenuHilfe.add(jmenuItemUeber);
        
        jmenuItemLaden.setEnabled(false);
        jmenuItemSpeichernUnter.setEnabled(false);
        jmenuItemStatistikErzeugen.setEnabled(false);
        jmenuItemUeber.setEnabled(false);
       
        
        
        this.setJMenuBar(jmenubar);
    }
    
    public void setLottoZahlen(){
        jlabelZahlen[0].setText(" 1 ");
        jlabelZahlen[1].setText(" 5 ");
        jlabelZahlen[2].setText(" 7 ");
        jlabelZahlen[3].setText(" 13");
        jlabelZahlen[4].setText(" 15");
        jlabelZahlen[5].setText(" 49");
        jlabelZahlen[7].setText(" 5 ");
    }
 
}
