package Classroom;

public class MissingElementsinAnArray {

	public static void main(String[] args) {
		
		int[] inputArray = {1, 2, 3, 4, 6, 7, 8, 10, 11};
		
		for (int i = 0, j = i + 1; i < inputArray.length; i++, j++) {
			
			if( j  != inputArray[i])
			{
				System.out.println("Missing number is "+j);
				break;
			}
			System.out.println("i value "+i);
			System.out.println("j value "+j);
			
		}
		

	}

}
