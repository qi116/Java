package jrJava.sorting_MultipleCriteria;

import java.util.ArrayList;

import jrJava.sorting_bubble.Utility;
import jrJava.sorting_selection.MinFinder;

public class ComplexSorting {
	public static void main(String[] args) {


		int[] data = Utility.fileToArray("jrJava/sorting_bubble/myData.txt");

		Utility.print(data);

		selectionSort(data);

		Utility.print(data);
	}


	public static void bubbleSort(int[] values){
		//split even and odd then sort separately
		boolean sorted = false;
		int i, temp;
		
		while(!sorted){
			sorted = true;
			for(i=0; i<values.length-1; i++){
				if(values[i]%2 == 0&& values[i+1]%2 ==1 || values[i]%2 == values[i+1]%2 && values[i]>values[i+1]){
					sorted = false;
					 temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
				}
			}
		}
		
	}
	public static void selectionSort(int[] data){
		int i, j, temp;

		//Selection Sorting
		//We shrink the window by one every time 
		//[0, length -1] --> [length-2,length-1]
		//first assume that the first element is the smallest
		//Then challenge this by comparing to other elements
		for(i=1; i<data.length; i++){ // changing window from [0, 1] all the way to [0, length-1].
			temp = data[i]; // data[i] is the new guy.
			for(j=i-1; j>=0; j--){
				if(data[j]>temp) data[j+1] = data[j];
				else break;
			}
			
			// Being here means one of the two cases:
			// 1. It found the insertion point, j>=0. So, it broke out of the loop.
			// 2. It could not find the insertion point. j==-1.
			data[j+1] = temp; // insertion.
		}
	}
}
