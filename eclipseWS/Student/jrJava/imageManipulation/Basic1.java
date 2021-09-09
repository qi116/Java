package jrJava.imageManipulation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Basic1 {
	public static void main(String[] args) throws IOException {
		
		BufferedImage bimg = new BufferedImage(600, 400, BufferedImage.TYPE_INT_ARGB);
		
		/*
		 * bimg.setRGB(3, 2, 0xff00ff00);
		bimg.setRGB(3, 1, 0xff00ff00);

		bimg.setRGB(4, 1, 0xff00ff00);
		bimg.setRGB(4, 2, 0xff00ff00);*/
		
		for (int i = 0; i < bimg.getWidth(); i++) {
			for (int j = 0; j < bimg.getHeight(); j++) {
				int green = i/3;
				int red = j/2;
				bimg.setRGB(i, j, 0xff000000 | (green<<8) | (red<<16));
				
			}
		}
		
		
		ImageIO.write(bimg, "png", new File("jrJava/imageManipulation/test1.png"));
		

	}
	
}
