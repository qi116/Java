package jrJava.linkedList_1_basic;

public class Test2 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(5,  5.5);
		list.insert(9,  9.9);
		list.insert(2,  2.2);
		list.insert(7,  7.7);
		list.insert(3,  3.3);
		list.insert(2,  2.1);
		list.insert(8,  8.8);
		list.insert(1,  1.1);
		
		list.printAll(); 
		
		list.remove(2);
		list.printAll();
		
		list.remove(9);
		list.printAll();
		
		list.remove(1);
		list.printAll();
		
		list.remove(5);
		list.printAll();
	}

}





