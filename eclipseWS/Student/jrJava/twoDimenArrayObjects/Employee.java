package jrJava.twoDimenArrayObjects;

import java.util.StringTokenizer;

public class Employee implements Comparable{
	private String firstName, lastName, title;
	private int id, hiredYear, height, weight, salary;
	private char gender;
	private int dobYY, dobMM, dobDD;
	private String line;
	
	public Employee(/*....*/){
		
	}
	public Employee(String line){
		this.line = line;
		StringTokenizer st = new StringTokenizer(line, " ");
		firstName = st.nextToken();
		lastName = st.nextToken();
		id = Integer.parseInt(st.nextToken());
		title = st.nextToken();
		hiredYear = Integer.parseInt(st.nextToken());
		salary = Integer.parseInt(st.nextToken());
		dobYY = Integer.parseInt(st.nextToken());
		dobMM = Integer.parseInt(st.nextToken());
		dobDD = Integer.parseInt(st.nextToken());
		gender = st.nextToken().charAt(0);
		height = Integer.parseInt(st.nextToken());
		weight = Integer.parseInt(st.nextToken());
		
	}
	public String toString(){
		return firstName;
	}
	public boolean equals(Object o){
		return false;
	}
	public int hashCode(){
		return 3;
	}
	@Override
	public int compareTo(Object a) {
		Employee o = (Employee) a;
		/*if(height > o.height)return 1;
		else if(height < o.height)return -1;
		else{
			if(weight > o.weight)return 1;
			else if(weight < o.weight)return -1;
		}
		return 0;*/
		/*if(weight %2 < o.weight%2)return 1;/*even-odd*/
		/*else if(weight %2 < o.weight%2)return -1;
		else{
			if(weight > o.weight)return 1;
			else if(weight < o.weight)return -1;
			else return 0;
		}
		*/
		if(weight > o.weight)return 1;
		else if(weight<o.weight)return -1;
		else{
			return firstName.compareTo(o.firstName);
		}
	}
	
	
}