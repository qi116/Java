package jrJava.imageManipulation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Basic5 {

	public static void main(String[] args) throws IOException{
		
		BufferedImage bimg1 = ImageIO.read(new File("jrJava/imageManipulation/transformer.png"));
		BufferedImage bimg2 = ImageIO.read(new File("jrJava/imageManipulation/transformer2.png"));
		
		BufferedImage empty = new BufferedImage(bimg1.getWidth(), bimg1.getHeight(), BufferedImage.TYPE_INT_ARGB);
		int i, j, color1, color2, a, r, g, b;
		double w;
		for (i = 0; i < bimg1.getWidth(); i++) {
			for (j = 0; j < bimg1.getHeight(); j++) {
				color1 = bimg1.getRGB(i, j);
				color2 = bimg2.getRGB(i, j);
				w = (double) i/(bimg1.getWidth() -1);
				a =(int)(w* getAlpha(color1) + (1-w)*getAlpha(color2));
				r =(int)(w*  getRed(color1) + (1-w)*getRed(color2));
				if(r >255)r = 255;
				g =(int) (w* getGreen(color1) + (1-w)*getGreen(color2));
				if(g >255)g = 255;
				b =(int) (w* getBlue(color1) + (1-w)*getBlue(color2));
				if(b >255)b = 255;
				
				
				
				empty.setRGB(i, j, getColor(a,r,g,b));
				
				
			}
		}
		ImageIO.write(empty, "png", new File("jrJava/imageManipulation/transformerfused.png"));
		
	}
	private static int getAlpha(int color){
		return (color>>24)&0xff;
	}
	private static int getRed(int color){
		return (color >> 16)&0xff;
	}
	private static int getGreen(int color){
		return (color >> 8)&0xff;

	}
	private static int getBlue(int color){
		return color &0xff;

	}
	private static int getColor(int a, int r, int g, int b){
		return (a<<24) | (r<<16) | (g<<8) | (b);
		
		
	}

}
