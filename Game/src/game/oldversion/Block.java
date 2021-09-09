package game.oldversion;

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
	public boolean isHitBy(Ball ball){
		//Condition
		return false;
	}
	public void draw(Graphics g){
		int r = (int)(Math.random()*256);
		int g2 = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		color = new Color(r, g2, b);
		g.setColor(color);
		g.drawRect(x, y, l, w);
	}
}
