package animation.frame;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	private int rad, vx, vy, x = 100, y = 100; 
	private Color color;
	private int count = 0;
	public Ball(int rad, int vx, int vy){
		this.rad = rad;
		this.vx = vx;
		this.vy = vy;
	}
	public void draw(Graphics g){
		if(count%10 == 0){
		int r = (int)(Math.random() * 256);
		int gr = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 100);
		color = new Color(r,gr,b);
		}
		g.setColor(color);
		
		g.fillOval(x, y, rad, rad);
		count++;
	}
	public void move(){
		if(x-rad <= 0 || x+rad>= Wall.w ) x();
		if(y-rad <= 0 || y+rad >= Wall.h) y();
		x+= vx;
		y+= vy;
	}
	public void x(){
		vx = -vx;
	}
	public void y(){vy = -vy;}
}
