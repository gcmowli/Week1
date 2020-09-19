package Classroom;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		
		int[] inputArray = {10, 9, 6,1,12,15, 16};

		
		int temp;
		
		for (int i = 0; i < inputArray.length - 2; i++) {
			for (int j = i; j < inputArray.length; j++) {
				if (inputArray[i] > inputArray[j])
				{
					temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
			
		}
		System.out.println("Second Largest number is "+inputArray[inputArray.length-2]);
		
	}

}
