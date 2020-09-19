package day1;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] inputArray = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count = 0;
		
		for (int i = 0; i < inputArray.length - 2; i++) {

			for (int j = i+1; j < inputArray.length; j++) {
				if (inputArray[i] == inputArray[j])
				{
					System.out.println("Duplicate number is "+inputArray[i]);
				}
			}
		}
		
	}

}
