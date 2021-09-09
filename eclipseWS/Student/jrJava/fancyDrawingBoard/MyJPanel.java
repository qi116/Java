package jrJava.fancyDrawingBoard;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJPanel extends JPanel {

	private JFrame frame;
	private CircleShape c;
	private SquareShape s;
	
	
	public MyJPanel(int x, int y, int width, int height){
		
		frame = new JFrame("My JPanel");
		frame.setBounds(x, y, width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		this.setPreferredSize(new Dimension(width, height));
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void setAppComponents(CircleShape c, SquareShape s){
		this.c = c;
		this.s = s;
	}
	
	
	public void paintComponent(Graphics g){
		System.out.println("paint(): " + Thread.currentThread().getId()); 
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		c.draw(g);
		s.draw(g);
	}

	
	
} 




