package jrJava.fancyDrawingBoard;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FancyDrawingBoard extends JPanel {

	private JFrame frame;
	private BufferedImage bImage;
	private Graphics bufferG; //using buffered img to hold pixels in RAM 
	
	public FancyDrawingBoard(int x, int y, int w, int h){
		frame = new JFrame();
		frame.setTitle("Fancy Drawing Board");
		frame.setBounds(x, y, w, h);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setPreferredSize(new Dimension(w, h));
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
		
		bImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		bufferG = bImage.getGraphics(); // any thread can access this.
	}
	
	public Graphics getBufferedGraphics(){ return bufferG; }
	
	public void paintComponent(Graphics g){
		g.drawImage(bImage, 0, 0, this);
		
	}
	
}









