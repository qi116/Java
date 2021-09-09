package jrJava.prep_objects_for_dataStructures_1;

public class Practice1 {

	public static void main(String[] args) {
		Thing[] things = new Thing[3];
		
		things[0] = new Thing(100);
		things[1] = new Thing(200);
		things[2] = new Thing(300);
		
		removeThing(things, 200);
	}
	public static void removeThing(Thing[] things, int value){
		
	}

}
