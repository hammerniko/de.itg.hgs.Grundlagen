package E4_BacktrackingMitGui2;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class Generator {

	private BufferedImage img;
	private ProgressWindow jf;

	public Generator() throws IOException {
		img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
		makeBlack();

	}

	public void generate() throws IOException {	
		jf = new ProgressWindow(img);
		generate(0, img.getHeight() / 2);
		img.setRGB(0, img.getHeight() / 2, getcolor(255, 0, 255, 0));
		for (int i = img.getWidth() - 1; i >= 0; i--) {
			if (isblack(img.getRGB(img.getWidth()-1, img.getHeight() / 2))) {
				img.setRGB(i, img.getHeight() / 2, getcolor(255, 255, 0, 0));
			}
		}
		saveImg();
		jf.setVisible(false);
		jf.dispose();
	}

	private void makeBlack() {
		for (int i = 0; i < img.getHeight(); i++) {
			for (int j = 0; j < img.getWidth(); j++) {
				img.setRGB(i, j, getcolor(255, 0, 0, 0));
			}
		}
	}

	private boolean generate(int x, int y) throws IOException {
		
		img.setRGB(x, y, getcolor(255, 255, 255, 255));

		jf.jp.repaint();

		while ((x + 2 < img.getWidth() && isblack(img.getRGB(x + 2, y)))
				|| (y + 2 < img.getHeight() && isblack(img.getRGB(x, y + 2)))
				|| (x - 2 >= 0 && isblack(img.getRGB(x - 2, y))) 
				|| (y - 2 >= 0 && isblack(img.getRGB(x, y - 2)))) {

			switch (new Random().nextInt() % 4) {
			case 0:
				if (x + 2 < img.getWidth() && isblack(img.getRGB(x + 2, y))) {
					System.out.println("Right");
					img.setRGB(x + 1, y, getcolor(255, 255, 255, 255));
					if (generate(x + 2, y))
						return true;
				}
				break;
			case 1:

				if (y + 2 < img.getHeight() && isblack(img.getRGB(x, y + 2))) {
					System.out.println("Down");
					img.setRGB(x, y + 1, getcolor(255, 255, 255, 255));
					if (generate(x, y + 2))
						return true;
				}
				break;
			case 2:
				if (x - 2 >= 0 && isblack(img.getRGB(x - 2, y))) {
					System.out.println("Left");
					img.setRGB(x - 1, y, getcolor(255, 255, 255, 255));
					if (generate(x - 2, y))
						return true;
				}
				break;
			case 3:
				if (y - 2 >= 0 && isblack(img.getRGB(x, y - 2))) {
					System.out.println("Up");
					img.setRGB(x, y - 1, getcolor(255, 255, 255, 255));
					if (generate(x, y - 2))
						return true;
				}
				break;
			}
		}

		return false;
	}

	private void saveImg() throws IOException {
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		FileNameExtensionFilter png = new FileNameExtensionFilter("PNG Images", "png");

		jfc.setAcceptAllFileFilterUsed(false);
		jfc.setDialogTitle("Choose save location:");
		jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		jfc.addChoosableFileFilter(png);

		if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			ImageIO.write(img, "png", jfc.getSelectedFile());
		}

	}

	private boolean isblack(int p) {
		return (((((p >> 16) & 0xff) == 0) && (((p >> 8) & 0xff) == 0) && ((p & 0xff) == 0)));
	}

	public int getcolor(int a, int r, int g, int b) {
		return (a << 24) | (r << 16) | (g << 8) | b;
	}
}
