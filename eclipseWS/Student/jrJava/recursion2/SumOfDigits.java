package jrJava.recursion2;

public class SumOfDigits {
	public static void main(String[] args){
		System.out.println(sOD(12345));
	}
	public static int sumOfDigits(int number){
		if(number<10) return number;
		return sumOfDigits(number/10) + number%10;
		
	}
	public static int sOD(int number){
		int sum = 0;
		
		while(number != 0){
			sum+=number%10;
			number/=10;
		}
		return sum;
	}
	
	
}
