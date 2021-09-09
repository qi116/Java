package jrJava.nestedInterface;


public class Client {

	// fields
	// methods
	
	private int id;
	
	public Client(int cid){
		//mw.addCallback(new CallbackHelper()); // inner class option
		
		//anonymous class option
		MarketWatcher.getInstance().addCallback(  
				new MarketWatcher.Callback() {
					
					public void onReady() {
						System.out.println(id + ": The MW is ready. I need to standby.");
					}

					public void onStatusChange(String change) {
						System.out.println(id + ": I got notified of " + change + ".");
					}
				}
		);
		
		id = cid;
	} 
	
	/*
	// inner class option
	private class CallbackHelper implements MarketWatcher.Callback {

		public void onReady() {
			System.out.println(id + ": The MW is ready. I need to standby.");
		}

		public void onStatusChange(String change) {
			System.out.println(id + ": I got notified of " + change + ".");
		}

	}
	*/
	
}







