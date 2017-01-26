package J1_TSPMitGui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JPanel;

public class Karte extends JPanel implements MouseListener {

	Vector<Knoten> knoten;
	Vector<Kante> kanten;

	public Karte() {
		knoten = new Vector<Knoten>();
		kanten = new Vector<Kante>();

		setBackground(Color.green);
		addMouseListener(this);
	}

	private void addPoint(MouseEvent e) {
		System.out.println(e);
		int x = e.getX();
		int y = e.getY();

		knoten.addElement(new Knoten(x, y));
		repaint();

	}

	public void deletAllPoints() {
		knoten.removeAllElements();
		kanten.removeAllElements();
		Knoten.setAnzahl(0);
		repaint();
	}

	private void drawEdges(Graphics g) {
		int x1, x2, y1, y2, posX,posY,distanz;

		//Zeichne Kante
		for (int i = 0; i < kanten.size(); i++) {
			x1 = kanten.elementAt(i).getK1().getX();
			x2 = kanten.elementAt(i).getK2().getX();
			y1 = kanten.elementAt(i).getK1().getY();
			y2 = kanten.elementAt(i).getK2().getY();
			g.drawLine(x1, y1, x2, y2);
			
			//Zeichne Distanz
			posX = (x1 +x2) / 2;
			posY = (y1 +y2) / 2;
			distanz = kanten.elementAt(i).getDistanz();
			g.drawString(""+distanz, posX, posY);
		}
		
		
	}

	private void drawPoints(Graphics g) {
		for (int i = 0; i < knoten.size(); i++) {
			g.drawString(knoten.elementAt(i).getName(), knoten.elementAt(i)
					.getX(), knoten.elementAt(i).getY());
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		addPoint(e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		drawPoints(g);

		drawEdges(g);

	}

	public void calcAll() {
		//Erzeuge alle Kanten, wenn mind. 2 Knoten vorh. sind
		if (knoten.size() >= 2) {
			for (int i = 0; i < knoten.size() - 1; i++) {
				for (int j = 1; j < knoten.size(); j++) {
					kanten.addElement(new Kante(knoten.elementAt(i), knoten.elementAt(j)));
				}
				
			}
		}
		repaint();
	}


}
