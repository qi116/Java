package jrJava.sorting_bubble;

public class BinarySearch {
	public static void main(String[] args){
		
	}
	public static int search(int[] data, int key){
		int low = 0, high = data.length-1, mid = (low+high)/2;
		while(high!=low){
			if(key>data[mid])low = mid+1;
			else if(key<data[mid])high = mid-1;
			else return mid;
		}
		return -1;
		
	}
}
