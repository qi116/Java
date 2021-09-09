package jrJava.stack_1;

import java.util.EmptyStackException;

public class Stack {
	private char[] array;
	private int index;
	
	public Stack(char[] array){
		this.array = array;
		index = -1;
	}
	
	public void push(char ch){ //add to stack
		if(index == array.length-1) throw new IndexOutOfBoundsException();
		array[++index] = ch;
		
	}
	
	public char pop(){//look and remove
		if(index == -1)throw new EmptyStackException();
		return array[index--];
	}
	
	public char peek(){//look w/o remove
		if(index == -1)throw new EmptyStackException();
		return array[index];
	}
}
