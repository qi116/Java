package tankz.v1;
import java.awt.*;
import java.awt.geom.Line2D;
public class Gun {
	public int rad, x, y, x2, y2;
	public double angle, angleChange = 30;
	private Color color;
	
	public Gun(int x, int y, int rad, double angle, Color color){
		this.x = x;
		this.y = y;
		this.rad = rad;;
		this.angle = angle;
		this.color = color;
		
		
	}
	public void draw(Graphics g) {
		
		x2 = (int)(rad*Math.cos(Math.toRadians(angle))+x);
		y2 = (int)(rad*Math.sin(Math.toRadians(angle))+y);
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(10));
        g2.draw(new Line2D.Float(x, y, x2, y2));
        g.setColor(color);
		g.drawLine(x, y, x2, y2);
	}
	
}
