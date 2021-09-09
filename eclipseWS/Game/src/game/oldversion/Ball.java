package game.oldversion;

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
	public boolean didHitBar(Bar bar){
		if((y>=bar.y-rad && y<=bar.y+bar.h)  &&(x>=bar.getX()-rad && x<= bar.getX()+bar.getW())){//error
			
			return true;

		}
		return false;
	}
	public boolean isDead(){
		if(y>=600){
			return true;
			
		}
		return false;
	}
	public boolean didHitTop(){
		if(y<=0)return true;
		return false;
	}
	public boolean didHitSide(){
		if(x>=800||x+2*rad<=0)return true;
		return false;
	}
	public void move(){
		if(didHitBar(Coordinator.bar)){
			if(vy>0)vy = -vy;
		}
		
		else if(didHitTop()){
			vy = - vy;
		}
		if(didHitSide())vx = -vx;
		x+= vx;
		y+= vy;
	}

	public void x(){
		vx = -vx;
	}
	public void y(){vy = -vy;}
}
