package jrJava.multi_threading_4;

public class OnlineTeller implements Runnable {
	private BankAccount account;
	
	public void setBankAccount(BankAccount account){
		this.account = account;
	}
	public void withdrawAll(){
		double amount = account.getBalance();
		boolean result = account.withdraw(amount);
		
		if(result){
			System.out.println("$" + amount + " was successfully transferred to your offshore account");
		}
		
	}
	public void run(){
		withdrawAll();

	}
}
