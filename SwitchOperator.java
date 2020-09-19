package day1;

import java.util.Scanner;

public class SwitchOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers:");
		int value1 = s1.nextInt();
		int value2 = s1.nextInt();
		
		System.out.println("Enter the operation : add, sub, mul or div");
		String operation = s1.next();
		

				
		switch (operation) {
		case "add":
				System.out.println("The sum is :"+ (value1 + value2));
			break;
		case "sub":
			System.out.println("The difference is :"+ (value1 - value2));
			 break;
		case "mul":
			System.out.println("The product is :"+ (value1 * value2));
			break;
			
		case "div":
			System.out.println("The division is :"+ (value1 / value2));
			break;

		default:
			System.out.println("Invalid Operation, bye");
			break;
		}
	}

}
