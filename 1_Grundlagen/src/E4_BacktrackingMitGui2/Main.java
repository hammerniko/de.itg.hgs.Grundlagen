package E4_BacktrackingMitGui2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main {
	
	static int startx;
	static int starty;
	
	static BufferedImage img;
	
	public static void main(String[] args) { 
        File f = null; 
  
        //read image 
        try
        { 
            f = new File("src\\E4_BacktrackingMitGui2\\img.png"); 
            img = ImageIO.read(f); 
        } 
        catch(IOException e) 
        { 
            System.out.println(e); 
        } 
  
        //get image width and height 
        int width = img.getWidth(); 
        int height = img.getHeight();
        
        getStart();
        
        solve(startx, starty);
        
        try
        { 
            f = new File("src\\E4_BacktrackingMitGui2\\out.png"); 
            ImageIO.write(img, "png", f); 
        } 
        catch(IOException e) 
        { 
            System.out.println(e); 
        } 
	}
	
	public static void getStart() {
		int p;
		for (int i = 0; i < img.getHeight(); i++) {
			for (int j = 0; j < img.getWidth(); j++) {
				if (isgreen(img.getRGB(j, i))) {
					startx = j;
					starty = i;
				}	
			}
		}
	}
	
	public static boolean solve(int x, int y) {
		if (isred(img.getRGB(x, y)))
			return true;
		
		img.setRGB(x, y, getcolor(255, 0, 0, 255));
		
		if (x + 1 < img.getWidth() && !iswhite(img.getRGB(x + 1, y)) && !isblue(img.getRGB(x + 1, y)))
			solve(x + 1, y);
		
		if (y + 1 < img.getHeight() && !iswhite(img.getRGB(x, y + 1)) && !isblue(img.getRGB(x, y + 1)))
			solve(x, y + 1);
		
		if (x - 1 >= 0 && !iswhite(img.getRGB(x - 1, y)) && !isblue(img.getRGB(x - 1, y)))
			solve(x - 1, y);
		
		if (y - 1 >= 0 && !iswhite(img.getRGB(x, y - 1)) && !isblue(img.getRGB(x, y - 1)))
			solve(x, y -1);
		
		return false;
	}
	
	public static boolean isred(int p) {
		return (((((p>>16) & 0xff) == 255) && (((p>>8) & 0xff) == 0 ) && ((p & 0xff) == 0)));
	}
	
	public static boolean isgreen(int p) {
		return (((((p>>16) & 0xff) == 0) && (((p>>8) & 0xff) == 255 ) && ((p & 0xff) == 0)));
	}
	
	public static boolean isblue(int p) {
		return (((((p>>16) & 0xff) == 0) && (((p>>8) & 0xff) == 0 ) && ((p & 0xff) == 255)));
	}
	
	public static boolean iswhite(int p) {
		return (((((p>>16) & 0xff) == 255) && (((p>>8) & 0xff) == 255 ) && ((p & 0xff) == 255)));
	}
	
	public static int getcolor(int a, int r, int g, int b) {
		return (a<<24) | (r<<16) | (g<<8) | b;
	}

}
