package animation.stuff;
import java.awt.*;
public class Ball {
	private int x = 100,y = 100 , vx, vy, count;
	private final int rad, wallX, wallY;
	private Color color;
	public Ball(int rad, int vx, int vy, int wallX, int wallY){
		this.rad = rad;
		this.vy = vy;
		this.vx = vx;
		this.wallX = wallX;
		this.wallY = wallY;
	}
	public void move(){
		//Add bounce condition
		if(x+2*rad>=wallX || x<= 0)vx=-vx;
		if(y+2*rad>= wallY-30 || y <=5)vy = -vy;
		x+=vx;
		y+=vy;
	}
	public void draw(Graphics g){
		if(count %10 == 0){
			int r = 0;
			int g2 = (int)(Math.random()*200);
			int b = 0;
			color = new Color(r,g2,b);
			g.setColor(color);
		}
		count++;
		g.fillOval(x,y,2*rad,2*rad);
	}
}
