package jrJava.tree_2;

public class Test {

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		
		tree.insert(1, .01); 
		tree.insert(25, 0.25);
		tree.insert(72, 0.72);
		tree.insert(11, 0.11);
		tree.insert(33, 0.33);
		tree.insert(61, 0.61);
		tree.insert(88, 0.88);
		
		//tree.printTreeInOrder();
		tree.traverseTopToBottom(); 
		
		
	}

}
