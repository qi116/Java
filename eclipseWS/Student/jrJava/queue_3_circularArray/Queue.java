package jrJava.queue_3_circularArray;

public class Queue <E>{
	private E[] values;
	private int front, rear, size;//new data is at front; old is at rear
	
	public Queue(int n){
		values = (E[]) new Object[n];
		front = -1;
		rear = 0;
		size = 0;
	}
	public void enqueue(E value){
		if(size == values.length)throw new IndexOutOfBoundsException();
		front++;
		if(front==values.length)front = 0;
		values[front] = value;//can't use preincrement in case of being at end of array 
		size++;
	}
	public E dequeue(){
		if(size == 0)throw new IndexOutOfBoundsException();
		E save = values[rear];
		
		rear++;
		if(rear == values.length)rear = 0;
		size--;
		return null;
		
	}
	public E peek(){
		if(size == 0)throw new IndexOutOfBoundsException();

		return values[rear];
		
	}
	public boolean isEmpty(){
		return size==0;
	}
	public void printAll(){
		for (int i = rear; i <= front; i++) {
			System.out.print(values[i]+ " ");
		}
		System.out.println();
	}
}
