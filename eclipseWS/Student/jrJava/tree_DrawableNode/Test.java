package jrJava.tree_DrawableNode;

public class Test {

	public static void main(String[] args) {
		
		Tree<String> tree = new Tree<String>();
		
		tree.insert("IA");
		tree.insert("CO");
		tree.insert("MI");
		tree.insert("AK");
		tree.insert("FL");
		tree.insert("KS");
		tree.insert("ND");
		tree.insert("AL");
		tree.insert("AR");
		tree.insert("AZ");
		tree.insert("CA");
		tree.insert("CT");
		tree.insert("DE");
		tree.insert("GA");
		tree.insert("HI");
		tree.insert("ID");
		tree.insert("IL");
		tree.insert("KY");
		tree.insert("LA");
		tree.insert("MN");
		tree.insert("NC");
		tree.insert("NJ");
		tree.insert("NM");
		tree.insert("NY");
		
		tree.traverseTopToBottom();
		System.out.println("depth of tree = " + tree.getDepth());
		System.out.println();
		tree.printNodesAtLevel(2); 
		//tree.printInOrder();
		
		/*
		Tree<Integer> tree = new Tree<Integer>();
		
		tree.insert(15);
		tree.insert(12);
		tree.insert(18);
		tree.insert(10);
		tree.insert(11);
		tree.insert(13);
		tree.insert(14);
		tree.insert(16);
		tree.insert(17);
		tree.insert(19);
		tree.insert(20);
		*/
		
		
	}

}












