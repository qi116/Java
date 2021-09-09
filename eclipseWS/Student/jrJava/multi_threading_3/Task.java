package jrJava.multi_threading_3;

public class Task implements Runnable {
	private Calculator calculator;
	private int target;
	
	
	public void setCalculator(Calculator calculator, int target){
		this.calculator = calculator;
		this.target = target;
	}
	
	public void run(){
		if(target == 0)calculator.calculateSum();
		else calculator.calculateSquareSum(); 
		
	}
}
