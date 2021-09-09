package jrJava.sorting_selection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utility {
	public static void print(int[] data) {
		for(int i=0; i<data.length; i++){
			System.out.print(data[i] + "  ");
			if(i!=0&&i%40==0)System.out.println();
		}
		System.out.println("\n");
		
	}
	public static int[] createIntArray(int size){
		int[] x = new int[size];
		for (int i = 0; i < x.length; i++) {
			x[i] = (int)(Math.random()*1000);
		}
		return x;
	}
	public static int[] fileToArray(String filePath){
		File file = new File(filePath);
		int len = 0;
		int[] data;
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextInt()){
				len++;
				scan.nextInt();
			}
			scan.close();
			scan = new Scanner(file);
			data = new int[len];
			len = 0;
			while(scan.hasNextInt()){
				data[len] = scan.nextInt();
				len++;
			}
			scan.close();
			return data;

		} catch (FileNotFoundException e) {		}
		return null;
	}
	
}
