package jrJava.tree_DrawableNode;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class DrawableNode<E> extends Node<E> {

	private int x;
	private int y;
	private static int radius = 20;
	private static Color nodeColor = Color.black , lineColor = Color.gray , textColor = Color.white;
	private static Font font = new Font("Times", Font.BOLD, 12);
	private DrawableNode<E> parent;
	
	
	public DrawableNode(E obj){
		super(obj);
	}
	
	
	public int getX() { return x; }
	public int getY() { return y; }
	public void setXY(int x, int y) { this.x = x; this.y = y; }

	public DrawableNode<E> getParent() { return parent; }
	public void setParent(DrawableNode<E> parent) { this.parent = parent; }

	
	public void draw(Graphics g){
		// 1. draw a line to parent
		if(parent!=null){
			g.setColor(lineColor);
			g.drawLine(x, y, parent.x, parent.y);
		}
		
		// 2. fill the node circle and put a text.
		g.setColor(nodeColor);
		g.fillOval(x-radius, y-radius, 2*radius, 2*radius);
		g.setColor(textColor);
		g.setFont(font);
		g.drawString(obj.toString(), x-10, y+5);
	}
}







