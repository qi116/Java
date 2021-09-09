package tankz.v1;
import java.awt.event.*;

import java.awt.*;

import javax.swing.*;
public class Floor extends JPanel implements KeyListener, MouseMotionListener{
	private static JFrame frame;
	private static MyTank me;
	private static Body body;
	private static Gun gun;
	public static void main(String[] args) {
		new Floor();

	}
	public Floor(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0,0,500,400);
		frame.getContentPane().add(this);
		frame.addKeyListener(this);
		frame.addMouseMotionListener(this);

		body = new Body(50,50,50,50, Color.blue);
		gun = new Gun(75,75,50,180,Color.black);
		me = new MyTank(body, gun);

		frame.setVisible(true);
	}
	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));
		me.draw(g2);
	}
	@Override
	public synchronized void  keyPressed(KeyEvent arg0) {
		int id = arg0.getKeyCode();
		
		if(id == KeyEvent.VK_A) {
			
			if(body.vx >0)body.vx = -body.vx;
			me.move();
			frame.repaint();

		}
		if(id == KeyEvent.VK_D) {
			if(body.vx <0)body.vx = -body.vx;
			me.move();
			frame.repaint();

		}
		if(id == KeyEvent.VK_W) {
			if(body.vy > 0)body.vy = -body.vy;
			me.move();
			frame.repaint();

		}
		if(id == KeyEvent.VK_S) {
			if(body.vy < 0)body.vy = -body.vy;
			me.move();
			frame.repaint();

		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {

	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		int sx = e.getX();
		int sy = e.getY();
		
		double nAngle = Math.atan((sy-gun.y)/(sx-gun.x));//check for 4th quadrant
		
		System.out.println(Math.toDegrees(nAngle));
		gun.angle = Math.toDegrees(nAngle);
		frame.repaint();
	}

}
