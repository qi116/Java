package jrJava.imageManipulation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Basic2 {

	public static void main(String[] args) throws IOException{
		
		BufferedImage bimg = ImageIO.read(new File("jrJava/imageManipulation/darthVader.png"));
		BufferedImage empty = new BufferedImage(bimg.getWidth(), bimg.getHeight(), BufferedImage.TYPE_INT_ARGB);
		int i, j;
		for (i = 0; i < bimg.getWidth(); i++) {
			for (j = 0; j < bimg.getHeight(); j++) {
				if((i+j)%2 == 0){
					empty.setRGB(i, j, bimg.getRGB(i, j));
				}
				else{
					empty.setRGB(i, j, 0x8fff0000);
				}
					
			}
		}
		ImageIO.write(empty, "png", new File("jrJava/imageManipulation/test2.png"));
		
	}

}
