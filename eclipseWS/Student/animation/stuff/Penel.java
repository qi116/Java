package animation.stuff;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Penel extends JPanel implements ActionListener{
	private static JFrame frame;
	private static int w =800,h = 600;
	private static JButton btn;
	private static boolean clicked;
	private static ArrayList<Ball> x;
	public void paintComponent(Graphics g){
		for (int i = 0; i < x.size(); i++) {
			x.get(i).draw(g);;
		}
	}
	public Penel(){
		x = new ArrayList<Ball>();
		frame = new JFrame();
		frame.setBounds(50,50,w,h);
		frame.getContentPane().add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		btn = new JButton("Click dis");
		btn.addActionListener(this);
		this.add(btn);
		
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Penel panel = new Penel();
		while(true){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(clicked){
				
				int vx = (int)(Math.random()*30);
				int vy = (int)(Math.random()*30);
				int rad = (int)(Math.random()*30);
				
				x.add(new Ball(rad, vx, vy, w, h));
			}
			for (int i = 0; i < x.size(); i++) {
				x.get(i).move();
			}
			frame.repaint();
			clicked = false;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		clicked = true;
	}

}
