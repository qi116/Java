package jrJava.prep_object_for_dataStructures_2;

import java.awt.Color;

public class Student {
	private String name;
	private int id;
	private char classRoom;
	private double gpa;
	private Color fColor;
	
	public Student(String name, int id, char classRoom, double gpa, Color fColor){
		this.name = name;
		this.id = id;
		this.classRoom = classRoom;
		this.gpa = gpa;
		this.fColor = fColor;
	}
	public String toString(){
		return "dick";
	}
	public boolean equals(Object o){
		if(!(o instanceof Student)) return false;
		Student s = (Student) o;
		//return id == s.id;
		return true;
	}
}
