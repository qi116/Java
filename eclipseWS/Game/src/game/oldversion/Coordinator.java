package game.oldversion;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Coordinator extends JPanel implements MouseMotionListener, ActionListener{
	public static Bar bar;
	public static JFrame frame;
	public static JButton btn;
	private static boolean start,moved;
	private static int currX;
	private static Ball ball;
	private static int ballRad = 50 , ballVX = 5, ballVY = 5;
	
	public static void main(String[] args) {
		Coordinator frame = new Coordinator();
		while(true){
			if(ball!= null &&ball.isDead()){
				ball = null;
			}
			if(ball!=null){
				ball.move();
				frame.repaint();
				
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}
	
	public Coordinator(){
		frame = new JFrame();
		frame.setBounds(50,50,800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		this.addMouseMotionListener(this);
		
		btn = new JButton("Restart");
		this.add(btn);
		btn.addActionListener(this);
		
		bar = new Bar(80);
		ball = new Ball(ballRad, ballVX,ballVY);
		
		
		frame.setVisible(true);
	}
	@Override
	public void mouseDragged(MouseEvent e) {}

	public void mouseMoved(MouseEvent e) {
		bar.setX(e.getX()- bar.getW()/2);
		
		frame.repaint();
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		bar.draw(g);
		if(ball!=null)ball.draw(g);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		ball = new Ball(ballRad, ballVX,ballVY);

	}

}
