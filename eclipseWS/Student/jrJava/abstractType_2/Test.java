package jrJava.abstractType_2;

public class Test {

	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList();
		
		list.add(new Ball(50, 50));
		list.add(new Ball(150, 150));
		list.add("aaa");
		list.add(new Ball(250, 250));
		list.add(new Ball(350, 350));
		
		
		for(int i=0; i<list.size(); i++){
			((Ball)list.get(i)).getDistance(); 
		}
	}

}
