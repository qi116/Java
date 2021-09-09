package jrJava.sorting_more;

import jrJava.sorting_bubble.Utility;
import jrJava.sorting_selection.MinFinder;

public class DecendingOrderSorter {
	public static void main(String[] args) {
		
		
		int[] data = Utility.fileToArray("jrJava/sorting_bubble/myData.txt");
		
		Utility.print(data);
		
		insertionSort(data);
		
		Utility.print(data);
	}
	
	
	
	 public static void bubbleSort(int[] values){
		boolean sorted = false;
		int i, temp;
		while(!sorted){
			sorted = true;
			for(i=0; i<values.length-1; i++){
				if(values[i]<values[i+1]){
					sorted = false;
					 temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
				}
			}			
		}		
	}
	public static void selectionSort(int[] data){
		//Selection Sorting
		//We shrink the window by one every time 
		//[0, length -1] --> [length-2,length-1]
		//first assume that the first element is the smallest
		//Then challenge this by comparing to other elements
		int min = 0, temp;
		for (int i = 0; i < data.length - 1; i++) {

			int minIndex = MinFinder.minIndex(data, min); //Instead, use a second for loop in order to set min as it's j
			temp = data[min];
			data[min] = data[minIndex];
			data[minIndex] = temp;
			min++;
			
		}
	}
	public static void insertionSort(int[] x){
		
		int i,j,temp;
		
		for (i = 1; i < x.length; i++) {
			temp = x[i];
			for (j = i-1; j >=0; j--) {
				if(temp>x[j])x[j+1]=x[j];
				else break;
			}
			//being here either means you found insertion point or you didn't find the insertion point (j=-1)
			x[j+1]=temp;
		}
		
	}

}
