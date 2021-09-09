package jrJava.queue_3_circularArray;

public class Test {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>(10);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		q.printAll();
		
		for (int i = 5; i < 20; i++) {
			q.enqueue(i);
			q.dequeue();
			q.printAll();
		}
		
	}

}
