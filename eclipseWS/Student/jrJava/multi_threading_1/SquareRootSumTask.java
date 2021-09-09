package jrJava.multi_threading_1;

public class SquareRootSumTask implements Runnable{

	public void doTask(){
		double sum = 0;
		for (int i = 0; i <= 10; i++) {
			
			sum+=Math.sqrt(i);

			System.out.println("SquareRootSumTask: sum = " + sum);
		}
	}
	@Override
	public void run(){
		doTask();
	}
}
