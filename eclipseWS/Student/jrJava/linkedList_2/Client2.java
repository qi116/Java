package jrJava.linkedList_2;

public class Client2 implements Runnable{

	public LinkedList list;
	public void run(){
		list.reset();
		while(list.hasNext()){
			System.out.println("client2: " +list.next());
		}
	}
		
}
