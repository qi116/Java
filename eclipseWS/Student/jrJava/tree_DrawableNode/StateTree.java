package jrJava.tree_DrawableNode;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StateTree {

	public static final String DATA_FILE_PATH = "C:\\JrJavaNeon\\eclipseWS\\Student\\jrJava\\tree_DrawableNode\\stateData.txt";
	private static Tree<State> tree;
	
	
	public static void main(String[] args) {
		
		tree = new Tree<State>();
		
		try {
			loadData();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tree.displayGraphically(4000, 3000);
		
		//System.out.println(tree.size());
		//System.out.println(tree.getDepth()); 
		//System.out.println();
		//tree.printInOrder();
		//tree.traverseTopToBottom();
		//System.out.println();
		//tree.printNodesAtLevel(5); 
	}
 
	
	private static void loadData() throws Exception {
		Scanner s = new Scanner(new File(DATA_FILE_PATH));
		
		StringTokenizer st;
		String name, abbr, capital;
		int population, area, yy, mm, dd;
		
		String line = s.nextLine(); // read and waste first line.
		while(s.hasNextLine()){
			line = s.nextLine();
			st = new StringTokenizer(line, " /");
			
			name = st.nextToken();
			abbr = st.nextToken();
			capital = st.nextToken();
			population = Integer.parseInt(st.nextToken());
			area = Integer.parseInt(st.nextToken());
			yy = Integer.parseInt(st.nextToken());
			mm = Integer.parseInt(st.nextToken());
			dd = Integer.parseInt(st.nextToken());
			
			tree.insert(new State(name, abbr, capital, population, area, yy, mm, dd));
		}
		
	}
	
}









