package jrJava.abstractType_3_generics;

public class Test3 {

	public static void main(String[] args) {
		Storage3 s = new Storage3();
		
		s.setData("aaa");
		String data = (String) s.getData();
	}

}
