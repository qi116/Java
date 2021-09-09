package jrJava.sorting_insertion;

public class InsertionSorter {

	public static void main(String[] args) {
		int[] values = Utility.fileToArray("jrJava/sorting_insertion/myData.txt");
		Utility.print(values);
		sort(values);
		Utility.print(values);
	}

	// Performance:
	// 1. {2, 5, 6, 8, 11, 17}, how many times comparisons? --> (b.c.s.) 1+1+1+1+1
	// 2. {17, 11, 8, 6, 5, 2}, how many times comparisons? --> (w.c.s.) 1+2+3+4+5
	// 3. In array length is n, how many times comparisons? --> (b.c.s.) (n-1)
	//                                                      --> (w.c.s.) 1+2+3+...+(n-1) --> n(n-1)/2 --> ~n*n/2 (quadratic)
	public static void sort(int[] data){
		// Insertion Sorting:
		// We increase the window from [0, 1] all the way to [0, length-1].
		// As we increase the window, a new data will be included in the window (new guy).
		// The new guy will be at the end of the window.
		// All elements except the new guy are in sorted order.
		// Using insertion algorithm, we need to find the insertion point for the new guy.
		
		int i, j, temp;
		// 'i' will be used to change the size of window. 'i' will be the end index of the current window.
		// (window range changes: [0, 1] --> [0, 2] --> ... --> [0, i] --> ... --> [0, length-1].
		// Also, 'i' will be pointing at the new guy's index. (Remember, the new guy is at the end of current window).
		
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


























