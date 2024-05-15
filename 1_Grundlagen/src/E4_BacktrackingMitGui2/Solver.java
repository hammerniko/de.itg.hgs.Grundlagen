package E4_BacktrackingMitGui2;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;


public class Solver {
	
	private int starty;
	private int startx;

	private BufferedImage img;
	private GifSequenceWriter writer;
	
	ProgressWindow jf;
	
	public Solver() throws IOException {
		setFileOrigin();
		setSave();
	}
	
	public void solve() throws IOException {
		jf = new ProgressWindow(img);
		getStart();
		solve(startx, starty);
		jf.setVisible(false);
		jf.dispose();
	}
	
	
	
	private void setFileOrigin() throws IOException {
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		FileNameExtensionFilter png = new FileNameExtensionFilter("PNG Images", "png");
		
		jfc.setAcceptAllFileFilterUsed(false);		
		jfc.setDialogTitle("Choose maze to solve:");
		jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		jfc.addChoosableFileFilter(png);

		if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			img = ImageIO.read(jfc.getSelectedFile());
		}
	}
	
	private void setSave() throws FileNotFoundException, IOException {
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		FileNameExtensionFilter gif = new FileNameExtensionFilter("GIF images", "gif");
		
		jfc.setAcceptAllFileFilterUsed(false);
		jfc.setDialogTitle("Save output gif");
		jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		jfc.addChoosableFileFilter(gif);
		
		if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) 
			writer = new GifSequenceWriter(new FileImageOutputStream(jfc.getSelectedFile()), img.getType(), 5, true);
		writer.writeToSequence(img);
	}
	
	private void getStart() {
		for (int i = 0; i < img.getHeight(); i++) {
			for (int j = 0; j < img.getWidth(); j++) {
				if (isgreen(img.getRGB(j, i))) {
					startx = j;
					starty = i;
				}
			}
		}
	}

	private boolean solve(int x, int y) throws IOException {
		
		if (isred(img.getRGB(x, y)))
			return true;
		img.setRGB(x, y, getcolor(255, 0, 0, 255));

		writer.writeToSequence(img);
		jf.jp.repaint();
		
		if (x + 1 < img.getWidth() && !isblack(img.getRGB(x + 1, y)) && !isvisited(img.getRGB(x + 1, y)))
			if(solve(x + 1, y)) return true;

		if (y + 1 < img.getHeight() && !isblack(img.getRGB(x, y + 1)) && !isvisited(img.getRGB(x, y + 1)))
			if(solve(x, y + 1)) return true;

		if (x - 1 >= 0 && !isblack(img.getRGB(x - 1, y)) && !isvisited(img.getRGB(x - 1, y)))
			if(solve(x - 1, y)) return true;

		if (y - 1 >= 0 && !isblack(img.getRGB(x, y - 1)) && !isvisited(img.getRGB(x, y - 1)))
			if(solve(x, y - 1)) return true;
		
		img.setRGB(x, y, getcolor(255, 255, 255, 0));

		return false;
	}

	private boolean isred(int p) {
		return (((((p >> 16) & 0xff) == 255) && (((p >> 8) & 0xff) == 0) && ((p & 0xff) == 0)));
	}

	private boolean isgreen(int p) {
		return (((((p >> 16) & 0xff) == 0) && (((p >> 8) & 0xff) == 255) && ((p & 0xff) == 0)));
	}

	private boolean isvisited(int p) {
		return (((((p >> 16) & 0xff) == 0) && (((p >> 8) & 0xff) == 0) && ((p & 0xff) == 255))) || (((((p >> 16) & 0xff) == 255) && (((p >> 8) & 0xff) == 255) && ((p & 0xff) == 0)));
	}

	private boolean isblack(int p) {
		return (((((p >> 16) & 0xff) == 0) && (((p >> 8) & 0xff) == 0) && ((p & 0xff) == 0)));
	}

	public int getcolor(int a, int r, int g, int b) {
		return (a << 24) | (r << 16) | (g << 8) | b;
	}


}
