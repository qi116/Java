package animation.frame;

import java.awt.Color;
import java.awt.Graphics;

public class Wall {
	public static int x = 0, y = 0, w = 1000, h = 720;
	public static void draw(Graphics g){
		g.setColor(Color.black);
		g.drawRect(x, y, w, h);
		g.setColor(Color.white);
		g.fillRect(x, y, w, h);
	}
	
}
