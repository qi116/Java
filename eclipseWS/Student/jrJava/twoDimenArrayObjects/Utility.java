package jrJava.twoDimenArrayObjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utility {

	
	public static void print(Object[] data){
		System.out.println("[" + data[0]);
		for(int i=1; i<data.length-1; i++) System.out.println(" " + data[i]); 
		System.out.println(" " + data[data.length-1] + "]");
		System.out.println();
	}
	
	
	public static Employee[] loadEmployeeArrayFromFile(String filePath){
		
		Employee[] employees = null;
		Scanner s;
		int count = 0;
		String line;
		
		try {
			s = new Scanner(new File(filePath));
			while(s.hasNextLine()){
				line = s.nextLine();
				if(line.trim().length()==0) continue;
				count++;
			}
			s.close();
			
			employees = new Employee[count];
			count = 0;
			s = new Scanner(new File(filePath));
			while(s.hasNextLine()){
				line = s.nextLine();
				if(line.trim().length()==0) continue;
				
				employees[count] = new Employee(line);
				count++;
			}
			s.close();
			
			
		} catch (FileNotFoundException e) { }
		
		return employees;
	}
	public static Employee[][] loadEmployeeDoubleArray(String filePath){
		Employee[] first = loadEmployeeArrayFromFile(filePath);
		Employee[][] second = new Employee[5][];
		second[0] = new Employee[3];
		second[1] = new Employee[4];
		second[2] = new Employee[5];
		second[3] = new Employee[6];
		second[4] = new Employee[7];
		int count = 0,j;
		for (int i = 0; i < second.length; i++) {
			for ( j = 0; j < second[i].length; j++) {
				second[i][j] = first[count];
				count++;
			}
			
		}
		return second;
	}
	public static void printDouble(Object[][] second){
		for (int i = 0; i < second.length; i++) {
			for (int j = 0; j < second[i].length; j++) {
				System.out.print(second[i][j]);
				System.out.println();
			}
			System.out.println("______");
		}
	}
	
}





