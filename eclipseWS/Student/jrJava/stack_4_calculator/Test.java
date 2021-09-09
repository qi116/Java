package jrJava.stack_4_calculator;

public class Test {

	public static void main(String[] args) {
		//String exp = "2.1*4.01+  2^  31.14 /11.4  ";
		//System.out.println(new Calculator(exp).tokenize());

		//String exp = "4*(3-5)/2";
		//String exp = "4*5-30/6"; 
		System.out.println((3.5152 * (14.1+ 2.1*(25.9-11.9/12) + Math.pow(4.2, 2.0)%4.0 + 0.001) + 100.0));
		String exp = "3.5152 * (14.1+ 2.1*(25.9-11.9/12) + 4.2^2.0%4.0 + 0.001) + 100.0";
		
		Calculator cal = new Calculator(exp);
		cal.calculate();
		
	}

}
