package jrJava.barbarianAttack;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import resources.SoundPlayer;

public class Coordinator {

	public static boolean gameOver;
	public static final int GAME_OVER_X = 1000;
	public static final String PATH = "jrJava/barbarianAttack/imagesAndSounds/";
	
	public static void main(String[] args) {

		FancyDrawingBoard board = new FancyDrawingBoard(0, 0, 1350, 700);
		Graphics2D g = (Graphics2D) board.getBufferedGraphics();
		Graphics2D gT = (Graphics2D) board.getTransGraphics();
		BufferedImage tImage = board.getTImage();
		
		Bow bow = new Bow(1163, 523, 0.3, 45.0);

		board.addMouseListener(bow);
		board.addMouseMotionListener(bow); 
		
		SoundPlayer bgSound = new SoundPlayer(PATH + "jack.wav");
		bgSound.playLoop();
		
		while(!gameOver) {
			
			BarbarianManager.create();
			BarbarianManager.move();
			ArrowManager.move(tImage);
			
			board.clearTrans();
			board.clear();

			ArrowManager.draw(g); 
			BarbarianManager.draw(gT);
			bow.draw(g);
			board.repaint();
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {}
 
		}

		bgSound.stop();
		Image gameOverImage = new ImageIcon(PATH + "bg_gameOver.png").getImage();
		Image gameOverImage2 = new ImageIcon(PATH + "gameOver2.png").getImage();
		gT.drawImage(gameOverImage, 0,  0, null);
		gT.drawImage(gameOverImage2, 400,  300, null);
		board.repaint();
	}
}







