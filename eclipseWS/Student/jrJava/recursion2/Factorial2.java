package jrJava.recursion2;

public class Factorial2 {
	public static void main(String[] args){
		System.out.println(factorial(1,3));
	}
	public static int factorial(int begin, int end){
		int mid = (begin + end)/2;
		if(begin == end)return begin;
		return factorial(begin, mid) * factorial(mid+1, end);
	}
}
