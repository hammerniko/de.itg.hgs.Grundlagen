package E4_BacktrackingMitGui2;

import java.awt.Graphics;

/********************************************************************
 * 
 * 	Maze Solver for PNG images
 * 
 * 	walls = black
 * 	path = white
 * 	start = green
 * 	finish = red
 * 
 *  Recommended Maze Maker: https://hereandabove.com/maze/mazeorig.form.html
 *  Add start and finish with GIMP, Paint.net, ...
 *  
 *  - David Specht
 *  - 02.10.2020
 *  
 ********************************************************************/

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class Main {

	static int startx;
	static int starty;

	static BufferedImage img;
	static ImageOutputStream out;
	static GifSequenceWriter writer;
	
	static JFrame jf;
	static Progress jp;
	
	public static class Progress extends JPanel {
		
		public Progress() {
			
		}
		
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, 600, 600, null);
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {

		int returnValue;
		
		File f = null;

		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		
		jfc.setAcceptAllFileFilterUsed(false);
		
		jfc.setDialogTitle("Choose maze to solve:");
		jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		FileNameExtensionFilter png = new FileNameExtensionFilter("PNG Images", "png");
		jfc.addChoosableFileFilter(png);

		returnValue = jfc.showOpenDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			f = jfc.getSelectedFile();
		}

		jfc.setDialogTitle("Save output gif");
		FileNameExtensionFilter gif = new FileNameExtensionFilter("GIF images", "gif");
		jfc.addChoosableFileFilter(gif);
		jfc.removeChoosableFileFilter(png);
		returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			out = new FileImageOutputStream(jfc.getSelectedFile());
		}
		
		jf = new JFrame("Solving");
		jp = new Progress();
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(600, 600);
		jf.setUndecorated(true);
		jf.getContentPane().add(jp);

		img = ImageIO.read(f);
		
		jf.setVisible(true);
		
		writer = new GifSequenceWriter(out, img.getType(), 10, true);

		writer.writeToSequence(img);
		
		getStart();

		solve(startx, starty);
		
		writer.close();
		out.close();
		
		jf.setVisible(false);
		jf.dispose();

	}

	public static void getStart() {
		for (int i = 0; i < img.getHeight(); i++) {
			for (int j = 0; j < img.getWidth(); j++) {
				if (isgreen(img.getRGB(j, i))) {
					startx = j;
					starty = i;
				}
			}
		}
	}

	public static boolean solve(int x, int y) throws IOException {
		if (isred(img.getRGB(x, y)))
			return true;
		img.setRGB(x, y, getcolor(255, 0, 0, 255));

		writer.writeToSequence(img);
		jp.repaint();
		
		if (x + 1 < img.getWidth() && iswhite(img.getRGB(x + 1, y)) && !isvisited(img.getRGB(x + 1, y)))
			solve(x + 1, y);

		if (y + 1 < img.getHeight() && iswhite(img.getRGB(x, y + 1)) && !isvisited(img.getRGB(x, y + 1)))
			solve(x, y + 1);

		if (x - 1 >= 0 && iswhite(img.getRGB(x - 1, y)) && !isvisited(img.getRGB(x - 1, y)))
			solve(x - 1, y);

		if (y - 1 >= 0 && iswhite(img.getRGB(x, y - 1)) && !isvisited(img.getRGB(x, y - 1)))
			solve(x, y - 1);
		
		img.setRGB(x, y, getcolor(255, 255, 255, 0));

		return false;
	}

	public static boolean isred(int p) {
		return (((((p >> 16) & 0xff) == 255) && (((p >> 8) & 0xff) == 0) && ((p & 0xff) == 0)));
	}

	public static boolean isgreen(int p) {
		return (((((p >> 16) & 0xff) == 0) && (((p >> 8) & 0xff) == 255) && ((p & 0xff) == 0)));
	}

	public static boolean isvisited(int p) {
		return (((((p >> 16) & 0xff) == 0) && (((p >> 8) & 0xff) == 0) && ((p & 0xff) == 255))) || (((((p >> 16) & 0xff) == 255) && (((p >> 8) & 0xff) == 255) && ((p & 0xff) == 0)));
	}

	public static boolean iswhite(int p) {
		return (((((p >> 16) & 0xff) == 255) && (((p >> 8) & 0xff) == 255) && ((p & 0xff) == 255)));
	}

	public static int getcolor(int a, int r, int g, int b) {
		return (a << 24) | (r << 16) | (g << 8) | b;
	}

}
