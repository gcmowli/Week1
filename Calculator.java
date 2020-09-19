package Classroom;

import java.util.Scanner;

public class Calculator {
	
	public static  int add(int x, int y) {
		return x + y ;
	}
	
	public static double subtract(  int x, int y) {
		return x - y ;
	}
	
	public static double multiply(double x, double y) {
		return x * y ;
	}
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println("Enter 2 values");
		Scanner s1 = new Scanner(System.in);
		int value1 = s1.nextInt();
		int value2 = s1.nextInt();
		
		System.out.println("Sum of the values :" + calc.add(value1, value2));
		System.out.println("Difference of the values :" + calc.subtract(value1, value2));
		System.out.println("Product of the values : " + calc.multiply(78.9 , 90.4));
		
		
		
	}

}
