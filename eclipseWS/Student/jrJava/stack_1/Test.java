package jrJava.stack_1;

public class Test {

	public static void main(String[] args) {
		char[] x = new char[3];
		Stack stack = new Stack(x);
		
		stack.push('a');
		stack.push('b');
		stack.push('c');
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
