package jrJava.queue_2;

public class Queue <E> {

	private E[] values;
	private int front;
	
	public Queue(int size){
		values = (E[]) new Object[size];
		front = -1;
	}
	public void printAll(){//delete later
		for (int i = 0; i <= front; i++) {
			System.out.print(values[i]+"");
		}
		System.out.println();
	}
	
	public void enqueue(E value){
		if(front == values.length-1) throw new IndexOutOfBoundsException();
		values[++front] = value;
	}
	
	public E dequeue(){//shift down after removing
		if(front < 0)throw new IndexOutOfBoundsException();
		E save = values[0];
		for(int i = 1; i <= front; i++){
			values[i - 1] = values[i];
		}
		
		front--;
		return save;
	}
	
	public E peek(){
		if(front == -1) throw new IndexOutOfBoundsException();
		return values[0];
	}
	
	public boolean isEmpty(){
		return front == -1;
	}
}







