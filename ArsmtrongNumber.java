package Classroom;
import java.util.Scanner;

public class ArsmtrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter an integer");
		int inputData = s1.nextInt();
		int userData = inputData;
		int result = 0;
		while(userData > 0) {
		
			result = result + ((userData%10) * (userData%10) * (userData%10));
			
			userData = userData/10;
		}
		

		System.out.println(result);

		if (result == inputData) 
			System.out.println("Entered number is armstrong number");
		
		else
			System.out.println("Entered number is not armstrong number");
	}
				
	
		

	}


