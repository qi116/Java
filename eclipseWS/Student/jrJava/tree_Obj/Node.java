package jrJava.tree_Obj;

public class Node<E> {

	private int id; // sorting key.
	private E obj;
	
	private Node<E> left;
	private Node<E> right;
	
	
	public E getValue(){return obj;}
	public Node<E> getLeft(){return left;}
	public Node<E> getRight(){return right;}
	public void setLeft(Node<E> node){left = node;}
	public void setRight(Node<E> node){right = node;}
	
	public Node(E obj){
		this.obj = obj;
	}
	
	public String toString(){
		return obj.toString();
	}
}
