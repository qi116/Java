package jrJava.twoDimenArray;

public class Practice1 {

	public static void main(String[] args) {

		int[][] a = new int[4][];
		
		a[2] = new int[] {12,-5,3};
		a[3] = new int[] {1,24,700};
		
		
		printMaxMin(a);

	}
	
	public static void print(int[][] data) {
		int i,j;
		if(data == null)return;
		for (i = 0; i < data.length; i++) {
			if(data[i] == null) {
				System.out.println("null");
				continue;
			}
			for ( j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void printMaxMin(int[][]data) {
		int max = Integer.MIN_VALUE  , min = Integer.MAX_VALUE ;
		int i,j;
		if(data == null)return;
		for (i = 0; i < data.length; i++) {
			if(data[i] == null) {
				continue;
			}
			for ( j = 0; j < data[i].length; j++) {
				if(data[i][j]> max)max =data[i][j];
				else if(data[i][j]< min)min =data[i][j];
				
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		
	}
	
	
}
