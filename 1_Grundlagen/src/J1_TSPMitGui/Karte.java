package J1_TSPMitGui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JPanel;

public class Karte extends JPanel implements MouseListener{

	Vector<Knoten> knoten;
	Vector<Kante> kanten;
	
	
	public Karte(){
		knoten = new Vector<Knoten>();
		kanten = new Vector<Kante>();
		
		setBackground(Color.green);
		addMouseListener(this);
	}
	
	private void addPoint(MouseEvent e) {
		System.out.println(e);
		int x = e.getX();
		int y = e.getY();
		
		knoten.addElement(new Knoten("A",x,y));
		repaint();
		
	}
	
	private void drawPoints(Graphics g) {
		for (int i = 0; i < knoten.size(); i++) {
			g.drawString(knoten.elementAt(i).getName(), knoten.elementAt(i).getX(), knoten.elementAt(i).getY());
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
		g.drawLine(0, 0, 50, 50);
		
		drawPoints(g);
		
	}

	
	
}
