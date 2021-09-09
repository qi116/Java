package jrJava.nestedInterface;

public class Test {

	public static void main(String[] args) {
		
		Client c1 = new Client(101);
		Client c2 = new Client(102);
		Client c3 = new Client(103);

		MarketWatcher.getInstance().hasBecomeReady();
		
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {}
		
		MarketWatcher.getInstance().hasDetectedChangesInStatus("AAPL +12");
	}

}
