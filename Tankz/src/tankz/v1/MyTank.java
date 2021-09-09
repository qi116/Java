package tankz.v1;

import java.awt.*;

public class MyTank {
	private Body body;
	private Gun gun;
	
	public MyTank(Body body, Gun gun) {
		this.body = body;
		this.gun = gun;
	}
	public void move() {
		body.move();
	}
	public void draw(Graphics g) {
		body.draw(g);
		gun.draw(g);
	}
}
