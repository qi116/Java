package jrJava.studying_string_3;

public class Practice1 {
	public static void main(String[] args){
		Thing t1 = new Thing(100, 210);
		Thing t2 = new Thing(100, 210);
		System.out.println(t1 == t2); //mutable objects make 2
		
		String a1 = "123";
		String a2 = "123";
		System.out.println(a1 == a2); //unmutable make 1
		
		Integer b1 = 123;
		Integer b2 = 123;
		System.out.println(b1 == b2); //unmutable
		
	}
}
