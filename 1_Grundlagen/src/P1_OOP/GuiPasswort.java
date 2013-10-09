package P1_OOP;

import java.awt.Event;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

public class GuiPasswort extends JFrame implements ActionListener {

    // Objekte für die Gui deklarieren
    JPanel contentPane;
    JLabel label1, label2;
    JLabel lbstatus;
    JPasswordField jpfPasswort;
    Passwortpruefer pp;

    // Konstruktor
    public GuiPasswort() {
        // Assoziation zu Passwortprüfer
        pp = new Passwortpruefer();

        // Schliessverhalten und Größe
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(200, 100);

        // Objekte erzeugen
        contentPane = new JPanel();
        label1 = new JLabel("Passwort:");
        label2 = new JLabel("Status:");
        lbstatus = new JLabel();
        jpfPasswort = new JPasswordField();
        jpfPasswort.setColumns(5);
        jpfPasswort.addActionListener(this);

        // Layout für die Contentpane
        contentPane.setLayout(new GridLayout(2, 2));

        // Komponenten zur Contentpane hinzufügen
        contentPane.add(label1);
        contentPane.add(jpfPasswort);
        contentPane.add(label2);
        contentPane.add(lbstatus);

        // Contenpane des JFrame setzen
        setContentPane(contentPane);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jpfPasswort) {
            if (pp.pruefePasswort(jpfPasswort.getText())) {
                System.out.println("Passowrt gültig");

                lbstatus.setText("Passwort gültig");
               

                
                GuiHauptprogramm dasHP = new GuiHauptprogramm();
                dasHP.setVisible(true);
                dispose();
            } else {
                System.out.println("Passwort ungültig");
                lbstatus.setText("Passwort ungültig");
            }
        }

    }

}
