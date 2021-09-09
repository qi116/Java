package game.thing;
import java.awt.*;
public class Bar {
	private int x, w;
	public final int y = 500, h = 10;
	
	public Bar(int w){ 
		this.w = w;
	}
	public void draw(Graphics g){
		g.setColor(Color.black);
		g.fillRect(x,y,w,h);
	}
	public int getX(){
		return x;
	}
	public int getW(){
		return w;
	}
	public void setX(int a){
		this.x = a;
	}
	
}
