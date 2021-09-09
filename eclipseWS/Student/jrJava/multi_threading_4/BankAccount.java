package jrJava.multi_threading_4;

public class BankAccount {
	
	private double balance = 1000000;
	
	public double getBalance(){
		return balance;
	}
	public synchronized boolean withdraw(double a){// if unsynchronized, multiple threads can pass the condition before the balance is subtracted
		if(balance<a || balance == 0){
			
			return false;
		}
		//check shit
		
		try {// this represents the middle code
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance -= a;
		return true;
	}
}
