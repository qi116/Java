package jrJava.exceptionHandling;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		System.out.println("Point 1");
		
		String msg = "Hello";
		int[] values = {1,2,3,4};
		String quantity = "413";
		
		doWork(msg, values, quantity);
		
		System.out.println("Point 4");
	}
	
	public static void doWork(String msg, int[] values, String quantity) {
		System.out.println("Point 2");
		
		try{
			System.out.println("msg length: " + msg.length());
			System.out.println("the value at 4 is: " + values[3]);
			System.out.println("The number is: " + Integer.parseInt(quantity));
		}
		catch(NullPointerException e1){
			
		}
		catch(IndexOutOfBoundsException e2){
			
		}
		catch(NumberFormatException e3){
			
		}
	
		
		System.out.println("Point 3");
	}
}
