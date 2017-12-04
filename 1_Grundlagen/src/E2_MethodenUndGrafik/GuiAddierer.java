package E2_MethodenUndGrafik;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
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

    // Gui Objekte deklarieren
    private JLabel jlabelZahl1;
    private JLabel jlabelZahl2;
    private JLabel jLabelTextErgebnis;
    private JLabel jlabelErgebnis;
    private JTextField tfZahl1;
    private JTextField tfZahl2;
    private JButton btBerechne;
    private JButton btLoeschen;
    private JButton btAbbrechen;
    private JPanel panelContentPane;
    private JPanel panelEingabe;
    private JPanel panelButtons;

    // Menu-Objekte deklarieren
    private JMenuBar jmenubar;
    private JMenu jmenuDatei;
    private JMenu jmenuBearbeiten;
    private JMenuItem jmenuItemOpen;
    private JMenuItem jmenuItemBerechne;

    // Konstruktor
    public GuiAddierer() {
        initGuiEinstellungen();
        initGuiObjects();
        initMenu();
        createListeners();
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
    }

    public void initGuiObjects() {
        // Objekte erzeugen
        panelEingabe = new JPanel();
        panelButtons = new JPanel();
        panelContentPane = new JPanel();

        // Layouteinstellungen für Panels
        panelEingabe.setLayout(new GridLayout(3, 2));
        panelButtons.setLayout(new FlowLayout());
        panelContentPane.setLayout(new BorderLayout());

        // Komponenten im Eingabepanel erzeugen
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

        // Komponenten im Buttonpanel erzeugen
        btAbbrechen = new JButton("Abbrechen");
        btBerechne = new JButton("Berechne");
        btLoeschen = new JButton("Löschen");

        // Komponenten den Panels hinzufügen
        panelContentPane.add(panelEingabe, BorderLayout.CENTER);
        panelContentPane.add(panelButtons, BorderLayout.SOUTH);

        panelEingabe.add(jlabelZahl1);
        panelEingabe.add(tfZahl1);
        panelEingabe.add(jlabelZahl2);
        panelEingabe.add(tfZahl2);
        panelEingabe.add(jLabelTextErgebnis);
        panelEingabe.add(jlabelErgebnis);

        panelButtons.add(btBerechne);
        panelButtons.add(btLoeschen);
        panelButtons.add(btAbbrechen);

        // Hauptpanel setzen
        setContentPane(panelContentPane);

        // Minimale Größe einstellen oder setSize(...)
        // this.pack();
    }

    public void createListeners() {
        // Listener erstellen
        btBerechne.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                clickedButtonBerechne();
            }
        });

        btLoeschen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickedButtonLoeschen();
            }
        });

        btAbbrechen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickedButtonAbbrechen();
            }
        });

        jmenuItemBerechne.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                clickedButtonBerechne();

            }
        });
    }

    protected void clickedButtonAbbrechen() {
        System.exit(DISPOSE_ON_CLOSE);
    }

    protected void clickedButtonLoeschen() {
        jlabelErgebnis.setText("");
        tfZahl1.setText("");
        tfZahl2.setText("");
    }

    public void initGuiEinstellungen() {
        // Prozess beenden, wenn Schliessen Button geklickt wird
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Einfacher Addierer mit Layout");
        this.setSize(300, 200);
        this.setResizable(false);
        this.setLocation(new Point(2200, 500));
    }

    protected void clickedButtonBerechne() {

        try {
            // Zahlen einlesen
            String zahl1 = tfZahl1.getText();
            String zahl2 = tfZahl2.getText();

            // Zahlen in Double
            double z1 = Double.parseDouble(zahl1);
            double z2 = Double.parseDouble(zahl2);

            // Rechnen
            double erg = z1 + z2;

            // Ergebnis ausgeben
            jlabelErgebnis.setText("Ergebnis: " + erg);

        } catch (NumberFormatException e) {
            jlabelErgebnis.setText("Fehler!!!");

        }
    }

}
