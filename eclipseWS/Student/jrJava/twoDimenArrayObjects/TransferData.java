package jrJava.twoDimenArrayObjects;

public class TransferData {
	public static void main(String[] args){
		//Create Employee[]
		//Create Employee[][]
		Employee[] first = Utility.loadEmployeeArrayFromFile("jrJava/twoDimenArrayObjects/employee.txt");
		Utility.print(first);
		
		Employee[][] second = Utility.loadEmployeeDoubleArray("jrJava/twoDimenArrayObjects/employee.txt");
		Utility.printDouble(second);
	}
}
