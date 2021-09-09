package jrJava.queue_1;

public class Test {

	public static void main(String[] args) {
		Queue q = new Queue(10);
		q.enqueue('a');
		q.printAll();
		q.enqueue('z');
		q.printAll();
		q.enqueue('c');
		q.printAll();
		System.out.println(q.dequeue());
		q.printAll();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
	}

}
