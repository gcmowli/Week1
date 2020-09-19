package day1;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = s1.nextInt();
		
		int i = 0;
		int j = 1;
		int fiboseries;
		
		System.out.print(i+" ");
		System.out.print(j+" ");
		
		while (i < input ) 
		{
			fiboseries =  i + j; 
			i = j;
			j = fiboseries;
			System.out.print(fiboseries+" ");
			
		}
		
	}

}
