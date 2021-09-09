package jrJava.nestedInterface;

import java.util.ArrayList;

public class MarketWatcher {

	// business logic fields;
	// business logic methods;
	
	private ArrayList<Callback> callbacks;
	
	private static MarketWatcher mw; 
	
	public static MarketWatcher getInstance(){
		if(mw==null) mw = new MarketWatcher();
		return mw;
	}
	
	private MarketWatcher(){
		callbacks = new ArrayList<Callback>();
	}
	
	
	public void addCallback(Callback callback){
		callbacks.add(callback);
	}
	
	
	public void removeCallback(Callback callback){
		callbacks.remove(callback);
	}
	
	// Simulation methods:
	public void hasBecomeReady(){
		// made all network connections, authenticated, etc.
		for(int i=0; i<callbacks.size(); i++){
			callbacks.get(i).onReady();
		}
	}
	
	// Simulation methods:
	public void hasDetectedChangesInStatus(String change){
		for(int i=0; i<callbacks.size(); i++){
			callbacks.get(i).onStatusChange(change); 
		}
	}
	
	
	
	public interface Callback {
		void onReady();
		void onStatusChange(String change);
	}
	
}












