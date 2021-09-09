package jrJava.sorting_objects;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ball implements Comparable {
	int x,y,rad;
	
	public Ball(int x, int y, int rad){
		this.x = x;
		this.y = y;
		this.rad = rad;
	}
	public Ball(String line){
		StringTokenizer st = new StringTokenizer(line, ", ");
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		rad = Integer.parseInt(st.nextToken());

	}

	@Override
	public int compareTo(Object arg0) {
		Ball arg1 = (Ball) arg0;
		if(rad >arg1.rad) return 1;
		else if(rad < arg1.rad)return -1;
		else{
			int dist1, dist2;
			dist1 = (int) Math.sqrt(x*x + y*y);
			dist2 = (int) Math.sqrt(arg1.x*arg1.x + arg1.y*arg1.y);
			
			if(dist1 > dist2)return 1;
			else if(dist1< dist2 )return -1;
		}
		return 0;
	}
	public String toString(){
		return "x, y: " + x+ ", " + y + " Radius is " + rad + " Distance is " + (int)Math.sqrt(x*x + y*y);
	}
	public boolean equals(Object o){
		Ball n = (Ball)o;
		return n.rad == rad;
		
				
	}
	public int hashCode(){
		return 3;
	}
	public static Ball[] FileToBall(String filePath){
		
		Ball[] balls = null;
		Scanner s;
		int count = 0;
		String line;
		
		try {
			s = new Scanner(new File(filePath));
			while(s.hasNextLine()){
				line = s.nextLine();
				if(line.trim().length()==0) continue;
				count++;
			}
			s.close();
			
			balls = new Ball[count];
			count = 0;
			s = new Scanner(new File(filePath));
			while(s.hasNextLine()){
				line = s.nextLine();
				if(line.trim().length()==0) continue;
				
				balls[count] = new Ball(line);
				count++;
			}
			s.close();
			
			
		} catch (FileNotFoundException e) { }
		
		return balls;
	}
	
}
