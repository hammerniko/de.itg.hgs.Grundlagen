package P3_OOPBeispielBidirektionaleAssoziation;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui extends JFrame implements ActionListener {

    // Attribut für die Assoziation von Gui auf Steuerung
    Steuerung dieSteuerung;

    JPanel contentPane;
    JButton meinButton;
    JLabel jLabelStatus;

    public Gui() {
        // Rollenname wird als Objektname übernommen
        // Bei der Erstellung des Steuerung-Objekts wird
        // ein Zeiger auf das eigene Objekt, das Erzeuger-Objekt
        // mit übergeben.
        // Ab diesem Zeitpunkt kennt dieGui dieSteuerung
        dieSteuerung = new Steuerung(this);

        // Oberfläche bauen
        setSize(400, 100);
        contentPane = new JPanel();
        contentPane.setLayout(new FlowLayout());
        meinButton = new JButton("Sende Botschaft an dieSteuerung");
        meinButton.addActionListener(this);
        jLabelStatus = new JLabel("Status:");
        this.setContentPane(contentPane);
        contentPane.add(meinButton);
        contentPane.add(jLabelStatus);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == meinButton) {
            // Botschaft an Steuerung senden
            dieSteuerung.steuerungsTestMethode();
        }
    }

    public void aktualisiereStatus(String str) {
        jLabelStatus.setText(str);
    }
}
