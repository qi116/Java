package jrJava.multi_threading_2;

public class Task2 implements Runnable {
	private Calculator calculator;
	
	public void setCalculator(Calculator calc){
		this.calculator = calc;
	}
	public void doTask(){
		calculator.calculateSum();
	}
	public void run(){
		doTask();
	}

}
