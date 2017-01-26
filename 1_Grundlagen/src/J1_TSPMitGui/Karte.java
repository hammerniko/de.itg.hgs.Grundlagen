package J1_TSPMitGui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JPanel;

public class Karte extends JPanel implements MouseListener {

	public static final int LINIENDICKE = 3;
	public static final int KREISGROESSE = 40;
	public static final int FONTSIZE = 16;
	private Font font;

	private Vector<Knoten> knoten;
	private Vector<Kante> kanten;
	private int[][] matrix;

	public Karte() {
		font = new Font("default", Font.BOLD, FONTSIZE);
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
		matrix = null;
		repaint();
	}

	private void drawEdges(Graphics g) {
		int x1, x2, y1, y2, posX, posY, distanz;

		// Zeichne Kante
		for (int i = 0; i < kanten.size(); i++) {
			x1 = kanten.elementAt(i).getK1().getX();
			x2 = kanten.elementAt(i).getK2().getX();
			y1 = kanten.elementAt(i).getK1().getY();
			y2 = kanten.elementAt(i).getK2().getY();
			g.setColor(Color.black);
			g.drawLine(x1, y1, x2, y2);

			// Zeichne Distanz
			posX = (x1 + x2) / 2;
			posY = (y1 + y2) / 2;
			distanz = kanten.elementAt(i).calcDistanz();
			g.setColor(Color.BLUE);
			g.drawString("" + distanz, posX, posY);
		}

	}

	private void drawPoints(Graphics g) {
		int x, y;

		for (int i = 0; i < knoten.size(); i++) {
			x = knoten.elementAt(i).getX();
			y = knoten.elementAt(i).getY();
			g.setColor(Color.white);
			g.fillOval(x - (KREISGROESSE / 2), y - (KREISGROESSE / 2),
					KREISGROESSE, KREISGROESSE);
			g.setColor(Color.red);

			g.drawString(knoten.elementAt(i).getName(), x - (FONTSIZE / 2), y);
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

		// G2D Objekt erlaubt mehr Grafikoptionen als das normale Graphics
		// Objekt
		Graphics2D g2 = (Graphics2D) g;

		// Liniendicke Aendern
		g2.setStroke(new BasicStroke(LINIENDICKE));

		// Fette Schrift
		g2.setFont(font);

		// Methode der Oberklasse (JComponent) ausfuehren
		super.paintComponent(g2);

		drawEdges(g);
		drawPoints(g);

	}

	private boolean istKanteDoppelt(Knoten k1, Knoten k2){
		
		boolean value=false;
		
		for (int i = 0; i < kanten.size(); i++) {
			if(kanten.elementAt(i).getK2().getName().equals(k1.getName()) && kanten.elementAt(i).getK1().getName().equals(k2.getName())){
				
				System.out.println("Kante doppelt");
				value= true;
				break;
			}
			
		}
		return value;
		
	}
	public void calcAll() {
		
		Knoten k1,k2;
		// Erzeuge alle Kanten, wenn mind. 2 Knoten vorh. sind
		if (knoten.size() >= 2) {
			for (int i = 0; i < knoten.size() - 1; i++) {
				for (int j = 1; j < knoten.size(); j++) {
					
					//Keine Kante bei gleichen Knoten
					if (i != j) {
						k1=knoten.elementAt(i);
						k2=knoten.elementAt(j);
						//Keine Doppelkanten
						if(!istKanteDoppelt(k1,k2)){
							kanten.addElement(new Kante(k1, k2));
					}}
				}

			}
		}

		// Erzeuge Array für TSP
		matrix = new int[knoten.size()][knoten.size()];

		// Erzeuge Matrixeinträge
		// Jede Kante enthält eine Distanz zwischen 2 Knoten
		// Jeder Eintrag der Matrix enstpricht einer Kante
		System.out.println(kanten);
		
		//Dashes eintargen
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(i==j){
					matrix[j][i]=TSP.DASH;
				}
			}
		}
		
		//Kanten eintragen
		int n=0;
		for (int i = 0; i < matrix.length-1; i++) {
			for (int j = i+1; j < matrix.length; j++) {
				System.out.println(j+","+i);
				matrix[j][i]=kanten.elementAt(n).getDistanz();
				matrix[i][j]=kanten.elementAt(n).getDistanz();
				n++;
			}
		}
		
		TSP.setMatrix(matrix);
		TSP.berechneTSP();

		repaint();
	}

}
