package tankz.v1;
import java.awt.*;
public class Body {
	private int x, y, w, l; //(w is horizantal)
	private Color color;
	public int vx = 5, vy = 5;
	
	public Body(int x, int y, int w, int l, Color color) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.l = l;
		this.color = color;
	}
	public void move() {
		x += vx;
		y += vy;
	}
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, w, l);
	}
	/*public void moveGun(Gun gun) {
		gun.x+=vx;
		gun.y += vy;
		gun.x2 += vx;
		gun.y2 += vy;
		
		gun.angle += gun.angleChange;
		
	}
*/	
}
