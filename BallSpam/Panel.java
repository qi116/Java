package animation.frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Panel extends JPanel implements ActionListener{
	private static Panel panel;
	private static JFrame frame;
	private static JButton btn, btn2;
	private static Ball b1, b2;
	private static ArrayList<Ball> balls;
	private static boolean clicked = false;
	private static int rad = 30, vx = 25, vy = 3;

	public void paintComponent(Graphics g){
		Wall.draw(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(
				RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
		Wall.draw(g);
		for(int i = 0; i < balls.size(); i++){
			balls.get(i).draw(g);
		}
	}

	public Panel(){
		frame = new JFrame();
		frame.setBounds(0, 0, 1000, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);


		btn = new JButton("Add ball");
		btn.addActionListener(this);
		btn.setBounds(10, 10, 30, 30);
		this.add(btn);
		btn.setActionCommand("Add");

		
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		panel = new Panel();

		balls = new ArrayList<Ball>();

		while(true){


			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(clicked){
				rad = (int)(Math.random()*30) + 10;
				vx = (int)(Math.random()*30);
				vy = (int)(Math.random()*30);
				balls.add(new Ball(rad, vx, vy));

			}
			for(int i = 0; i< balls.size(); i++){
				balls.get(i).move();
			}

			frame.repaint();
			if(clicked) clicked = false;
			System.out.println(balls.size());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equals("Add")){
			clicked = true;
		}
		
		

	}

}
