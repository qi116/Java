package jrJava.studying_wrapper_4;

public class Practice1 {

	public static void main(String[] args) {
		Integer a1 = 123; // auto-boxing
		int a2 = a1 + 123; // auto-unboxing
		Integer a3 = a1 + 111; //auto unboxing
		
		doSomething(a2); 
		
		
	}
	public static void doSomething(Integer a){
		int b = a; //auto unboxing
	}

}
