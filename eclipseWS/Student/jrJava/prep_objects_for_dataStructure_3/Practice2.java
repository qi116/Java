package jrJava.prep_objects_for_dataStructure_3;

import java.awt.Color;

public class Practice2 {

	public static void main(String[] args) {
		Student[] studs = new Student[2];
		studs[0] = new Student("John", 100, 'D', 4.02, Color.red);
		studs[1] = new Student("Emily", 111, 'B', 3.98, Color.magenta);
		
		
		if(studs[0].equals(studs[1]))System.out.println("dick");
	}

}
