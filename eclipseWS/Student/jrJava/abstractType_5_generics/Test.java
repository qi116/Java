package jrJava.abstractType_5_generics;

public class Test {

	public static void main(String[] args) {
		
		Integer[] aaa = {5, 3, 1, 4, 2};
		
		StatDataStructure<Integer> s = new StatDataStructure<Integer>();
		s.setData(aaa);
		
		System.out.println(s.min());
		System.out.println(s.average()); 
	}

}
