package game.thing;

import java.awt.*;

public class Block {
	private int x, y, l, w;
	private Color color;
	
	public Block(int x, int y, int l, int w){
		this.x = x;
		this.y = y;
		this.l = l;
		this.w = w;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getW(){
		return w;
	}
	public int getL(){
		return l;
	}
	public void draw(Graphics g){
		
		int r = (int)(Math.random()*256);
		int g2 = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		color = new Color(r, g2, b);
		g.setColor(color);
		g.fillRect(x, y, l, w);
	}
}
