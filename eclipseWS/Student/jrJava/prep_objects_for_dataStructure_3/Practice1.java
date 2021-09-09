package jrJava.prep_objects_for_dataStructure_3;

import java.awt.Color;

public class Practice1 {

	public static void main(String[] args) {
		int[] num = {11, 25, 125, 11, 289};
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		for (int i = 0; i < num.length - 1; i++) {
			int hold;
			if(num[i]>num[i+1]){
				hold = num[i];
				num[i] = num[i+1];
				num[i+1] = hold;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}	
		
		// --------------------------------------------------------------
		
		Student stu1 = new Student("john", 101, 'A', 2.90, Color.red);
		Student stu2 = new Student("emily", 107, 'B', 3.89, Color.blue);
		
		
		Integer a1 = 102;
		Integer a2 = 154;
		if(a1<a2) System.out.println("DIK");
	}

}
