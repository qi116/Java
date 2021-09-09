package jrJava.recursion2;

public class Sum2 {

	public static void main(String[] args) {
		System.out.println(sum2(0,3));
	}
	public static int sum2(int n1, int n2){
		int mid = (n1 + n2)/2;
		if(n1 == n2)return n1;
		return sum2(n1, mid) + sum2(mid+1, n2);
		
	}

}
