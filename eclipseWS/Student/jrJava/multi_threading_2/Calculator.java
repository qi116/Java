package jrJava.multi_threading_2;

public class Calculator {

	
	public void calculateSum(){
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum+= i;
			System.out.println("Sum = " + sum);
		}
	}
	
	
}
