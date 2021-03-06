package jrJava.recursion2;

public class Palindrome {
	public static void main(String[] args){
		String text = "HELLOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOLLEH";
		System.out.println(isPalindrome(text));
	}
	public static boolean isPalindrome(String text){
		return isPalindrome(text, 0 , text.length()-1);
	}
	public static boolean isPalindrome(String text, int begin, int end){
		
		if(begin >= end) return true;
		
		return  text.charAt(begin) == text.charAt(end)
		 && isPalindrome(text, begin + 1, end - 1);
	}
}
