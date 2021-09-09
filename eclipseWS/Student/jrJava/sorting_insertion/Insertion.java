package jrJava.sorting_insertion;

public class Insertion {
	public static void main(String args[]){
		int[] x = {2, 5, 8, 2, 17, 6};
		Utility.print(x);
		insert(x);
		Utility.print(x);
	}
	public static void insert(int[] x){
		int newGuyIndex = x.length-1,temp;
		int j;
		temp = x[newGuyIndex];
		for (j = newGuyIndex-1; j >0; j--) {
			if(temp<x[j]){
				x[j+1] = x[j];
			}
			else{
				break;
			}
			
		}
		x[j+1] = temp;

	}
}
