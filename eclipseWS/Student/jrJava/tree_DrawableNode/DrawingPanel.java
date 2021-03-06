package jrJava.tree_DrawableNode;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.*;

public class DrawingPanel<E> extends JPanel {

	private ArrayList<DrawableNode<E>> nodes = new ArrayList<DrawableNode<E>>();
	
	private JFrame frame;
	private JScrollPane scrollPane;
	private int width, height;
	
	
	public DrawingPanel(int width, int height){
		this.width = width;
		this.height = height;
		
		frame = new JFrame("Tree Graph");
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		frame.setBounds(0, 0, screenWidth-50, screenHeight-50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setPreferredSize(new Dimension(width, height));
		scrollPane = new JScrollPane();
		scrollPane.setViewportView(this);
		
		frame.add(scrollPane);
		frame.setVisible(true); 
		
	}
	
	
	public void addDrawableNode(DrawableNode<E> node){
		nodes.add(node);
	}
	
	
	public void clearDrawableNodes(){ nodes.clear(); }
	
	
	
	public void paintComponent(Graphics g){
		
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.WHITE);
		g.fillRect(0,  0, this.getWidth(), this.getHeight()); 
		
		for(int i=0; i<nodes.size(); i++){
			nodes.get(i).draw(g); 
		}
	}
}










