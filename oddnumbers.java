package day1;

import java.util.Scanner;

public class oddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int input = s1.nextInt();
		for (int i = 2; i < input; i++) {
			if (i%2 != 0)
				System.out.println(i);
			
		}
	}

}
