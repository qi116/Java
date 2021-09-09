package jrJava.multi_threading_2;

public class Dispatcher {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Task1 tsk1 = new Task1();
		Task2 tsk2 = new Task2();
		
		tsk1.setCalculator(calculator);
		tsk2.setCalculator(calculator);
		
		Thread t2 = new Thread(tsk1);
		Thread t3 = new Thread(tsk2);
		
		
		t2.start();
		t3.start();
	}

}
