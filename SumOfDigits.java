package day1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number :");
		int input = s1.nextInt();
		
		while (input > 9) {
			sum = (input%10) + sum;
			input = input/10;
			
		}
		
		System.out.println("The sum of digits = " +sum);
		

	}

}
