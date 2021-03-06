package jrJava.linkedList_3;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class LinkedList<F> {
	
	

	public Link<F> first;
	
	public LinkedList(){
		first = null; // redundant
	}
	
	public boolean isEmpty(){ 
		return first==null;
	}
	
	public int size(){
		int count = 0;
		Link<F> current = first;
		while(current!=null){
			count++;
			current = current.next;
		}
		return count;
	}
	
	
	public void insertAtBeginning(F data){
		Link<F> link = new Link<F>(data);
		link.next = first;
		first = link;
	}

	
	public F removeFirst(){
		Link<F> temp = first;
		if(first!=null) first = first.next;
		return temp.data;
	}
	
	
	
	/*public void insert(int id, double value){
		Link link = new Link(id, value);
		
		Link current = first;
		Link previous = null;
		
		while(current!=null && current.id<id){
			previous = current;
			current = current.next;
		}
		
		if(previous==null){
			if(first!=null) link.next = first;
			first = link;
		}
		else { 
			previous.next = link;
			link.next = current;
		}
	}*/
	
	
	
	
	
	
	public void add(F data){
		Link<F> link = new Link<F>(data);
		
		if(first==null){
			first = link;
			return;
		}
		
		Link<F> current = first;
		while(current.next!=null){
			current = current.next;
		}
		current.next = link;
	}
	
	
	
	
	
	
	public void printAll(){
		Link<F> current = first;
		while(current!=null){
			System.out.print(current + " ");
			current = current.next;
		}
		System.out.println();
	}
	public class MyIterator implements Iterator<F> {

		Link<F> current;
		Link<F> previous;
		
		
		
		public void reset(){
			current = null;
			previous = null;
		}
		
		public boolean hasNext(){
			if(current==null && previous==null) return first!=null;
			return current.next!=null;
		}
		
		public F next(){
			if(current==null && previous==null){
				current = first;
			}
			else {
				previous = current;
				current = current.next;
			}
			return current.data;
		}
		
		
		public void remove() {   
			if(current==null) throw new NoSuchElementException(); 
			
			if(previous==null){
				first = first.next;
				reset();
			}
			else {
				previous.next = current.next;
				current = previous;
			}
		}
	}
	private class Link<E> {

		public Link<E> next;
		
		public E data;
		
		
		
		public Link(E data){
			this.data = data;
		}
		
		public String toString(){
			return "[" + data + "]";
		}
		
		// what more methods?
	}
}










