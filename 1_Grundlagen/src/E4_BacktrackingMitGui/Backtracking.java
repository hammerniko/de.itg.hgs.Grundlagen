package E4_BacktrackingMitGui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Backtracking {
	public static final int PATH = 0;
	public static final int WALL = 1;
	public static final int START = 2;
	public static final int FINISH = 3;
	static Tile tiles[][];
	static Window window;
	
	private static class Window extends JFrame {
		
		KeyListener onKey = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					int startX = 0, startY = 0;
					for(int x=1;x<15;x++) {	//can skip borders, already disabled
						for(int y=1;y<15;y++) {
							tiles[x][y].setEnabled(false);
							if(tiles[x][y].state == START) {
								startX = x;
								startY = y;
							}
						}
					}
					if(startX + startY == 0) System.out.println("no start");
					Solver s = new Solver(startX, startY);
					s.start();
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {}
		};
		
		private void genTiles() {
			int tWidth = (getWidth() - 50) / 16;
			int tHeight = (getHeight() - 50) / 16;
			
			
			for(int x=0;x<16;x++) {
				for(int y=0;y<16;y++) {
					tiles[x][y] = new Tile();
					if(x==0 || x==15 || y == 0 || y == 15) {
						tiles[x][y].state = WALL;
						tiles[x][y].setBackground(new Color(0, 0, 0));
						tiles[x][y].setEnabled(false);
					}
					tiles[x][y].setSize(tWidth-1, tHeight-1);
					tiles[x][y].setLocation(x*tWidth, y*tHeight);
					add(tiles[x][y]);
					tiles[x][y].setVisible(true);
				}
			}
		}
		
		public Window() {
			setLocationRelativeTo(null);
			setResizable(true);
			setSize(800, 800);
			setLayout(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			addKeyListener(onKey);
			
			
			tiles = new Tile[16][16];
			genTiles();
			
			setVisible(true);
		}
		
	}
	
	private static class Tile extends JButton {
		public int state = PATH;
		public boolean visited = false;
		
		ActionListener onClick = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(state) {
					case PATH:						
						setBackground(new Color(0, 0, 0));
						state = WALL;
						break;
					case WALL:
						setBackground(new Color(200, 50, 50));
						state = START;
						break;
					case START:
						setBackground(new Color(50, 200, 50));
						state = FINISH;
						break;
					case FINISH:
						setBackground(new Color(127, 127, 127));
						state = PATH;
						break;
				}
			}
		};
		
		public void setVisited() {
			visited = true;
			setBackground(new Color(50, 50, 255));
		}
		
		public Tile() {
			addActionListener(onClick);
			setBackground(new Color(127, 127, 127));
			setBorder(null);
			setFocusable(false);
		}
		
	}
	
	private static void reduceIntensity() {
		for(int x=0;x<16;x++) {
			for(int y=0;y<16;y++) {
				if(tiles[x][y].visited == true) {
					int blue = tiles[x][y].getBackground().getBlue();
					int green = tiles[x][y].getBackground().getGreen();
					int red = tiles[x][y].getBackground().getRed();
					if(red<180 && green<180) tiles[x][y].setBackground(new Color(red+10, green+10, blue));
				}
			}
		}
	}
	
	private static class Solver extends Thread {
		private int startY = 0;
		private int startX = 0;
		
		public Solver(int x, int y) {
			startX = x;
			startY = y;
		}
		
		@Override
		public void run() {
			boolean solved = solve(startX, startY);
			System.out.println("solved: " + solved);
		}
		
		public boolean solve(int currentX, int currentY) {
			if(tiles[currentX][currentY].state == FINISH) {
				System.out.println("solved @ " + currentX + " / " + currentY);
				return true;
			}
			tiles[currentX][currentY].setVisited();
			reduceIntensity();
			window.revalidate();
			window.repaint();
			
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				System.out.println("shit");
			}
			
			
			if(currentX > 0) { // Check left
				if(tiles[currentX-1][currentY].visited == false && tiles[currentX-1][currentY].state!=WALL) {
					if(solve(currentX-1, currentY) == true)
						return true;
				}
			}
			
			if(currentY < 15) { // Check below
				if(tiles[currentX][currentY+1].visited == false && tiles[currentX][currentY+1].state!=WALL) {
					if(solve(currentX, currentY+1) == true)
						return true;
				}
			}
			
			if(currentX < 15) { // Check right
				if(tiles[currentX+1][currentY].visited == false && tiles[currentX+1][currentY].state!=WALL) {
					if(solve(currentX+1, currentY) == true)
						return true;
				}
			}
			
			if(currentY > 0) { // Check above
				if(tiles[currentX][currentY-1].visited == false && tiles[currentX][currentY-1].state!=WALL) {
					if(solve(currentX, currentY-1) == true)
						return true;
				}
			}
			return false;
		}
	}
	
	

	public static void main(String[] args) {
		window = new Window();

	}

}
