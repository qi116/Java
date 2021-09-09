package jrJava.tree_DrawableNode;

public class Node<T> {

	protected T obj;
	
	protected Node<T> left;
	protected Node<T> right;
	
	public Node(T obj){
		this.obj = obj;
	}
	
	public T getValue(){ return obj; }
	
	public Node<T> getLeft(){ return left; }
	public Node<T> getRight(){ return right; }
	public void setLeft(Node<T> left){ this.left = left;  }
	public void setRight(Node<T> right){ this.right = right; }
	
	public String toString(){
		return obj.toString();
	}
	
}
